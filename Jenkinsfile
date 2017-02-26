pipeline {
    agent { docker 'maven:3.3.3' }
    stages {
        stage('build') {
            steps {
                bash 'make all'
            }
        }
		stage('test') {
            steps {
                bash 'make test'
            }
        }
    }
}