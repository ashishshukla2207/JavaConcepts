package Arrays;

public class TwoDExample {

	public static void main(String[] args) {
		
		int myarray[][]= {
				{1,2,3}	,
				{4,5,6,7,8},
				{9,10,11,12}
		
		};
		
		for(int i=0; i<myarray.length; i++) {
			for(int j=0; j<myarray[i].length; j++) {
				
				System.out.print(myarray[i][j] + " "); 
			}
			
			System.out.println();
		}
		
		
		}

}
