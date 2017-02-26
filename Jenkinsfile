pipeline {
    agent { docker 'maven:3.3.3' }
    stages {
        stage('build') {
            steps {
                bat 'javac src/Calc.java src/CalcTest.java'
            }
        }
		stage('test') {
            steps {
                bat 'java src/CalcTest'
            }
        }
    }
}