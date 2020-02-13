package jun.calendar;

import java.text.ParseException;
import java.util.Scanner;

public class Prompt2 {
	
	public void printMenu() {
		System.out.println("+----------------------+");
		System.out.println("| 1. 일정 등록");
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말 q. 종료");
		System.out.println("+----------------------+");
	} // 사용자 UI를 만들어서 출력한다.
	
	/*
	 * 0 = Sunday 부터 시작해서 6 = Saturday까지
	 */
	
	public int parseDay(String week) {
		switch(week) {
		case "su":
			return 0;
		case "mo":
			return 1;
		case "tu":
			return 2;
		case "we":
			return 3;
		case "th":
			return 4;
		case "fr":
			return 5;
		case "sa":
			return 6;
		default:
			return 0;
		}
	}

//		if(week.equals("su")) {
//			return 0;
//		} else if(week.equals("mo")) {
//			return 1;
//		} else if(week.equals("tu")) {
//			return 2;
//		} else if(week.equals("we")) {
//			return 3;
//		} else if(week.equals("th")) {
//			return 4;
//		} else if(week.equals("fr")) {
//			return 5;
//		} else if(week.equals("sa")) {
//			return 6;
//		} else {
//			return 0;
//		}
//	}
	
	public void runPrompt() throws ParseException {
		
		printMenu(); // UI를 출력하는 메소드 호출
		
		// 숫자를 입력받아 해당하는 달의 최대 일 수를 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
		Calendar3 cal = new Calendar3(); // Calendar 생성
		
		boolean isLoop = true; //boolean 타입의 변수를 사용하여 while문 빠져나오기
		while (isLoop) {
			System.out.println("명령 (1, 2, 3, h, q)");
			String cmd = scanner.next();
			switch(cmd) {
			case "1":
				cmdRegistration(scanner, cal);
				break;
			case "2":
				cmdSearchplan(scanner, cal);
				break;
			case "3":
				cmdShowcal(scanner, cal);
				break;
			case "h":
				cmdHelp();
				break;
			case "q":
				isLoop = false;
				break;
			}
			
//			if(cmd.equals("1")) {
//				cmdRegistration(scanner, cal);
//			} else if (cmd.equals("2")) {
//				cmdSearchplan(scanner, cal);
//			} else if (cmd.equals("3")) {
//				cmdShowcal(scanner, cal);
//			} else if (cmd.equals("h")) {
//				cmdHelp();
//			} else if (cmd.equals("q")) {
//				break;
//			}
			
		System.out.println("Have a nice day!");
		scanner.close();
		}
		
	}

	private void cmdHelp() {
		
	}

	private void cmdShowcal(Scanner scanner, Calendar3 cal) {
		int month = 1;
		int year = 2020;
		System.out.println("\n연도를 입력하세요.");
		System.out.print("YEAR> ");
		year = scanner.nextInt();
		System.out.println("달을 입력하세요");
		System.out.print("MONTH> ");
		month = scanner.nextInt();
//		System.out.println("첫번째 요일을 입력하세요. (su, mo, tu, we, th, fr, sa).");
//		String str_weekday = scanner.next();
//		weekday = parseDay(str_weekday); >>> 요일을 자동으로 입력하게 수정할 것이므로 주석처리.

		if (month > 12 || month < 1) {
			System.out.println("잘못된 입력입니다.");
			return; //메소드를 종료하려면 return을 입력하면 된다.
		}
		
//		System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getMaxDaysOfMonth(month)); // cal에 있는 getMaxDaysOfMonth를 불러온다.
		
		cal.printCalendar2(year, month);
	} // 원하는 만큼 반복횟수를 입력 받은 다음 입력한 숫자 만큼 반복하여 해당하는 달의 최대 일 수를 출력하도록 변경.
	
//	int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	private void cmdSearchplan(Scanner scanner, Calendar3 cal) {
		System.out.println("[일정 검색]");
		System.out.println("날짜를 입력해 주시기 바랍니다. (yyyy-MM-dd).");
		String date = scanner.next();
		String plan = "";
		try {
			plan = cal.searchPlan(date);
		} catch (ParseException e) {
			e.printStackTrace();
			System.err.println("일정 검색 중 오류가 발상하였습니다.");
		}
		System.out.println(plan);
	}

	private void cmdRegistration(Scanner scanner, Calendar3 cal) throws ParseException {
		System.out.println("[새로운 일정 등록]");
		System.out.println("날짜를 입력해 주시기 바랍니다. (yyyy-MM-dd).");
		String date = scanner.next();
		String text = "";
		scanner.nextLine();
		System.out.println("일정을 입력해 주시기 바랍니다. (문장의 끝에 ;을 입력해주세요.)");
		text = scanner.nextLine();
		
		cal.registerPlan(date, text);
	}

	public static void main(String[] args) throws ParseException {
		// 셸 실행
		Prompt2 p = new Prompt2();
		p.runPrompt();
	}

}
