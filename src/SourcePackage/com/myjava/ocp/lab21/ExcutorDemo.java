package SourcePackage.com.myjava.ocp.lab21;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.Executor;

class MyTime implements Runnable {

	@Override
	public void run() {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.printf("現在時間: %s\n", sdf.format(now));

	}
}

class MyLotto implements Runnable {

	@Override
	public void run() {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.printf("Lotto 號碼: %s\n",new Random().nextInt(100));

	}

}

class MyExecutor implements Executor {

	@Override
	public void execute(Runnable r) {
		new Thread(r).start();

	}

}

public class ExcutorDemo {
	public static void main(String[] args) {
		MyExecutor exec = new MyExecutor();
		exec.execute(new MyTime());
		exec.execute(() -> {
			System.out.println("Hello");
		});
	}

}
