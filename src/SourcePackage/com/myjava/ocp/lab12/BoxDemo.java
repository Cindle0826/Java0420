package SourcePackage.com.myjava.ocp.lab12;

public class BoxDemo {
	public static void main(String[] args) {
		Pen pen=new Pen();
		pen.setColor("red");
		
		Paper paper=new Paper();
		
		paper.setSize("M");
		
		Box<Pen> b1=new Box<Pen>();
		b1.setT(pen);
		System.out.println(b1.getT().getColor());
		
		Box<Paper> b2=new Box<Paper>();
		b2.setT(paper);
		System.out.println(b2.getT().getSize());
		
		Box[] boxs= {b1,b2};
		for(Box box:boxs) {
			if(box.getT() instanceof Pen) {
				System.out.println(((Pen)box.getT()).getColor());
			}else if(box.getT()instanceof Paper) {
				System.out.println(((Paper)box.getT()).getSize());
			}
		}
		
	}
	
}
