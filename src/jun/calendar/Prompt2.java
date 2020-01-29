package jun.calendar;

import java.util.Scanner;

public class Prompt2 {
	
	/*
	 * 0 = Sunday 부터 시작해서 6 = Saturday까지
	 */
	
	public int parseDay(String week) {
		if(week.equals("su")) {
			return 0;
		} else if(week.equals("mo")) {
			return 1;
		} else if(week.equals("tu")) {
			return 2;
		} else if(week.equals("we")) {
			return 3;
		} else if(week.equals("th")) {
			return 4;
		} else if(week.equals("fr")) {
			return 5;
		} else if(week.equals("sa")) {
			return 6;
		} else {
			return 0;
		}
	}
	
	public void runPrompt() {

		// 숫자를 입력받아 해당하는 달의 최대 일 수를 출력하는 프로그램
		
		Scanner scanner = new Scanner(System.in);
		Calendar3 cal = new Calendar3(); // Calendar 생성
		
		int month = 1;
		int year = 2020;
		
		while (true) {
			System.out.println("\n연도를 입력하세요. (-1을 입력하면 종료)");
			System.out.print("YEAR> ");
			year = scanner.nextInt();
			if (year == -1) {
				break;
			}
			System.out.println("달을 입력하세요");
			System.out.print("MONTH> ");
			month = scanner.nextInt();
//			System.out.println("첫번째 요일을 입력하세요. (su, mo, tu, we, th, fr, sa).");
//			String str_weekday = scanner.next();
//			weekday = parseDay(str_weekday); >>> 요일을 자동으로 입력하게 수정할 것이므로 주석처리.

			if (month > 12 || month < 1) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
//			System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getMaxDaysOfMonth(month)); // cal에 있는 getMaxDaysOfMonth를 불러온다.
			
			cal.printCalendar2(year, month);
		} // 원하는 만큼 반복횟수를 입력 받은 다음 입력한 숫자 만큼 반복하여 해당하는 달의 최대 일 수를 출력하도록 변경.
		
//		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.println("Have a nice day!");
		scanner.close();
		
	}

	public static void main(String[] args) {
		// 셸 실행
		Prompt2 p = new Prompt2();
		p.runPrompt();
	}

}
