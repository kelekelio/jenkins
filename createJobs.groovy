pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('aionDB') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/kelekelio/AionSpringBootDB.git'
                    }
                    branch 'develop'
                }
            }
        }
    }
}