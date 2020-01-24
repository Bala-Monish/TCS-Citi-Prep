import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {

	public static void main(String[] args) throws IOException {
		String data = "aababbbbbababbaaaaaaaaab";
		System.out.println(replaceString(data));
	}
	public static int replaceString(String str) {
		int result = 0;
		int i = 0;
		while(i<str.length()) {
			int next = i+1;
			while(next < str.length() && str.charAt(i) == str.charAt(next)) next++;
			
			int distance = next - i;
			
			result += distance / 3;
			
			i = next;
		}
		return result;
		
	}
}

