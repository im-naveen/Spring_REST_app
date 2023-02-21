pipeline {
  agent any
  tools {
    maven 'Maven' 
  }
  stages {
    stage ('Build') {
      steps {
        sh 'mvn clean install -DskipTests'
      }
    }
    stage ('Build docker') {
      steps {
        sh 'docker build -t testimage .'
      }
    }
    stage ('Run Docker Image') {
      steps {
        sh 'docker run testimage'
      }
    }
  }
}
