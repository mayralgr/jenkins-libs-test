13 lines (11 sloc)  397 Bytes

def build(Map params){
    sh "echo 'this is building ${params.filePath} ${params.dockerImage}"
}

def push(Map params){
    sh "echo  'pushing ${params.dockerImage}'"
}
