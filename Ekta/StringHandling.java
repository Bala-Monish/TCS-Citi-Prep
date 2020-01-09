public class StringHandling {

	public static void main(String[] args) {
		String input = "i am happy";
		int vcount = 0, count = 0;
		String[] fields = input.split(" ");
		input.toCharArray();
		try {

			for (String field : fields) {
				for (int i = 0; i < field.length(); i++) {
					if ((field.charAt(i)) == 'e' || (field.charAt(i)) == 'i' || (field.charAt(i)) == 'a'
							|| (field.charAt(i)) == 'o' || (field.charAt(i)) == 'u' || (field.charAt(i)) == 'y') {
						vcount++;
					} else
						count++;
				}
			}
		} catch (Exception e) {
			System.out.print(e);
		}
		System.out.print("Consonents are  " + count + "\n Vowels are " + vcount);
	}
}