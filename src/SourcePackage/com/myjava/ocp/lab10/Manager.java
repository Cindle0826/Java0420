package SourcePackage.com.myjava.ocp.lab10;

public class Manager {
	/**
	 * 有內部類別的時候 private 可以給其他的class使用
	 */

	private String name="John";
	public void job() {
		System.out.println("管理人員");
		Tech tech=new Tech(); 
		tech.job();
	}
	
	private class Tech{
		private String name="管理人員";
		public void job() {
			System.out.println("系統開發");
		}
	}
	
	public class Sales{
		private String name="系統開發";
		public void job() {
			System.out.println("對外行銷系統產品");
			String name="工作";
			System.out.println(Manager.this.name+name+this.name);
			//Manager自己的name+自己class的name+private的name
		}
	}
}
