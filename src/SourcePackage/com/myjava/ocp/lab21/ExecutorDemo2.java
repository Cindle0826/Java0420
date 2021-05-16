package SourcePackage.com.myjava.ocp.lab21;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Runner implements Runnable{

	@Override
	public void run() {
		System.out.println("Runner");
		
	}
	
	
}

class caller implements Callable<String>{

	@Override
	public String call() throws Exception {
		
		return "caller";
	}
	
}

public class ExecutorDemo2 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future f1 = es.submit(new Runner());
		Future f2 = es.submit(new caller());
		System.out.println(f1.get());
		System.out.println(f2.get());
		es.shutdown();
	}

}
