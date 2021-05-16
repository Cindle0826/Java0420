package SourcePackage.com.myjava.ocp.lab10;


interface Calc{
	boolean check(int n);
}

public class LambdaDemo {
	public static void main(String[] args) {
		int[]scores= {100,50,70,40};
		//Java 7
		checkScore(scores,new Calc() {
			
			@Override
			public boolean check(int n) {
				if(n>=60) {
					return true;
				}else {
					return false;	
				}
			}
		});
		//Java 8 Lambda會自動判斷型別
		checkScore(scores,(int n)->(n>=60)?true:false);
		checkScore(scores,n->(n>=80)?true:false);
		checkScore(scores,n->{return (n>=80)?true:false;});
		
		Calc case1=n->(n>=60)?true:false;
		Calc case2=n->(n>=80)?true:false;
	}
	
	public static void checkScore(int []scores,Calc calc) {
		for(int score:scores) {
			if(calc.check(score)) {
				System.out.println(score);
			}
		}
	}
}
