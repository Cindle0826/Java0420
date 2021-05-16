package SourcePackage.com.myjava.ocp.lab10;

interface update{
	int add(int n);
}

public class LambdaDemo2 {
	public static void main(String[] args) {
		int []scores= {10,20,30};
		updateScope(scores, n->n*2);
		//匿名類別
		updateScope(scores, new update() {
			
			@Override
			public int add(int n) {
				return n*2;
			}
		});
	}
	public static void updateScope(int [] scores,update update) {
		for(int score:scores) {
			int new_score=update.add(score);
			System.out.println(new_score);
		}
	}
}
