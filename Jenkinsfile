node {
	stage ('SCM checkout'){
		git "https://github.com/chelabasolo/SeleniumTest"
		}
	stage ('Build'){
    	dir("mavenproject13") {
	   //sh "mvn clean install"
	   def mvnHome = tool name: 'M3', type: 'maven'
	   sh "${mvnHome}/bin/mvn -B -DskipTests clean install"
       }
       	dir("mavenproject13/target") {
	   sh "java -jar mavenproject13-1.0-SNAPSHOT.jar"
       }
		}
}
