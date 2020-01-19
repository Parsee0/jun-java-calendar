package jun.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		int a, b;
		
		System.out.println("두 수를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		// System.out.println("두 수의 합은 " + (a + b) + "입니다.");
		System.out.printf("%d와 %d의 합은 %d입니다.", a, b, a + b);
		scanner.close();
	}

}
