package SourcePackage.com.myjava.ocp.lab14;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionDemo2 {
		/*
		 * Function API
		 */
	public static void main(String[] args) {
		//1. consumer
		Consumer<Integer> consumer=e -> System.out.println(e+e);
		consumer.accept(10); //accept 接受
		consumer.accept(20);
		//2. Function
		Function<Integer, Double> func= t-> t * t * 3.14;
		System.out.println(func.apply(5)); //應用
		System.out.println(func.apply(10));
		//3 . predicate
		Predicate<Integer> pre = t -> t>=60?true:false;
		System.out.println(pre.test(80));
		System.out.println(pre.test(40));
		//4 . Supplier
		Supplier<String> sup = () -> "20.8";
		System.out.println(sup.get());//取得
		//5 . biFunction
		BiFunction<Integer, Integer, Double> bf=(h,w)-> w/ Math.pow(h/100, 2);
		System.out.printf("bmi: %.2f\n",bf.apply(170, 60));
		//6. BinaryOperator (T T T)
		BinaryOperator<Double> bin= (h,w)-> w / Math.pow(h/100.0,2);
		System.out.printf("bmi: %.2f\n",bin.apply(179.0, 65.0));
	}

}
