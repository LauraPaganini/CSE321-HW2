pipeline {
    agent { docker 'maven:3.3.3' }
    stages {
        stage('build') {
            steps {
                javac Calc.java CalcTest.java
            }
        }
		stage('test') {
            steps {
                java CalcTest.java
            }
        }
    }
}