package jun.calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT = "cal> ";
	
	public void runPrompt() {

		// 숫자를 입력받아 해당하는 달의 최대 일 수를 출력하는 프로그램
		
		String PROMPT = "\ncal> ";
		Scanner scanner = new Scanner(System.in);
		Calendar2 cal = new Calendar2(); // Calendar 생성
		
		int month = 1;
		int year = 1;
		
		while (true) {
			System.out.println("\n연도를 입력하세요.");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			System.out.println("달을 입력하세요");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}
			
//			System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getMaxDaysOfMonth(month)); // cal에 있는 getMaxDaysOfMonth를 불러온다.
			
			cal.printCalendar(2020, month);
		} // 원하는 만큼 반복횟수를 입력 받은 다음 입력한 숫자 만큼 반복하여 해당하는 달의 최대 일 수를 출력하도록 변경.
		
//		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.println("Have a nice day!");
		scanner.close();
		
	}

	public static void main(String[] args) {
		// 셸 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
