package SourcePackage.com.myjava.ocp.bigLotto;

import java.util.Random;

import SourcePackage.com.myjava.ocp.lab09.ALotto;

public class BigLotto extends ALotto{
	private boolean isExist(int[] nums,int n) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==n) {
				return true;
			}
		}
		return true;
	}
	
	@Override
	public int[] getLotto(int star, int end, int count) {
		Random r=new Random();
		int []lotto=new int[count];
		for(int i=0;i<lotto.length;) {
			int n=r.nextInt(end-star+1)+star;
			if(!isExist(lotto, n)) {
				lotto[i]=n;
				i++;
			}else {
				continue;//可有可無
			}
		}
		return lotto;
	}
	
	@Override
	public void printLotto(int[] lotto) {
		for(int i=0;i<lotto.length;i++) {
			System.out.printf("%d ",lotto[i]);
		}
		System.out.println();
	}
}
