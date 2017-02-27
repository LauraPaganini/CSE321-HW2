pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'javac src/Calc.java src/CalcTest.java'
            }
        }
		stage('test') {
            steps {
                sh 'java src/CalcTest'
            }
        }
    }
}