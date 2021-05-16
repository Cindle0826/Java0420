package SourcePackage.com.myjava.ocp.lab12;

public class Exam implements Comparable<Exam>{
	public static int sort =1;
	private String subject;
	private Integer score; //Integer沒資料能有null int 只能有0
	
	public Exam() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Exam(String subject, Integer score) {
		super();
		this.subject = subject;
		this.score = score;
	}



	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}



	@Override
	public String toString() {
		return "Exam [subject=" + subject + ", score=" + score + "]";
	}



	@Override
	public int compareTo(Exam o) {
		return (score- o.score)*sort; //由小到大 
	}
	
	
	
}
