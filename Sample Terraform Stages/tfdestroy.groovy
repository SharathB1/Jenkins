pipeline {
    agent any

    stages {
        stage('Terraform destroy') {
            steps {
                bat 'terraform destroy --auto-approve'
            }
        }
    }
}