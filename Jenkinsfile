md5sum= ''
data=''
pipeline {
    agent any
     
    stages {
         stage('TEST'){
             steps{
                 script{
                     dir('src'){
                             def data = readFile(file: 'checksum')
                             println(data)
                        }
                        md5sum = powershell(returnStdout: true, script: "(Get-FileHash -Algorithm MD5 -Path  \".\\Jenkinsfile\" | Select -ExpandProperty Hash  )")
                        echo "${md5sum}"
                         if(data != md5sum){
                             error("Build failed because of this and that..")
                         }
                     }
                
             }
            
        }
    }
}
