package SourcePackage.com.myjava.ocp.lab15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortDemo {
	public static void main(String[] args) {
		Integer [] nums=new Integer[10];
		IntStream.range(0, 19).forEach(i -> nums[i]= new Random().nextInt(100));
		Stream.of(nums).forEach(num ->System.out.println(num+""));
		System.out.println();
		//Java 7 排序
        Arrays.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        Stream.of(nums).forEach(num -> System.out.print(num + " "));
        System.out.println();
        //Java 8 排序
        Arrays.sort(nums, (o1, o2) -> o1 - o2);
        Stream.of(nums).forEach(num -> System.out.print(num + " "));
        System.out.println();
	}
}
