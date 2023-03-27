package com.itquasar.multiverse.jmacro.commands.base.providers;

import com.itquasar.multiverse.jmacro.core.Command;
import com.itquasar.multiverse.jmacro.core.JMacroCore;
import com.itquasar.multiverse.jmacro.core.command.CommandProvider;
import groovy.lang.Closure;

import javax.script.ScriptEngine;
import java.util.concurrent.*;

public class ParallelCommandProvider implements CommandProvider<ParallelCommandProvider.ParallelCommand> {

    @Override
    public String getName() {
        return "parallel";
    }

    @Override
    public Class<ParallelCommand> getCommandType() {
        return ParallelCommand.class;
    }

    @Override
    public ParallelCommand getCommand(JMacroCore jMacroCore, ScriptEngine scriptEngine) {
        return new ParallelCommand(getName(), jMacroCore, scriptEngine);
    }

    public static class ParallelCommand extends Command {

        public ParallelCommand(String name, JMacroCore core, ScriptEngine scriptEngine) {
            super(name, core, scriptEngine);
        }


        private final String defaultThreadGroup = "parallel";
        private String threadGroup;
        private Executor executor;

        private ConcurrentMap<String, ParallelCommand> instances = new ConcurrentHashMap<>();

        ParallelCommand call() {
            return this.call(0);
        }

        ParallelCommand call(int poolSize) {
            return this.call(poolSize, defaultThreadGroup);
        }

        ParallelCommand call(String threadGroup) {
            return this.call(0, threadGroup);

        }

        ParallelCommand call(int poolSize, String threadGroup) {
            if (this.instances.containsKey(threadGroup)) {
                return this.instances.get(threadGroup);
            } else {
                ThreadFactory threadFactory = new ThreadFactory() {
                    private Integer index = 0;

                    @Override
                    public Thread newThread(Runnable r) {
                        return new Thread(new ThreadGroup(threadGroup), (index++).toString());
                    }
                };
                Executor executor = new ThreadPoolExecutor(
                    0,
                    poolSize > 0 ? poolSize : Runtime.getRuntime().availableProcessors(),
                    60,
                    TimeUnit.SECONDS,
                    new LinkedBlockingQueue<>(),
                    threadFactory
                );
                ParallelCommand parallel = this.threadGroup == null && defaultThreadGroup.equals(threadGroup)
                    ? this
                    : new ParallelCommand(this.getName(), this.getCore(), this.getScriptEngine());
                parallel.executor = executor;
                parallel.threadGroup = threadGroup;
                this.instances.put(threadGroup, parallel);
                return parallel;
            }
        }

        ParallelCommand call(Closure closure) {
            if (this.executor == null) {
                this.call(0, defaultThreadGroup);
            }
            getLogger().info("Executing " + closure + " on parallel group " + this.threadGroup);
            closure.setDelegate(this);
            closure.setResolveStrategy(Closure.DELEGATE_FIRST);
            executor.execute(closure);
            return this;
        }
    }

}
