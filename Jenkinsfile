node {
    timestamps{

          stage('Fetching from repository') {
             checkout scm
             
          }
          stage('Building artifact') {
                sh 'mvn clean package'
             
          }
          stage('Tests reports') {
                junit '**/target/surefire-reports/*.xml'
           
          }
          stage('Building image'){
                sh '''eval $(minikube docker-env)
                mvn compile jib:dockerBuild'''
          }
          stage('Deploy to test){
                sh 'kubectl create deployment spring-demo --image=spring-demo:0.0.1-SNAPSHOT'
                sh 'kubectl expose deployment spring-demo --type=NodePort --port=8090'
          }
    }
}
