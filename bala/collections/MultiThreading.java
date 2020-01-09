package collections;

import java.util.List;
import java.util.Vector;

public class MultiThreading implements Runnable{
	List<String> vector = new Vector<String>();
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		vector.add("B");
		vector.add("A");
		vector.add(null);
		vector.add("B");
		vector.add("ghfgh");
		System.out.println(vector);
		
	}
	public static void main(String[] args) {
		
		for(int i = 0; i< 5; i++) {
			Thread myThread = new Thread(new MultiThreading());
			myThread.start();
		}
			
	}

	

}
