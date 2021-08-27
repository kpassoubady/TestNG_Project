node('win2') {
    def mvnHome = tool 'MVN-WIN'
    def javaHome = tool 'JDK11-WIN'
    stage('SCM') {
        def gitTool = tool 'GIT-WIN'
        echo "gitTool=$gitTool"
        git 'git@github.com:kpassoubady/TestNG_Project.git'
    }
    stage('Build') {
        withEnv([
                "MVN_HOME=$mvnHome",
                "JAVA_HOME=$javaHome",
                "PATH=.:C:\\WINDOWS\\SYSTEM32;$mvnHome\\bin;$javaHome\\bin;$PATH"
        ]) {
            echo "PATH=$PATH"
            bat(/"%MVN_HOME%\bin\mvn" -Pdata-provider clean test/)
        }
    }
    stage('Test') {
        junit '**/target/surefire-reports/TEST-*.xml'
    }
}