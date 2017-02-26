pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                javac src/Calc.java 
				javac src/CalcTest.java
            }
        }
		stage('test') {
            steps {
                java src/CalcTest
            }
        }
    }
}