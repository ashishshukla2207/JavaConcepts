package constructor;

public class Student {

	
	String SName;
	int Stid;
	int SRollNo;
	
	
	Student(String SName , int SRollNo){
		this.SName= SName;
		this.SRollNo=SRollNo;
		
	}
	
	public static void main(String[] args) {
		
			Student s= new Student("Ram", 23);
			System.out.println(s.SName);
			System.out.println(s.SRollNo);
	}

}
