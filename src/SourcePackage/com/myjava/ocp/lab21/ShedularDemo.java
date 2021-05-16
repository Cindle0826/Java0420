package SourcePackage.com.myjava.ocp.lab21;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ShedularDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		int money = new Random().nextInt(10000);
		System.out.printf("匯款 $%d n",money);
		Callable<Integer> callable = () ->1000;
		ScheduledExecutorService service=Executors.newSingleThreadScheduledExecutor();
		ScheduledFuture<Integer> future=service.schedule(callable, 3, TimeUnit.SECONDS);
		System.out.printf("得到 $%d 元\n",future.get());
		service.shutdown();
	}

}
