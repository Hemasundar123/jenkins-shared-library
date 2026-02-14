def call(String url,String branch){
  echo "Hi This is Notes-app"
  git url: "${url}", branch:"${branch}"
  echo "Clone the Repo"
}
