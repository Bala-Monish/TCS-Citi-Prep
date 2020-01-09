
public class CheckPalindrome {
	public static void main(String[] args) {
		String palin = "malaya";
		int len = palin.length();
		int left = 0;
		int right = len -1;
		boolean result = false;
		while(left != right) {
			if(palin.charAt(left) == palin.charAt(right)) {
				result = true;
				left++;
				right--;
			}
			else
			{
				result = false;
				break;
			}
			
		}
		System.out.print("the result is "+result);
	}
}
