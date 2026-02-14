def docker_push(String ProjectName){
  withCredentials([usernamePassword('credentialsId':"DockerCred",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
  sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
  sh "docker image tag ${ProjectName}:${ImageTag} ${dockerHubUser}/${ProjectName}:${ImageTag}"
  sh "docker push ${dockerHubUser}/${ProjectName}:${ImageTag}"
}
