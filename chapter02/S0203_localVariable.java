package chapter02;

public class S0203_localVariable {
	public void automationEngineers() {
		int yearsEmployed;
		yearsEmployed=5;
		System.out.println("yearsEmployed"+ yearsEmployed);

	}
public void developers() {
	int yearsEmployed;
	yearsEmployed=3;
	System.out.println("yearsEmployed"+ yearsEmployed);
	}
	static void main(String[] args) {
		S0203_localVariable years = new S0203_localVariable();
		years.automationEngineers();
		years.developers();
//		faranak.skinColor = "white";
//		System.out.println(faranak.skinColor);

	}
}
