package chapter02;

public class S0203_classVariableHuman {
	String skinColor;
	static int legNumber;

	static void main(String[] args) {
		S0203_classVariableHuman faranak = new S0203_classVariableHuman();
		faranak.skinColor = "white";
		System.out.println(faranak.skinColor);

	}
}
