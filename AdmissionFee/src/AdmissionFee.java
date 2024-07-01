import java.util.Scanner;

public class AdmissionFee {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("성인 수 입력:");
		int adult = scanner.nextInt();
		
		System.out.print("어린이 수 입력:");
		int kid = scanner.nextInt();
		
		
		
		
		calcu(adult,kid);
	}
	
	static void calcu (int adult, int kid) {
		int totalFee = (20000 * adult) + (9900 * kid);
		
		if (adult + kid >= 5) {
			totalFee = (int) (totalFee * 0.8);
			totalFee *= 0.8;
		}
		
		System.out.println("성인수는 " + adult + "명");
		System.out.println("어린이는 " + kid + "명");
		System.out.println("총합 " + totalFee + "원");
		
	}
}
