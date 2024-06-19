package BusReservation;

import java.util.Scanner;
import java.util.ArrayList;
public class mainOFResv {
	public static void main(String[] args) {
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,true,45));
		buses.add(new Bus(3,true,45));
         int userOpt=1;
         Scanner scn=new Scanner(System.in);
         for(Bus b:buses) { //forEach Loop
        	 b.displayBusInfo();
         }
         while(userOpt==1) {
        	 System.out.println("Enter 1 booking and 2 to exit");
        	 userOpt=scn.nextInt();
        	 if(userOpt==1) {
        		 Booking booking=new Booking();
        		 if(booking.isAvailable(bookings,buses)) {
        			 bookings.add(booking);
        			 System.out.println("Your booking is comfirmed");
        		 }
        		 else {
        			 System.out.println("Sorry,Bus is Full,try another Bus or Date...");
        		 }
        	 }
         }
	}
}
