package SourcePackage.com.myjava.ocp.lab16.User.exception;

public class UserException extends Exception {

	public UserException(String string) {
		super(string);
		
	}
	
	public void how2do() {
		System.out.println("請重新登入");
	}
	
}
