package SourcePackage.com.myjava.ocp.lab19;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

class lotto implements Callable<Integer>{
	/*
	 * 建立樂透類別在實作callable
	 */
	@Override
	public Integer call() throws Exception {
		Thread.sleep(10);
		int n = new Random().nextInt(100);
		return n;
	}
	
}

public class CallableDemo {
	public static void main(String[] args) throws Exception{
		lotto lotto = new lotto();
		FutureTask<Integer> task = new FutureTask<Integer>(lotto);
		new Thread(task).start();
		System.out.println(task.get(3, TimeUnit.SECONDS));//最多等你三秒
		System.out.println("其他工作...");
	}

}
