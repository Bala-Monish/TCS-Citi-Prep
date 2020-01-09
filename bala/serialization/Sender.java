package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Sender { 
    public static void main(String[] args) throws IOException 
    { 
        Geeks g = new Geeks(); 
        // Here xyz.ser is the file name where the object is 
        // going to serialize 
        FileOutputStream fos = new FileOutputStream("E://xyz.txt"); 
        ObjectOutputStream oos = new ObjectOutputStream(fos); 
        oos.writeObject(g); 
        System.out.println("Wrote Object");
    } 
} 
