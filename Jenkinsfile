pipeline {
    agent { docker 'maven:3.3.3' }
    stages {
        stage('build') {
            steps {
                bat 'make all'
            }
        }
		stage('test') {
            steps {
                bat 'make test'
            }
        }
    }
}