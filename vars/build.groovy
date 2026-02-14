def build(String ProjectName,String ImageTag){
  echo "This is a Builded code"
  sh "docker build -t ${ProjectName}:${ImageTag} ."
}
