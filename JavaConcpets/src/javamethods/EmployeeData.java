package javamethods;

import java.util.ArrayList;

public class EmployeeData {
	
	public String getCompName() {
		return "IBM";
	}

	public int getEMPCount() {
		return 1000;
	}
	//return array
	public Object[] getcompinfo() {
		Object comp[] = new Object[2];
		comp[0]="IBM";
		comp[1]="1000";
		return comp;	
	}
	
	//return arraylist
	
	public ArrayList<String> getEmpList() {
		System.out.println("get emp list");
		
		ArrayList<String> emplist= new ArrayList<String>();
		emplist.add("Ashish");
		emplist.add("Sonali");
		emplist.add("Milo");
		
		return emplist;
	}
	
	public static void main(String[] args) {
		
		EmployeeData obj= new EmployeeData();
		Object[] arr= obj.getcompinfo();
		for(Object ob: arr) {
			System.out.println(ob);
		}
		
		ArrayList<String> e= obj.getEmpList();
		System.out.println(e.size() + " "+ e);
	}
	

}
