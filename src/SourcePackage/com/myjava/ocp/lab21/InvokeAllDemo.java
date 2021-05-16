package SourcePackage.com.myjava.ocp.lab21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAllDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<Integer> callable= () -> new Random().nextInt(100);
		Collection<Callable<Integer>> list = new ArrayList<>();
		list.add(() ->new Random().nextInt(100));
		list.add(() ->new Random().nextInt(100));
		list.add(() ->new Random().nextInt(100));
		list.add(() ->new Random().nextInt(100));
		list.add(() ->new Random().nextInt(100));
		ExecutorService service= Executors.newCachedThreadPool();
		List<Future<Integer>> result=service.invokeAll(list);
		System.out.println(result);
		service.shutdown();
	}

}
