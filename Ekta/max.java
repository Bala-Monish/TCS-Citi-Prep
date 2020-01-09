
public class max {

	public static void main(String[] args) {
		int[] arr = {5,10,6,7,9,20};
		 int max = 0;
		 for(int i = 0; i < arr.length ; i++ ) {
			 if (arr[i] > max)
				 max = arr[i];
		 }
		System.out.println(max);
	}

}
