package AtmMachine;
import java.util.Scanner;
public class MainofClass {
	public static void main(String[] args) throws InsufficientBalanceException,IncorrectpinException
	{
		Scanner sc=new Scanner(System.in);
		int bal=5000;
		int atmpin=1234;
		System.out.println("Enter the pin");
		int pin=sc.nextInt();
		if(pin==atmpin) {
			System.out.println("Enter your amt");
			int amt=sc.nextInt();
			if(amt<=bal) {
				System.out.println("Transaction Successfull...");
				System.out.println("Available balance ="+(bal-amt));
			}
			else {
				throw new InsufficientBalanceException();
			}
			
		}
		else
		{
			throw new IncorrectpinException();
		}
	
	}
}
