package SourcePackage.com.myjava.ocp.des.utils;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class GenKey {
	private KeyGenerator keygen;
	private SecretKey deskey;
	
    public SecretKey getNewSecretKey() {
        try {
            keygen = KeyGenerator.getInstance("DES");
            // 生成密鑰
            deskey = keygen.generateKey();
        } catch (Exception e) {
            System.out.println("Fail");
        }
        return deskey;
    }
	public static void main(String[] args) {
		GenKey genKey = new GenKey();
		SecretKey secretKey=genKey.getNewSecretKey();
		for(byte b : secretKey.getEncoded()) {
			System.out.print(b);
		}
		String path = "/Users/cindle/Eclipse_Java/Java0420/src/SourcePackage/com/myjava/ocp/des/utils/mydeskey_%d.bin";
		try(FileOutputStream fos = new FileOutputStream(String .format(path,new Date().getTime()));
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(secretKey);
			System.out.println("金鑰寫檔完成");
		} catch (Exception e) {
			
		}
	}
}
