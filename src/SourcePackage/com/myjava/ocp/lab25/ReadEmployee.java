package SourcePackage.com.myjava.ocp.lab25;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class ReadEmployee {

	public static void main(String[] args) {
		String path = "src/SourcePackage/com/myjava/ocp/lab25/emp3.bin";
		try(FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			//讀出物件
			Employee emp = (Employee) ois.readObject();
			System.out.println(emp);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
