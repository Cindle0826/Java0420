package SourcePackage.com.myjava.ocp.lab20;

class Cookies {
	/*
	 * 放餅乾的時候才能吃 吃餅乾的時候不能放 所以用synchronized 吃完的時候才叫主人來放第二個餅乾
	 */
	private boolean isEmpty = true;
	public synchronized void put(int n) {
		while(!isEmpty) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.printf("主人放第 %d 塊餅乾\n", n);
		isEmpty = false;
		notifyAll();
	}

	public synchronized void eat(int n) {
		while(isEmpty) {
			try {
				wait();// 進入等待
			} catch (InterruptedException e) {
			}
		}
		System.out.printf("小狗吃第 %d 塊餅乾\n", n);
		isEmpty = true;
		notifyAll();// 呼叫小狗
	}
}

public class DogAndMaster {
	public static void main(String[] args) {
		Cookies cookies = new Cookies();
		Runnable r1 = () -> {
			for (int i = 1; i <= 10; i++) {
				cookies.put(i); // 放餅乾
			}
		};
		Runnable r2 = () -> {
			for (int i = 1; i <= 10; i++) {
				cookies.eat(i); // 吃餅乾
			}
		};
		new Thread(r1, "主人").start();
		new Thread(r2, "小狗").start();
	}

}
