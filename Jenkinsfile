pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'javac -cp junit-4.12.jar:hamcrest-core1.3.jar:lib:. src/Calc.java src/CalcTest.java'
            }
        }
		stage('test') {
            steps {
                sh 'java -cp junit-4.12.jar:hamcrest-core-1.3.jar:src:lib:. org.junit.runner.JUnitCore CalcTest'
            }
        }
    }
}