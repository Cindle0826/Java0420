package SourcePackage.com.myjava.ocp.testing;

import org.junit.Assert;
import org.junit.Test;

import SourcePackage.com.myjava.ocp.lab16.Square;

public class TestSquare {
	@Test
	public void test() {
		int x = 10, y = 20, h = 4;
		int exp = 60;
		Square sq = new Square();
		int act = sq.getArea(x, y, h);// 實際產出的值

		Assert.assertEquals(exp, act);
	}
	
	public TestSquare() {
		System.out.println("物件開始");
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("Square 物件結束");
	}

}
