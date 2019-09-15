import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamOfExample {

	public static void main(String[] args) throws IOException {
		InputStream io = new FileInputStream(new File("F:/test.txt"));
		BufferedReader reader = new BufferedReader(new InputStreamReader(io));
		StringBuilder out = new StringBuilder();
		String line;
		while((line = reader.readLine()) != null){
			if(line.contains("m")) out.append((line+"-"));
			else out.append(line);
			
		}
		System.out.println(out.toString());
		reader.close();
	}

	
}
