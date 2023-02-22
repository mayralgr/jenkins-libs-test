13 lines (11 sloc)  397 Bytes

def build(Map params){
    sh "echo 'this is building ${params.DockerfilePath} -t ${params.DockerImage} ${params.DockerArgs} ${params.DockerContext}'"
}

def push(Map params){
    sh "echo  'pushing ${params.DockerImage}'"
}
