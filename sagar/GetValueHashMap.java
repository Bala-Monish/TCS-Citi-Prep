import java.io.*;
import java.util.*;

public class Practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		HashMap<String, String> table = new HashMap<>();
		String[][] db = new String[][] { { "admin", "adminPassword"}, {"frankly", "mr.shankly"}, {"sarah" , "india123"}, { "smith", "rocking" }, {"sagar", "roadclever" } };
		for(int i=0; i< 5; i++)
			table.put(db[i][0], db[i][1]);
		System.out.println("Enter username to view password: ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String user = in.readLine();
		
		System.out.println("The password is: " + table.get(user));
		
		
	}
}
