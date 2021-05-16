package SourcePackage.com.myjava.ocp.lab13;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		//stack 堆疊
		Stack<Integer> stack=new Stack<>();
		//push放入資料 pop放出資料
		stack.push(100);
		stack.push(90);
		stack.push(80);
		System.out.println(stack);
		while(stack.size()>0) {
		int n=stack.pop();
		System.out.printf("取出 %d,stack =%s\n",n,stack);
		}
	}
}
