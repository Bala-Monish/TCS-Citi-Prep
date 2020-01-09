package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FilesExample {
	public static void main(String[] args) throws IOException {
		List<String> fileLines = Files.readAllLines(Paths.get("E://xyz.txt"));
		System.out.println(fileLines);
		
	}
}
