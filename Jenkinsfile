pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'javac -classpath *.jar src/Calc.java src/CalcTest.java'
            }
        }
		stage('test') {
            steps {
                sh 'java -classpath *.jar:src org.junit.runner.JUnitCore CalcTest'
            }
        }
    }
}