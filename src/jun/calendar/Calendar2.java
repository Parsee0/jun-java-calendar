package jun.calendar;

import java.util.Scanner;

public class Calendar2 {
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 윤년에는 2월에 29일이 생기므로 새로운 배열을 하나 더 만들었다.
	
	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		} else {
		return false;
		}
	}
	public int getMaxDaysOfMonth(int year, int month) { // int로 입력받아서 int를 되돌려준다.
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		} else {
			return MAX_DAYS[month - 1];
		}
	} // 기능을 하나의 함수로 만들어 밖으로 빼내었음.
	  // 배열의 시작은 1부터가 아니라 0부터이므로 'month - 1'을 사용해주어야한다.
	
	public void printCalendar(int year, int month) {
		System.out.printf("    <<%4d년 %3d월>>\n", year, month); // %d와 다르게 %4d라고 하면 4칸을 차지하는 정수라는 뜻 (Ex. 2020)
		System.out.println("일   월   화   수   목   금   토");
		System.out.println("--------------------");
		
		int maxDay = getMaxDaysOfMonth(year, month);
		
		for(int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0) {
				System.out.println();
			}
		}
//		System.out.println("1  2  3  4  5  6  7");
//		System.out.println("8  9  10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
	} // 달력도 기능을 하나의 함수로 만들어 밖으로 빼내었음.
	
	public static void main(String[] args) {
		
	}

}