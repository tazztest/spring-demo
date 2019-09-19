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
    }
}
