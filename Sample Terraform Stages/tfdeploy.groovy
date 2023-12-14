pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {git branch: 'main', credentialsId: '<YOUR_CREDENTIALS_ID>', url: '<YOUR_URL>'
            }
        }
        stage('Terraform init') {
            steps {
                bat 'terraform init'
            }
        }
        stage('Terraform apply') {
            steps {
                bat 'terraform apply --auto-approve'
            }
        }   
    }
}
