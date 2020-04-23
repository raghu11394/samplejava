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
                    sh 'mvn -X clean install -DskipTests'
                    sleep 5
                }
       }
      stage("test") {
           steps {
               snDevOpsStep ()
               echo "Testing"
               sh 'mvn test'
               sleep 3
           }
          post {
                always {
                    junit '**/target/surefire-reports/*.xml' 
                }
          }
        }
    
      stage("auto") {
          steps{
               snDevOpsStep ()
               echo "automation step"
               sleep 5
           }
      }
      
      stage("sonar") {
          steps{
               snDevOpsStep ()
               echo "sonar scan"
               sleep 5
           }
      }
      stage('Scan') {
            parallel {
               stage("tpsr scan") {
                      steps{
                           snDevOpsStep ()
                           echo "TPSR scan in progress"
                           sleep 5
                       }
               }
      
               stage("Security scan") {
                      steps{
                           snDevOpsStep ()
                           echo "Security/Vulnarability scan in progress"
                           sleep 5
                       }
               }
            }
      }
      stage("Push the artifact") {
             steps{
                  snDevOpsStep ()
                  echo "push artifact to nexus"
                  sleep 5
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
