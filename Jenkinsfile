md5sum= ''
pipeline {
    agent any
     
    stages {
         stage('TEST'){
             steps{
                 script{
                     dir('spring-boot-jenkins'){
                      def data = readFile(file: 'checksumfile')
                   println(data)
                    md5sum = powershell(returnStdout: true, script: "(Get-FileHash -Algorithm MD5 -Path  \".\\Jenkinsfile\" | Select -ExpandProperty Hash  )")
                     echo "${md5sum}"
                     }
                }
             }
            
        }
    }
}
