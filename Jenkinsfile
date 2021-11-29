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
      sh "docker build -t book-service:${env.BUILD_ID} ."
       
      }
    }
    
    stage("Pushing to docker hub ") {
      steps {
        withCredentials([usernamePassword(credentialsId: 'amineabdelmoumen', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
          sh "docker login -u ${USERNAME} -p ${PASSWORD}"
          sh "docker tag book-service:${env.BUILD_ID} amineabdelmoumen/book-service-image"
         
          sh "docker push amineabdelmoumen/book-service-image"
        }
      
  }
  }
}
}