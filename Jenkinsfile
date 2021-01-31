pipeline {
   agent any
   tools {
      maven 'Maven'
   }
   stages {
       stage("build") {
                steps {
                    snDevOpsStep ()
                    echo "Building" 
                    sleep 5
                }
       }
      stage("test") {
           steps {
                  snDevOpsStep ()
                  echo "Testing"
                  sleep 3
               }
        }
    
      
      stage("deploy") {
             steps{
                  snDevOpsStep ()
                  echo "deploy in prod"
                  sleep 5
                 // snDevOpsChange()              
              }
      }
      
      
  }
}
