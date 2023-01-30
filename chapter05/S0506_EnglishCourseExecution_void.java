package chapter05;

public class S0506_EnglishCourseExecution_void {
 int students;
 int days;
			 int weeks;
	public static void main(String[] args) {
		S0506_EnglishCourseExecution_void ENG101 = new S0506_EnglishCourseExecution_void();
		S0506_EnglishCourseExecution_void ENG102 = new S0506_EnglishCourseExecution_void();
		ENG101.students=10;
		ENG101.days=3;
		ENG101.weeks=4;
		ENG102.students=12;
		ENG102.days=6;
		ENG102.weeks=3;
		ENG101.totalDays();
		}
void totalDays() {
	System.out.println(weeks*days);
}
}