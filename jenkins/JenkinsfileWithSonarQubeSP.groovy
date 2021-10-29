node('win2') {
    stage('SCM') {
        //def gitTool = tool 'GIT-WIN'
        checkout scm
    }

    stage('SonarQube Analysis') {
        def mvnHome = tool 'MVN-WIN';
        def javaHome = tool 'JDK11-WIN'
        withEnv([
                "MVN_HOME=$mvnHome",
                "JAVA_HOME=$javaHome",
                "PATH=.:C:\\WINDOWS\\SYSTEM32;$mvnHome\\bin;$javaHome\\bin;$PATH"
        ]) {
            echo "PATH=$PATH"
            withSonarQubeEnv() {
                bat(/"%MVN_HOME%\bin\mvn" clean compile compiler:testCompile -Dmaven.test.skip=true package sonar:sonar/)
            }
        }
    }

    //stage('Results') {
    //    junit '**/target/surefire-reports/TEST-*.xml'
    //    archiveArtifacts 'target/*.jar'
    //}
}
