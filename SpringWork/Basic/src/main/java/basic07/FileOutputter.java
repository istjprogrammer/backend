package basic07;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutputter implements Outputter {
	private String filePath;
	
	@Override
	public void output(String msg) throws IOException {
		FileWriter writer = new FileWriter("C:\\konny\\Temp\\out.txt");
		writer.write(msg);
		writer.close();
	}

}
