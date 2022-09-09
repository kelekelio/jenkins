pipelineJob('aionDB') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/kelekelio/AionSpringDB.git'
                    }
                    branch 'develop'
                }
            }
        }
    }
}