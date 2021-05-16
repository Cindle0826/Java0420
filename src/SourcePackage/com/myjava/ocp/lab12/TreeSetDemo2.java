package SourcePackage.com.myjava.ocp.lab12;

import java.util.IntSummaryStatistics;
import java.util.TreeSet;

public class TreeSetDemo2  {
	public static void main(String[] args) {
		Exam.sort=1;
		Exam e1=new Exam("國文",80);
		Exam e2=new Exam("英文",100);
		Exam e3=new Exam("數學",90);
		TreeSet<Exam> scores=new TreeSet<Exam>();
		scores.add(e1);scores.add(e2);scores.add(e3);
		System.out.println(scores);
		//Java 8求總分與平均	
		int sum=scores.stream()
				.filter(s -> (s instanceof Exam))
				.mapToInt(s -> ((Exam)s).getScore())
				.sum();	
		double avg=scores.stream()
				.mapToInt(s -> s.getScore())
				.average().getAsDouble();
		System.out.println(sum);
		System.out.println(avg);
		//IntSummaryStatistics 總計
		IntSummaryStatistics stat=scores.stream()
				.mapToInt(e -> e.getScore())
				.summaryStatistics();
		System.out.printf("sum: %d, avg=%.2f\n",stat.getSum(),stat.getAverage());
		System.out.printf("max: %d, min=%d\n",stat.getMax(),stat.getMin());
		//最高分是哪一科 findFirst 找第一個 findAny隨便找一個
		String subject=scores.stream().filter(e -> e.getScore()== stat.getMax())
		.findFirst()
		.get()
		.getSubject();
		System.out.println(subject);
		
	}

}
