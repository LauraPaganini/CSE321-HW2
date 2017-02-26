all: src\Calc.class src\CalcTest.class
src\Calc.class: src\Calc.java
	javac src\Calc.java
src\CalcTest.class: src\CalcTest.java src\Calc.class
	javac src\CalcTest.java
test: src\CalcTest.class
    java junit.textui.TestRunner src\CalcTest
clean:
	rm -f src\*.class