package SourcePackage.com.myjava.ocp.lab19;

class Father extends Thread {
	@Override
	public void run() {
		System.out.println("爸爸下班回家");
		System.out.println("爸爸想洗熱水澡");
		System.out.println("爸爸發現沒瓦斯了");
		System.out.println("爸爸打電話請瓦斯工人送瓦斯");
		worker worker = new worker();
		worker.start();
		try {
			worker.join(10000);//最多等10秒
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("爸爸開始洗澡");
		System.out.println("爸爸洗完澡了");
	}
}

class worker extends Thread {
	@Override
	public void run() {
		System.out.println("工人送瓦斯");
		for (int i = 1; i < 6; i++) {
			try {
				Thread.sleep(1000);
				System.out.printf("%d 秒鐘", i);
			} catch (Exception e) {
				System.out.println("工人發生意外");
			}
		}
		System.out.println("瓦斯送到了");
	}
}

public class JoinDemo {
	public static void main(String[] args) {
		Father father=new Father();
		father.start();
	}
}
