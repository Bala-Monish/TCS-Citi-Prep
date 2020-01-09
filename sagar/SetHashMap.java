import java.io.*;
import java.util.*;

public class Practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		HashMap<String, String> table = new HashMap<>();
		String[][] db = new String[][] { { "admin", "adminPassword"}, {"frankly", "mr.shankly"}, {"sarah" , "india123"}, { "smith", "rocking" }, {"sagar", "roadclever" } };
		for(int i=0; i< 5; i++)
			table.put(db[i][0], db[i][1]);
		System.out.println("Enter username: ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String user = in.readLine();
		System.out.println("Enter password: ");
		String pass = in.readLine();
		
		System.out.println("Before setting value, the users are:");
		Iterator it = table.keySet().iterator();
		while(it.hasNext()) {
			System.out.print(" " + it.next());
		}
		table.put(user, pass);
		System.out.println("Set successfully!");
		
		System.out.println("After setting value, the users are");
		it = table.keySet().iterator();
		while(it.hasNext()) {
			System.out.print(" " + it.next());
		}
	}
}
