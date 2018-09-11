package tr.com.fk.py4j.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class WmiTestConnection {
	public static void main(String[] args) throws IOException {

		String ip = "localhost";
		String username = "username";
		String password = "password";

		String[] cmd = { "python", "My_Python_File_Path", ip, username,
				password };
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec(cmd);

		InputStream is = process.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String line = null;

		line = br.readLine();
		System.out.print(line);

	}
}
