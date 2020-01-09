
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,5,1,2,6,9,3,7,4};
		int miss = findMissing(arr);
		System.out.println(miss + " is missing");
		
	}
	static int findMissing(int[] input) {
		int n = input.length;
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum += input[i];
		}
		return 45 - sum;
	}

}
