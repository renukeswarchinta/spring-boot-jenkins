md5sum= ''
data=''
pipeline {
    agent any
    stages {
         //stage('TEST'){
           //  steps{
             //    script{
             //        dir('src'){
             //                data = readFile(file: 'checksum')
             //                  echo "${data}"
                             
            //            }
              //          md5sum = powershell(returnStdout: true, script: "(Get-FileHash -Algorithm MD5 -Path  \".\\mvnw\" | Select -ExpandProperty Hash  )")
               //         echo "${md5sum}"
                //         if(data != md5sum){
                 //            error("Build failed because of this and that..")
                  //       }else{
                    //         echo "in else"
                     //    }
                     //}
                
          //}
          stage('Submit Stack') {
            steps {
                      sh "aws cloudformation create-stack --stack-name s3bucket --template-body file://simplests3cft.json --region 'us-east-1'"
                   }
          }
    }
}
