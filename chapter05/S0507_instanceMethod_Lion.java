package chapter05;

public class S0507_instanceMethod_Lion {
	static void a() {
		System.out.println("n metod executed");
	}
	 int b() {
		//S0507_instanceMethod_Lion obj=new S0507_instanceMethod_Lion();
		S0507_instanceMethod_Lion.a();
		a();
		System.out.println("m metod executed");
return 100;
	}
void sound() {
	System.out.println("ROAR");
}
public static void main(String[] args) {
//	S0507_instanceMethod_Lion maleLion =new S0507_instanceMethod_Lion();
//maleLion.sound();
	S0507_instanceMethod_Lion b=new S0507_instanceMethod_Lion();
	System.out.println(b.b());
}
}
