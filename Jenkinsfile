pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'javac Calc.java CalcTest.java'
            }
        }
		stage('test') {
            steps {
                sh 'java CalcTest'
            }
        }
    }
}