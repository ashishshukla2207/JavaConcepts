package programs;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {

	public static void NonRepeated(String str) {
		
		int counter=1;
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			
			if(map.containsKey(str.charAt(i))) {
				
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
				
			}
			
			else {
				
				map.put(str.charAt(i), counter);
			}
		}
		
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				break;
			}
			
			
		}
		
		
	}
	public static void main(String[] args) {
		String str= "aabbccdde";
		NonRepeated(str);

	}

}
