def call(Map pipelineParams) // function call runs by default
{
    pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                    script{
                        functions.build(filePath: "filepath",
                                        dockerImage: "some docker image"
                        )
                    }
                }
            }
            stage('docker push') {
                steps {
                    script{
                        functions.push(dockerImage: "some docker image")
                    }
                }
            }
        }
    }
}