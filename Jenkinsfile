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
    
    stage('build docker image') {
      steps {
      sh "docker build -t gateway-service:${env.BUILD_ID} ."
       
      }
    }
    
    
  

  
    stage("Pushing to docker hub ") {
      steps {
        withCredentials([usernamePassword(credentialsId: 'amineabdelmoumen', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
          sh "docker login -u ${USERNAME} -p ${PASSWORD}"
          sh "docker tag gateway-service:${env.BUILD_ID} amineabdelmoumen/gateway-service-image"
         
          sh "docker push amineabdelmoumen/gateway-service-image"
        }
      
  }
  }
}
}