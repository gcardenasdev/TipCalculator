pipeline {
  environment {
    dockerimagename = "gcardenasdev/tip-calculator"
    dockerImage = ""
  }
  agent any
  stages {
    stage('Checkout Source') {
      steps {
        git 'https://github.com/gcardenasdev/TipCalculator'
      }
    }
    stage('Build image') {
      steps{
        script {
          dockerImage = docker.build tip-calculator
        }
      }
    }
    stage('Pushing Image') {
      environment {
          registryCredential = 'dockerhub-credentials'
           }
      steps{
        script {
          docker.withRegistry( 'https://registry.hub.docker.com', registryCredential ) {
            dockerImage.push("latest")
          }
        }
      }
    }
    stage('Deploying container to Kubernetes') {
      steps {
        script {
          kubernetesDeploy(configs: "deployment.yaml",
                                         "service.yaml")
        }
      }
    }
  }
}