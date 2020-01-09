
public class reverse {
	public static void main(String []args) {
		String str = "abaad";
		int len = str.length();
		System.out.println(len);
		char [] rev = new char[len];
		int j = 0;
		for(int i = len;i > 0;i--) {
			rev [j] = str.charAt(i-1);
			System.out.println(rev[j]);
			j++;
		}
		System.out.println(rev);
	}

}
