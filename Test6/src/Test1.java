
public class Test1 {
	public static void main(String args[]) {
		
		int result1 = add(10, 2);
		int result2 = minus(10, 2);
		int result3 = multiply(10, 2);
		double result4 = divide(3, 2);
		
		// System.out.println("더하기 함수 : " + result1);
		// System.out.println("빼기 함수 : " + result2);
		// System.out.println("곱하기 함수 : " + result3);
		// System.out.println("나누기 함수 : " + result4);
		
		Calc cal = new Calc();
		
		System.out.println("더하기 함수 : " + cal.add(10, 9));
		System.out.println("빼기 함수 : " + cal.minus(10, 9));
		System.out.println("곱하기 함수 : " + cal.multiply(10, 9));
		System.out.println("나누기 함수 : " + cal.divide(10, 9));
		
	}
	
	static int add(int a, int b) {
		return a + b;
	}
	
	static int minus(int a, int b) {
		return a - b;
	}
	
	static int multiply(int a, int b) {
		return a * b;
	}
	
	static double divide(int a, int b) {
		return (double) a / b;
	}

}

class Calc {
	static int add(int a, int b) {
		return a + b;
	}
	
	static int minus(int a, int b) {
		return a - b;
	}
	
	static int multiply(int a, int b) {
		return a * b;
	}
	
	static double divide(int a, int b) {
		return (double) a / b;
	}
}
