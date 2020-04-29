pipeline {
    agent any
     tools {
        maven "maven360"
        jdk "openjdk-1102"
    }
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
