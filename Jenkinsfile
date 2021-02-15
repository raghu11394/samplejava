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
    
      stage("deploy") {
             steps{
                  snDevOpsStep ()
                  echo "deploy in prod"
                  echo "deploy in prod"
                  snDevOpsChange(
                  changeRequestDetails: """
           {
	"setCloseCode": false,
	"attributes": {
		"requested_by": {
			"name": "DevOps System"
		},
		"category": "Service",
		"configurations_item": "4a995cb20a0a0b92001e89afc07873e5",
		"businesss_service":"0151f643931102002c68530b547ffb0f",
		"short_description": "DevOps Testing",
		"start_date": "2021-02-02 08:00:00",
		"end_date": "2021-02-02 08:00:00"
	}
                  
                  
                  )              
              }
      }      
      
  }
}
