def build(String ProjectName,String DockerUser,String ImageTag){
  echo "This is a Builded code"
  sh "docker build -t ${DockerUser}/${ProjectName}:${ImageTag} ."
}
