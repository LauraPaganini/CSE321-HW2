pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                bat 'javac -cp C:\Users\laura\Documents\CSE321-HW2\junit-4.12.jar;C:\Users\laura\Documents\CSE321-HW2\hamcrest-core1.3.jar;. src/Calc.java src/CalcTest.java'
            }
        }
		stage('test') {
            steps {
                bat 'java -cp C:\Users\laura\Documents\CSE321-HW2\junit-4.12.jar;C:\Users\laura\Documents\CSE321-HW2\hamcrest-core-1.3.jar;src;. org.junit.runner.JUnitCore CalcTest'
            }
        }
    }
}