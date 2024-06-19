package Studentmark;

public class MainOfMark {
	public static void main(String[] args) {
		Mark s1=new Mark(1,"arun",78.9);
		Mark s2=new Mark(2,"arjun",82.9);
		Mark s3=new Mark(3,"james",82.9);
		Mark s4=new Mark(4,"anu",72.9);
	 	if(s2.getmark()==s1.getmark()) {
			s1.setmark(s1.getmark()+5);
			System.out.println(s1.getmark());
		}
		if(s2.getmark()==s3.getmark()) {
			s3.setmark(s3.getmark()+5);
			System.out.println(s3.getmark());
		}
		if(s2.getmark()==s4.getmark()) {
			s4.setmark(s4.getmark()+5);
			System.out.println(s4.getmark());
		}
	}
}

