package p1001;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {

		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "안녕하세요 말하는 감자에요".getBytes();
		os.write(data);
		os.flush();
		os.close();

	}

}
