package SourcePackage.com.myjava.ocp.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MyCilent {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("127.0.0.1", 5000);
		System.out.println("連到 Server 端");
		byte[] bytes = new byte[1024];
		while (true) {
			// 寫
			try (OutputStream output = socket.getOutputStream();) {
				int ch;
				while ((ch = System.in.read()) != 1) {
					output.write(ch);
				}
			} catch (Exception e) {
			}
			// 讀
			try (InputStream is = socket.getInputStream()) {
				int len;
				while ((len = is.read(bytes)) != -1) {
					System.out.write(bytes, 0, len);
				}
			} catch (Exception e) {
			}

		}
	}

}
