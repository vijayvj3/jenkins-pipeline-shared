def call(){

sh 'curl -X POST -v --user Admin:admin123 -H "ContentType: application/json; charset=UTF-8" "https://api.bitbucket.org/2.0/repositories/Megalai/repo6" -d {"name":"repo6"}'

}

      

