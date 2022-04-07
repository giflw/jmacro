package com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.project;

import com.itquasar.multiverse.jmacro.commands.datax.commands.com.enums.COMEnum;
import com.jacob.com.Variant;

/**@
  Commands for data extraction

  {@see <a href="https://docs.microsoft.com/en-us/office/vba/api/project.pjcachejobstate">https://docs.microsoft.com/en-us/office/vba/api/project.pjcachejobstate</a>}
*/
public enum PjCacheJobState implements COMEnum {
    
    /**@ The queue job is cancelled. */
    pjCacheJobStateCancelled(9),    
    /**@ The queue job correlation is blocked; the job is not processing. */
    pjCacheJobStateCorrelationBlocked(8),    
    /**@ The queue job failed. */
    pjCacheJobStateFailed(5),    
    /**@ The queue job failed but is not blocking continued processing. */
    pjCacheJobStateFailedNotBlocking(6),    
    /**@ The queue job is not valid. (The hexadecimal value is &HFFFFFFFF.) */
    pjCacheJobStateInvalid(-1),    
    /**@ The queue job state is the same as the previous state. */
    pjCacheJobStateLastState(13),    
    /**@ The queue job is on hold. */
    pjCacheJobStateOnHold(10),    
    /**@ The queue job is processing. */
    pjCacheJobStateProcessing(3),    
    /**@ The queue job is ready for launch. */
    pjCacheJobStateReadyForLaunch(12),    
    /**@ The queue job is ready for processing. */
    pjCacheJobStateReadyForProcessing(1),    
    /**@ The queue job is not completely sent to the Project Server Queue Service. */
    pjCacheJobStateSendIncomplete(2),    
    /**@ The queue job is deferred while another job is being processed. */
    pjCacheJobStateSkipped(7),    
    /**@ The queue job is sleeping. */
    pjCacheJobStateSleeping(11),    
    /**@ The queue job completed successfully. */
    pjCacheJobStateSuccess(4),    
    /**@ The queue job state is unknown. */
    pjCacheJobStateUnknown(0);

    private final long value;

    PjCacheJobState(long value) {
        this.value = value;
    }

    @Override
    public Variant toVariant() {
        return new Variant(this.value);
    }

    @Override
    public long getValue() {
        return this.value;
    }
}
