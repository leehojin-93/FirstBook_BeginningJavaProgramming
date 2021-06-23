package interfaceex;

public interface Calc {

	// 인터페이스에서 선언한 변수는 컴파일 과정에서 상수로 변환됨
	double PI = 3.14;
	int ERROR = -999999999;

	// 인터페이스에서 선언한 메서드는 컴파일 과정에서 추상메서드로 변환됨
	int add(int num1, int num2);

	int substract(int num1, int num2);

	int times(int num1, int num2);

	int divide(int num1, int num2);

	/*
	 * default int add~divide(int num1, int num2) { return num1 +, -, *, / num2; }
	 */

	// 나 혼자 코딩!
	int square(int num);
}
