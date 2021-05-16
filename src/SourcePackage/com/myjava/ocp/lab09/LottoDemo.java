package SourcePackage.com.myjava.ocp.lab09;

import SourcePackage.com.myjava.ocp.bigLotto.BigLotto;

public class LottoDemo {
	public static void main(String[] args) {
		Lotto lotto1=new FourStarLotto();
		int[] lottoNums=lotto1.getLotto(1,9,4);
		lotto1.printLotto(lottoNums);
		
		Lotto lotto2=new FourStarLotto();
		int[] lottoNums2=lotto2.getLotto(1,46,9);
		lotto2.printLotto(lottoNums2);
	}

}