package moneycalcy;
import java.util.Scanner;
public class MainOfMoney {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Select Your Country\n--------------------\n\n1.Landon\t2.New Zealand\t3.SriLanka\t4.USA\t5.Australia");
		System.out.println();
		System.out.println();
		System.out.println("Enter your choice!!!");
		System.out.println("-----------------------");
		india ind=new india();
		int choice=scn.nextInt();
		switch(choice) {
		    case 1:
			System.out.println("Enter the Indian Currency");
			System.out.println("-------------------------");
			double rupees1=scn.nextDouble();
			ind.landon(rupees1);
			break;
		    case 2:
			System.out.println("Enter the Indian Currency");
			System.out.println("--------------------------------");
			double rupees2=scn.nextDouble();
			ind.nz(rupees2);
			break;
		    case 3:
			System.out.println("Enter the Indian Currency");
			System.out.println("----------------------------");
			double rupees4=scn.nextDouble();
			ind.sl(rupees4);
			break;
		    case 4:
			System.out.println("Enter the Indian currency");
			System.out.println("-------------------------");
			double rupees5=scn.nextDouble();
			ind.usa(rupees5);
			break;
		    case 5:
			System.out.println("Enter the Indian Currency");
			System.out.println("----------------------------");
			double rupees3=scn.nextDouble();
			ind.aus(rupees3);
			break;
		    default:System.out.println("invalid choice");
		}

	}
}
