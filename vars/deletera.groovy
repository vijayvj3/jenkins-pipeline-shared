import jenkins.model.*
 
def call(String name,int s,int e)
{
 jenkins = Jenkins.instance
 Jenkins.getItemByFullName("${name}").builds.findAll { it.number > ${s} && it.number < ${e} }.each { it.delete() }
}