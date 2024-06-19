package Studentmark;

public class Mark {
     private int id;
     private String name;
     private double mark;
     public Mark(int id ,String name ,double mark) {
    	 this.id=id;
    	 this.name=name;
    	 this.mark=mark;
     }
     public int getid() {
    	 return id;
     }
     public void setid(int id) {
    	 this.id=id;
     }
     public String getname() {
    	 return name;
     }
     public void setname(String name) {
    	 this.name=name;
     }
     public double getmark() {
    	 return mark;
     }
     public void setmark(double mark) {
    	 this.mark=mark;
     }
}
