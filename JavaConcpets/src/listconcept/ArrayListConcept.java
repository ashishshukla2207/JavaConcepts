package listconcept;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
	

		ArrayList<String> al= new ArrayList<String>();
		al.add("Red");
		al.add("Blue");
		al.add("yellow");
		al.add("Green");
		
		System.out.println(al);
		System.out.println(al.get(1));
		al.set(2, "Pink");
		//al.remove(3);
		//al.clear();
		System.out.println(al);
		

	}

}
