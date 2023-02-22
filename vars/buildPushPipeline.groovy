def call(Map pipelineParams) // function call runs by default
{
    pipeline {
        agent any
        stages {
            stage('Build') {
                steps {
                    script{
                        echo "La imagen que se va a construir es: ${pipelineParams.dockerImage}"
                        functions.build(filePath: pipelineParams.filePath,
                                        dockerImage: pipelineParams.dockerImage
                        )
                    }
                }
            }
            stage('docker push') {
                steps {
                    script{
                        functions.push(dockerImage: pipelineParams.dockerImage)
                    }
                }
            }
        }
    }
}