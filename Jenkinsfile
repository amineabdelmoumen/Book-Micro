pipeline {
  agent any

  tools {
    maven 'maven-3.8'
  }

  stages {
    stage('Build') {
      steps {
        sh 'mvn package'
      }
    }
    
    stage('Make Container') {
      steps {
      sh "docker build -t customer-service:${env.BUILD_ID} ."
       
      }
    }
    
    
  

  
    stage("Pull") {
      steps {
        withCredentials([usernamePassword(credentialsId: 'amineabdelmoumen', usernameVariable: 'amineabdelmoumen', passwordVariable: 'Amine@2020')]) {
          sh "ssh docker login -u ${USERNAME} -p ${PASSWORD}"
          sh "ssh docker pull customer-service:latest"
        }
      }
  }
  }
}