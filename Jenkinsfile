node {
	stage ('SCM checkout'){
		git "https://github.com/chelabasolo/SeleniumTest"
		}
	stage ('Build'){
    	dir("mavenproject13") {
	   sh "mvn clean install"
       }
       	dir("comtest/target") {
	   sh "java -jar mavenproject13-1.0-SNAPSHOT.jar"
       }
		}
}
