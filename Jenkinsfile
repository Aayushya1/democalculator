pipeline {
    environment {
        registry = "abvroot/calculatorv2"
        registryCredential = 'docker-hub'
    }
  agent any
  options {
      skipDefaultCheckout(true)
  }
  stages {
    stage('Clone GIT Repository') {
          steps{
            git 'https://github.com/Aayushya1/democalculator.git'
       }
    }
    stage('Clean') {
        steps{
             sh 'mvn clean'
             echo "clean"
        }
    }

    stage('Compile') {
        steps{
             sh 'mvn package'
             echo "compile"
        }
    }
    stage('Test') {
        steps{
           sh 'mvn test'
           echo "test"
        }
    }

    stage('Deploy Image to Docker Hub') {
        steps{
            script{
               dockerImage = docker.build registry + ":calc"
               docker.withRegistry( '', registryCredential){
                   dockerImage.push()
               }
            }
        }
    }

  }
}