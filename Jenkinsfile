pipeline {
    agent any
    options {
      ansiColor('xterm')
      timestamps()
    }

   stages {
      stage('Fetching from repository') {
         steps {
            git credentialsId: '5ec04292-b7ba-4dd3-b2eb-8d258fd7600d', url: 'https://github.com/tazztest/spring-demo.git'
         }
      }
      stage('Building artifact') {
         steps {
            sh 'mvn clean package'
         }
      }
      stage('Tests reports') {
         steps {
            junit '**/target/surefire-reports/*.xml'
         }
      }
      
      

   }
}
