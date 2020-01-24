import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {

	public static void main(String[] args) throws IOException {
		String str = "pwwkewabc";
		System.out.println(lengthOfLongestSubstring(str));
	}
    
    public static int lengthOfLongestSubstring(String s) {
    
    HashMap<Character, Integer> seen = new HashMap<Character, Integer>();
    int result = 0;
    StringBuilder sub = new StringBuilder();
    for(int i=0; i< s.length(); i++) {
        if(seen.containsKey(s.charAt(i))) {
            i = seen.get(s.charAt(i)) + 1;
            seen.clear();
            sub = new StringBuilder();
        }
        sub.append(s.charAt(i));
        seen.put(s.charAt(i), i);
        
        if(sub.length() > result)
            result = sub.length();
    }
    return result;
}

}

