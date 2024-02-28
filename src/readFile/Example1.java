package readFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example1 {
	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {

			// absolute path
			in = new FileInputStream(
					"C:/Users/hongp/Documents/workspace-spring-tool-suite-4-4.21.0.RELEASE/demo_java/src/readFile/input.txt");

			out = new FileOutputStream("outagain.txt");
			int c;

			while ((c = in.read()) != -1) {
				out.write(c);
			}
		}   finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
			System.out.println("END");
		}
	}
}
