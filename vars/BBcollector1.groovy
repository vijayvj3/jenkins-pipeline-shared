def call(json){
def jsonString = json
def jsonObj = readJSON text: jsonString

String b=jsonObj.scm.projects.project.project_key 
String Key=b.replaceAll("\\[", "").replaceAll("\\]","");
println(Key)
 
sh "curl -X GET -i -H http://18.224.68.30:7990/rest/api/1.0/projects/'${Key}'/repos/Rig" 
sh "curl -X GET -i -H http://18.224.68.30:7990/rest/api/1.0/projects/'${Key}'"
sh "curl -X GET -i -H http://18.224.68.30:7990/rest/api/1.0/projects/'${Key}'/repos/Rig/branches" 
sh 'curl -X GET -i -H "http://18.224.68.30:7990/rest/api/1.0/admin/groups"'
 sh "curl -X GET -i -H http://18.224.68.30:7990/rest/api/1.0/projects/'${Key}'/repos/rig/commits"
}