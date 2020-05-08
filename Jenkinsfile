md5sum= ''
pipeline {
    agent any
     
    stages {
         stage('TEST'){
             steps{
                 script{
                    md5sum = powershell(returnStdout: true, script: "(Get-FileHash -Algorithm MD5 -Path  \".\\Jenkinsfile\" | Select -ExpandProperty Hash  )")
                }
             }
            
        }
    }
}
