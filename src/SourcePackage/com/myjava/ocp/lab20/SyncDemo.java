package SourcePackage.com.myjava.ocp.lab20;

class Ball implements Runnable {
	private int amount = 10;
	private synchronized void getAndPrint() { //synchronized 同步
		if (amount <=0) return;
		String tName = Thread.currentThread().getName(); // 當前的執行緒
		System.out.printf("%s 取到第 %d 顆求\n", tName, amount);
		amount--;
	}

	@Override
	public void run() {
		while(amount > 0){
			getAndPrint();
		}
		
	}

}

//同步執行緒測試
public class SyncDemo {
	public static void main(String[] args) {
		Ball ball = new Ball();
		Thread t1 = new Thread(ball,"甲");
		Thread t2 = new Thread(ball,"乙");
		t1.start();
		t2.start();
	}

}
