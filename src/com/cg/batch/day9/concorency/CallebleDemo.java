package com.cg.batch.day9.concorency;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallebleDemo implements Callable<Integer> {
	public int getNum() {
		int total = 0;
		for (int i = 1; i < 10; i++) {
			total = total + i;
		}
		return total;
	}

	@Override
	public Integer call() throws Exception {
		return getNum();
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CallebleDemo mt1 = new CallebleDemo();
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		Future<Integer> future = executorService.submit(mt1);

		Integer total = future.get();

		System.out.println(total);
		executorService.shutdown();
	}
}
