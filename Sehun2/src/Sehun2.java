
public class Sehun2 {

	public static void main(String[] args) {
		
		// 변수상자를 만들고 값을 넣기 (초기화);
		String name = "김세훈";
		int age = 10;
		
		System.out.println("이름 :" + name);
		System.out.println("나이 : " + age);
		
		// 변수상자만 만들기
		String name2;

		name2 = "홍길동2";
		
		// 값을 더하기
		int age1 = 10;
		int age2 = 20;
		
		int result1 = age1 + age2;
		
		System.out.println(name);
		System.out.println(result1);
		
		// 변수: 바뀔수 있는 상자
		int age3 = 50;
		age3 = age1 + age2;
		System.out.println("age3 : " + age3);

	}

}
