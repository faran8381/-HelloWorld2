package chapter02;

public class S0203_instanceVariables {
	int yearExist = 34;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// S0203_byValueInitialization years; // تا اینجا هنوز مقدار اولیه نداره
		//S0203_instanceVariables  years = new S0203_instanceVariables(); //first way 
		S0203_instanceVariables  years;//second way
		years = new S0203_instanceVariables();// second way
		System.out.println(years.yearExist);

	}
}
