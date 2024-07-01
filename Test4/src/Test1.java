
public class Test1 {

	public static void main(String[] args) {
		
		// if문
		
		// age1이라는 이름의 변수상자(변수상장의 크기는 int:4byte)를 만들고 21이라는 값을 넣어준다.
		int age1 = 20;
		
		if (age1 > 20) { // true (맞다)
			System.out.println("나이가 20살보다 많다.");
		} else {
			System.out.println("나이가 20살보다 적거나 같다.");
		}
		
		if (age1 > 20) {
			System.out.println("나이가 20살보다 많다.");
		} else if (age1 == 20) {
			System.out.println("나이가 20살 입니다.");
		} else {
			System.out.println("나이가 20살 보다 적습니다.");
		}
		
		
		
		// for 문
		
		int count = 0;
		count = count + 1;
		count = count + 2;
		count = count + 3;
		count = count + 4;
		count = count + 5;
		count = count + 6;
		count = count + 7;
		count = count + 8;
		count = count + 9;
		count = count + 10;
		
		
		int count2 = 0;
		for (int i = 0; i < 10; i++) {
			count2 = count2 + (i + 1);
		}
		
		System.out.println("count2의 값 : " + count2);
		
		int count3 = 0;
		
		for (int i = 1; i < 11; i++) {
			count3 = count3 + i;
		}
		
		System.out.println("count3의 값: " + count3);
		
		
		// 함수
		int result = add(10, 10);
		System.out.println("더하기 결과 : " + result);
	}
	
	static int add(int a, int b) {
		int result = a + b;
		return result;
	}

}
