pipeline {
    agent { docker 'maven:3.3.3' }
    stages {
        stage('build') {
            steps {
                sh 'make all'
            }
        }
		stage('test') {
            steps {
                sh 'make test'
            }
        }
    }
}