def docker_push(String ProjectName,String ImageTag,String dockerHubUser){
  withCredentials([usernamePassword('credentialsId':"DockerCred",passwordVariable:"dockerHubPass",usernameVariable:"dockerHubUser")]){
  sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
  sh "docker image tag ${ProjectName}:${ImageTag} ${dockerHubUser}/${ProjectName}:${ImageTag}"
  sh "docker push ${dockerHubUser}/${ProjectName}:${ImageTag}"
}
