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
        withCredentials([usernamePassword(credentialsId: 'amineabdelmoumen', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
          sh "docker login -u ${USERNAME} -p ${PASSWORD} amineabdelmoumen/book-store-microservice"
          sh "docker tag customer-service:${env.BUILD_ID} customer-service-image"
          sh "docker push customer-service-image"
        }
      
  }
  }
}
}
