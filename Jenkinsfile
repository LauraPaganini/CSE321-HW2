pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'javac -classpath junit-4.12.jar:hamcrest-core1.3.jar:src:. Calc.java CalcTest.java'
            }
        }
		stage('test') {
            steps {
                sh 'java -classpath junit-4.12.jar:hamcrest-core-1.3.jar:src:. org.junit.runner.JUnitCore CalcTest'
            }
        }
    }
}