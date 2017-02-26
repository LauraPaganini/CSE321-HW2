pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                javac Calc.java 
				javac CalcTest.java
            }
        }
		stage('test') {
            steps {
                java CalcTest
            }
        }
    }
}