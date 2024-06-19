package yearcalculator;
import java.util.Scanner;
public class MainOfYear {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
             year y=new year();
             System.out.println("you check the timeline");
             System.out.println("-------------------------");
             System.out.println("\n1.mints\n2.hours\n3.days\n4.year");
             int choice=scn.nextInt();
             switch(choice) {
             case 1:
            	 System.out.println("Enter the seconds!!!!");
                 System.out.println("---------------------");
                 int seconds=scn.nextInt();
                 y.print(new second());
                 break;
             case 2:
            	 System.out.println("Enter the mints!!!!");
                 System.out.println("----------------------");
                 int mint=scn.nextInt();
                 y.print(new mint());
                 break;
             case 3:
            	 System.out.println("Enter the Hours!!!!");
                 System.out.println("----------------------");
                 double hr=scn.nextDouble();
                 y.print(new hour());
                 break;
             case 4:
            	 System.out.println("Enter the Days!!!!");
                 System.out.println("---------------------");
                 int days=scn.nextInt();
                 y.print(new day());
                 break;
             default:System.out.println("invalid msg");
             }
             
	}
}
