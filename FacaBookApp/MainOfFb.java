package FacaBookApp;
import java.util.Scanner;
public class MainOfFb {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	fbLogic fb=new fbLogic();
	System.out.println("1.phone number\n2.Email Account");
	int choice=scn.nextInt();
	switch(choice) {
	case 1:
		System.out.println("Enter the phone number");
		long phno=scn.nextLong();
		System.out.println("Enter the password");
		int password1=scn.nextInt();
		fb.login(phno, password1);
		break;
	case 2:
		System.out.println("Enter the Email account");
		String email=scn.next();
		System.out.println("Enter the password");
	    int password2=scn.nextInt();
	    fb.login(email, password2);
	    break;
		default:System.out.println("Invalid choice");
	}
}
}
