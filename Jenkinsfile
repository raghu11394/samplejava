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
                  sleep 3
               }
        }
    
      
      stage("deploy") {
             steps{
                  snDevOpsStep ()
                  echo "deploy in prod"
                  sleep 5
                  snDevOpsChange()              
              }
      }
      
      
  }
}
