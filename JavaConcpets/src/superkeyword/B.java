package superkeyword;

public class B extends A {
	int num1= 200;
	public void dothis() {
		System.out.println("Do this from B");
		
	
		
	}
	public void xyz() {
		super.dothis();
		System.out.println(super.num1);
		System.out.println("from xzy");
	}

}


// without using super class only child class varibale and methods will get executed