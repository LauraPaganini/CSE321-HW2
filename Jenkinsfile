pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'javac junit-4.12.jar src/Calc.java src/CalcTest.java'
            }
        }
		stage('test') {
            steps {
                sh 'java src/CalcTest'
            }
        }
    }
}