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
    stage ('Login as su') {
      steps {
        sh 'sudo su'
      }
    }
    stage ('Build docker') {
      steps {
        sh 'docker build -t testimage .'
      }
    }
  }
}
