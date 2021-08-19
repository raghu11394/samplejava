pipeline {
   agent any
   tools {
      maven 'Maven'
   }
   stages {
       stage("build") {
                steps {
                    echo "Building" 
                    sleep 5
                }
       }
      stage("test") {
           steps {
               echo "Testing"
               sh 'mvn test'
           }
          post {
                always {
                    junit '**/target/surefire-reports/*.xml' 
                }
          }
        }
     
      
      stage("deploy") {
             steps{
                  echo "deploy in prod"
                  sleep 5
                  snDevOpsChange()              
              }
      }
      
      
  }
}
