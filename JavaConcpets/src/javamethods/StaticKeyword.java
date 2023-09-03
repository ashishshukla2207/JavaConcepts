package javamethods;

public class StaticKeyword {

	String name;
	static int age;
	
	public void test() {
		System.out.println("test method");
	}
	
	public static void getMail() {
		System.out.println("get mail method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getMail();    // no need to create object as the method is static
		
		//for test method we need to create object
		
		
		StaticKeyword s1= new StaticKeyword();
		s1.name= "Ashish";
		s1.test();
		
		s1.age=45; //warning that it should be done in static way , like age=45;
		age= 45; //right one
		
		
		//can access static stuff using class name
		
		StaticKeyword.getMail();
		StaticKeyword.age=56;
		
	}

}