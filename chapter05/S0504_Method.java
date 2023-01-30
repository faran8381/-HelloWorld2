package chapter05;

public class S0504_Method {
int sum (int value1,int value2 ) {
	int result;
	result=value1+value2;
	return result;
}
void printDynamicMessage(String Message) {
	System.out.println(Message);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub ;
		S0504_Method obj= new S0504_Method();
		System.out.println(obj.sum(180,890));
		obj.printDynamicMessage("Welcome Faranak");
// MethodType methodName(ParametersList){}
		
	}
}