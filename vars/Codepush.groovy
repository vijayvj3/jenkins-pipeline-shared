def call(jsondata){
def jsonString = jsondata
//println(jsonString)
def jsonObj = readJSON text: jsonString
println(jsonObj.scm)

String a=jsonObj.scm.projects.project.repositories.repository.repo_name
String repoName=a.replaceAll("\\[", "").replaceAll("\\]","");
String b=jsonObj.scm.projects.project.project_key 
String projectKey=b.replaceAll("\\[", "").replaceAll("\\]","");
  
  def link1 = " find . -type f -not -name '*.txt'-delete && git clone https://github.com/kavi1997/TestProject.git && git clone http://rig:rigaDapt%40devOps@18.224.68.30:7990/scm/'${projectKey}'/'${repoName}'.git && cp -r ./TestProject/* ./app && pwd && cd app && pwd && git init && git add --all && git status && git commit -m 'commit' && git remote add origin http://rig:rigaDapt%40devOps@18.224.68.30:7990/scm/'${projectKey}'/'${repoName}'.git && git push -u origin master"
   
  
   sh(link1)
   
    
  }

         
 
