package SourcePackage.com.myjava.ocp.lab14;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionDemo {
	public static void main(String[] args) {
		//1. consumer
		Consumer<Integer> consumer=e -> System.out.println(e+e);
		play(10, consumer);
		//2. Function
		Function<Integer, Double> func= t-> t * t * 3.14;
		System.out.println(play(10, func));
		//3 . predicate
		Predicate<Integer> pre = t -> t>=60?true:false;
		System.out.println(play(80, pre));
		System.out.println(play(40, pre));
		//4 . Supplier
		Supplier<String> sup = () -> "20.8";
		System.out.println("氣溫:" + play(0,sup));
		//5 . biFunction
		BiFunction<Integer, Integer, Double> bf=(h,w)-> w/ Math.pow(h/100, 2);
		System.out.println(play(170, 60,bf));
	}

	public static void play(int x, Consumer consumer) {
		consumer.accept(x);//有進沒出
	}

	public static Object play(int x, Function function) {
		return function.apply(x);//有進有出
	}

	public static Boolean play(int x, Predicate predicate) {
		return predicate.test(x);
	}

	public static String play(int x, Supplier<String> supplier) {
		return supplier.get();
	}
	
	public static Double play(Integer h,Integer w,BiFunction<Integer, Integer, Double> biFunction) {
		return  biFunction.apply(h, w);
	}
}
