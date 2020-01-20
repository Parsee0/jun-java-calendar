package jun.calendar;

import java.util.Scanner;

public class Calendar {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int getMaxDaysOfMonth(int month) { // int로 입력받아서 int를 되돌려준다.
		return MAX_DAYS[month - 1];
	} // 기능을 하나의 함수로 만들어 밖으로 빼내었음.
	  // 배열의 시작은 1부터가 아니라 0부터이므로 'month - 1'을 사용해주어야한다.
	
	public void printSampleCalendar() {
		System.out.println("일   월   화   수   목   금   토");
		System.out.println("--------------------");
		System.out.println("1  2  3  4  5  6  7");
		System.out.println("8  9  10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	} // 달력도 기능을 하나의 함수로 만들어 밖으로 빼내었음.
	
	public static void main(String[] args) {
		
		// 숫자를 입력받아 해당하는 달의 최대 일 수를 출력하는 프로그램
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar(); // Calendar 생성
		
		System.out.println("반복횟수를 입력하세요.");
		int repeatnum = scanner.nextInt();
		System.out.println("달을 입력하세요.");
		for (int i = 0; i < repeatnum; i++) {
			
			int month = scanner.nextInt();
			System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getMaxDaysOfMonth(month)); // cal에 있는 getMaxDaysOfMonth를 불러온다.
			
			cal.printSampleCalendar();
		} // 원하는 만큼 반복횟수를 입력 받은 다음 입력한 숫자 만큼 반복하여 해당하는 달의 최대 일 수를 출력하도록 변경.
		
//		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		scanner.close();
		
	}

}