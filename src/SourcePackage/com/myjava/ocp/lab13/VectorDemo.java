package SourcePackage.com.myjava.ocp.lab13;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>(650,5);//vector的預設空間是10
		//capacity 是空間 可以自己設定  不夠用了才增加容積單位 增長係數=1 100% 70 70% 超前部署
		for(int i=1;i<=650;i++) {
			v.add(i);
		}
		v.add(999);
		System.out.printf("capacity: %d\nsize: %d\n",v.capacity(),v.size());
	}

}
