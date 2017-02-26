all: Calc.class CalcTest.class
Calc.class: Calc.java
	javac src\Calc.java
CalcTest.class: CalcTest.java Calc.class
	javac src\CalcTest.java
test: CalcTest.class
    java junit.textui.TestRunner CalcTest
clean:
	rm -f *.class