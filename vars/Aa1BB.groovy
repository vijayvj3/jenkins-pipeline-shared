import groovy.json.*

def call(jsondata){
def jsonString = jsondata
def jsonObj = readJSON text: jsonString
//String a=jsonObj.scm.projects.project.repositories.repository.repo_name
//String repoName=a.replaceAll("\\[", "").replaceAll("\\]","");
//String b=jsonObj.scm.projects.project.project_key 
//String Key=b.replaceAll("\\[", "").replaceAll("\\]","");
//println(Key)
//println(repoName)
 Date date = new Date() 
 withCredentials([usernamePassword(credentialsId: 'bitbucket_cred', passwordVariable: 'pass', usernameVariable: 'userId')]) {
  sh 'curl -X GET  -H -d  -u $userId:$pass http://18.224.68.30:7990/rest/api/1.0/projects/EDN/repos/demo12/commits -o output12.json'
 } 
}
