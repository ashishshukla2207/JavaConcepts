package javacodefiles;

import java.util.LinkedHashMap;
import java.util.Map;

public class LetterCount {
    public static void main(String[] args) {
        //your input string
        String str = "aabbcccddd";
        //split your input into characters
        String chars[] = str.split("");
        //maintain a map to store unique character and its frequency
        Map<String, Integer> compressMap = new LinkedHashMap<String, Integer>();
        //read every letter in input string
        for(String s: chars) {
            //java.lang.String.split(String) method includes empty string in your 
            //split array, so you need to ignore that
            if("".equals(s))
                continue;
            //obtain the previous occurances of the character
            Integer count = compressMap.get(s);
            //if the character was previously encountered, increment its count
            if(count != null)
                compressMap.put(s, ++count);
            else//otherwise store it as first occurance
                compressMap.put(s, 1);
        }
        //Create a StringBuffer object, to append your input
        //StringBuffer is thread safe, so I prefer using it
        //you could use StringBuilder if you don't expect your code to run
        //in a multithreaded environment
        StringBuffer output = new StringBuffer("");
        //iterate over every entry in map
        for (Map.Entry<String, Integer> entry : compressMap.entrySet()) {
            //append the results to output
            output.append(entry.getValue()).append(entry.getKey());
        }
        //print the output on console
        System.out.println(output);
    }
}