package SourcePackage.com.myjava.ocp.socket;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MySever {
	public static void main(String[] args) throws Exception {
		/*
		 * 先執行MySever 在執行Client
		 */
        ServerSocket server = new ServerSocket(5000);
        System.out.println("等待 Client 連入");
        Socket socket = server.accept(); // 等待 Client 連入
        System.out.println("Client port: " + socket.getPort());
        byte[] bytes = new byte[1024];
        while (true) {
            // 讀
            try(InputStream is = socket.getInputStream()) {
                int len;
                while ((len = is.read(bytes)) != -1) {                    
                    System.out.write(bytes, 0, len);
                }
            } catch (Exception e) {
            }
            // 寫
            try (OutputStream output = socket.getOutputStream();) {
                int ch;
                while ((ch = System.in.read()) != 1) {
                    output.write(ch);
                }
            } catch (Exception e) {
            }
        }
    }
}
