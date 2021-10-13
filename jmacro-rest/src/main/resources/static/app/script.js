export default {
    name: 'JMScript',
    template: `
        <div class="card">
            <div class="card-header">
                <p class="card-header-title"
                    :title="script.filename + ' | ' + script.uuid">
                    {{ script.metadata.name }}
                </p>
                <button class="card-header-icon has-text-success" @click="runOnce" title="Run once" v-if="!script.running">
                    <span class="icon">
                        <i class="fas fa-play"></i>
                    </span>
                </button>
                <button class="card-header-icon has-text-warning" @click="runLoop" title="Loop run" v-if="!script.running">
                    <span class="icon">
                        <i class="fas fa-redo"></i>
                    </span>
                </button>
                <button class="card-header-icon has-text-danger" @click="stop" title="Stop execution" v-if="script.running">
                    <span class="icon">
                        <i class="fas fa-stop"></i>
                    </span>
                </button>
                <button class="card-header-icon has-text-info" @click="showLog" title="Show log">
                    <span class="icon">
                        <i class="fas fa-scroll"></i>
                    </span>
                </button>
                <button class="card-header-icon" @click="showSource" title="Show source">
                    <span class="icon">
                        <i class="fas" :class="{'fa-angle-down': !viewSource, 'fa-angle-up': viewSource}" aria-hidden="true"></i>
                    </span>
                </button>
            </div>
            <pre v-if="viewSource" class="content">{{ script.source }}</pre>
        </div>
    `,
    props: {
        script: {
            type: Object,
            default: () => {}
        }
    },
    data() {
        return {
            viewSource: false
        }
    },
    methods: {
        showSource() {
            this.viewSource = !this.viewSource
        },
        runOnce() {
            console.log("RUN ONCE", this.script.location)
        },
        runLoop() {
            console.log("RUN LOOP", this.script.location)
        },
        stop() {
            console.log("STOP", this.script.location)
        },
        showLog() {
            console.log("SHOW LOG", this.script.location)
        },
    }
}
