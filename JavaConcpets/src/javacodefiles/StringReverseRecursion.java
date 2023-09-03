package javacodefiles;

public class StringReverseRecursion {
	
	public void recursion(String str) {
		
		if (str==null || str.length()<=1) 
			
			System.out.println(str);
			
			
		
		else {
			System.out.println( str.charAt(str.length()-1));
			recursion(str.substring(0, str.length()-1));
			
			
		}
			
	}
	

	public static void main(String[] args) {
		String str= "helloashish helllo";
		StringReverseRecursion obj = new StringReverseRecursion();
		obj.recursion(str);

	}

}

