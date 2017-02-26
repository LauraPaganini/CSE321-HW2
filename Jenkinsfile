pipeline {
    agent { docker 'maven:3.3.3' }
    stages {
        stage('build') {
            steps {
                javac src/Calc.java src/CalcTest.java
            }
        }
		stage('test') {
            steps {
                java src/CalcTest
            }
        }
    }
}