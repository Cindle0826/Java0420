package SourcePackage.com.myjava.ocp.lab11;

enum USCurrency {
	PENNY(1),
	NICKLE(5),
	DIME(10),
	QUARTER(25);
	
	private int value;
	private USCurrency(int value) { //他是一個SingleTone的結構
		this.value=value;
	}
	public int getValue() {
		return value;
	}
}

public class Coin {
	public static void main(String[] args) {
		USCurrency usCoin=USCurrency.QUARTER;
		System.out.println(usCoin.getValue()+"美分");
	}
}
