package chapter05;

public class S0503_EnglishCourseExecution1 {
	public static void main(String[] args) {
		S0502_EnglishCourse ENG101 = new S0502_EnglishCourse();
		S0502_EnglishCourse ENG102 = new S0502_EnglishCourse();
		int totalDays1;
		int totalDays2;
		ENG101.students=10;
		ENG101.days=3;
		ENG101.weeks=4;
		ENG102.students=12;
		ENG102.days=6;
		ENG102.weeks=3;
		totalDays1=ENG101.days*ENG101.weeks;
		totalDays2=ENG102.days*ENG102.weeks;
		System.out.println("totalDays are "+ totalDays1);
		totalDays1=ENG101.days*ENG102.weeks;
		System.out.println("totalDays are "+ totalDays2);
		}
}
