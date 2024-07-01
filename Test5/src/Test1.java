
public class Test1 {

	public static void main(String[] args) {
		
		// print1이라는 함수상자를 실행해요.
		print1();
		print1();
		
		// walk라는 이름의 함수상자를 실행해요.
		walk(10);
		
		//add라는 이름의 함수상자를 실행해요.
		int a = 10;
		int b = 10;
		
		int result = add(a, b);
		
		System.out.println("더하기 결과: " + result);
		
	}
	
	
	// print1이라는 이름의 함수상자 만들기
	static void print1() {
		System.out.println("print1 함수가 실행되었어요.");
	}
	
	static void walk(int speed) {
		System.out.println("사람이 " + speed + "km 속도로 걸어갑니다.");
	}
	
	static int add(int a, int b) {
		return  a + b;
	}

}
