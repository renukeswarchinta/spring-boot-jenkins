pipeline {
    agent any
     
    stages {
        stage('Deploy') {
           steps {
               
                dir('spring-boot-jenkins') {
                   bat "mvn clean package"
                }
            }
        }
    }
}
