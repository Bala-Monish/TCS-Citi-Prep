
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 3, 45, 12, 6, 0, 2352};
		int max = findMax(arr);
		System.out.println(max + " is the maximum");
		
	}
	static int findMax(int[] input) {
		int n = input.length;
		int max = input[0];
		for(int i = 0; i < n; i++) {
			if(input[i] > max)
			{
				max = input[i];
			}
		}
		return max;
	}

}
