package Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		
		String [][] arr= {{"A","B","C"}, {"D", "E", "F","G"}, {"AA","BD","FG"}};   //Arrays inside an array
		
		System.out.println(arr.length);
		System.out.println(arr[2].length);
		System.out.println(arr[0][0]);
		arr[0][0]="NVY";
		System.out.println(arr[0][0]);
		
		for(String [] x: arr) {
			for (String y : x) {
				System.out.println(y);
			}
			
			System.out.println("******************");
		}

	}

}
