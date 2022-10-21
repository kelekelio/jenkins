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
pipelineJob('aionDB-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/kelekelio/AionSpringDB.git'
                    }
                    branch 'develop'
                    scriptPath 'Jenkinsfile-docker'
                }
            }
        }
    }
}

pipelineJob('aionDB-aws') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/kelekelio/AionSpringDB.git'
                    }
                    branch 'develop'
                    scriptPath 'Jenkinsfile-aws'
                }
            }
        }
    }
}