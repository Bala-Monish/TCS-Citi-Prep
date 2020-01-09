package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

class Receiver {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Here xyz.ser is the file name where the object is
		// going to Deserialized
		FileInputStream fis = new FileInputStream("E://xyz.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Geeks g1 = (Geeks) ois.readObject();
		System.out.println("Deserialized Object Value:" + g1.i + "..." + g1.j);
	}
}
