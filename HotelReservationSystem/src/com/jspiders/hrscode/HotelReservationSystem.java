package com.jspiders.hrscode;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HotelReservationSystem {
	private static final String url="jdbc:mysql://localhost:3306/hoteldb";
	private static final String user="root";
	private static final String password="root";
	public static void main(String[] args) {
		try {
               Class.forName("com.mysql.cj.jdbc.Driver");//loading driver
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try { //create/establish connection
			Connection con=DriverManager.getConnection(url,user,password);
			while(true) {
				System.out.println();
				System.out.println("HOTEL MANAGEMENT SYSTEM");
				Scanner scn=new Scanner(System.in);
				System.out.println("1. Reserve a room\n2. view Reservations\n3. Get Room Number\n4. Update Reservations\n5. Delete Reservations\n0. Exist\n Choose an option : ");
				int choice=scn.nextInt();
				switch(choice) {
				case 1: reserveRoom(con,scn);
					break;
				case 2:viewReservation(con);
					break;
					case 3:getRoomNumber(con,scn);
						break;
					case 4:updateReservation(con,scn);
						break;
					case 5:deleteReservation(con,scn);
						break;
					case 0: exit();
					default:System.out.println("invalid choice. try agian");
				}
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(InterruptedException e1) {
			throw new RuntimeException(e1);
		}
	}
	//method for adding the user
	private static void reserveRoom(Connection con,Scanner scn) {
		System.out.println("Enter Guest Name : ");
		String name=scn.next();
		System.out.println("Enter Room No : ");
		int roomno=scn.nextInt();
		System.out.println("Enter Contact Number : ");
		String contact=scn.next();
		String query1="INSERT INTO RESERVATIONS(GUESTNAME,ROOMNO,CONTACT)"+ "VALUES('"+name+"',"+roomno+",'"+contact+"')";
		try
		{
			Statement stmt=con.createStatement();
			int count=stmt.executeUpdate(query1);
			if(count>0) {
				System.out.println("Reservation Successful..!!!");
			}
			else {
				System.out.println("Reservation failed..!!!");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	//method for view the reservation
	private static void viewReservation(Connection con) {
		String query2="SELECT ID,GUESTNAME,ROOMNO,CONTACT,DATE FROM RESERVATIONS";
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query2);
			System.out.println("Current Reservation : ");
			System.out.println("+--------------+------------+-------- ----+----------------+------------------+");
			System.out.println("|Reservation ID| Guest Name | Room Number | Contact Number | reservation Date |");
			System.out.println("+--------------+------------+-------- ----+----------------+------------------+");
			while(rs.next()) {
				int id =rs.getInt("id");
				String name=rs.getString("guestname");
				int roomno=rs.getInt("roomno");
				long contact=rs.getLong("contact");
				String date=rs.getTimestamp("date").toString();
				//format and display  the  reservation data in a table like format
				System.out.printf("|%-14d | %-15s | %-13d | %-20s | %-19s | \n",id,name,roomno,contact,date);//c program format
				System.out.println("+--------------+------------+-------- ----+----------------+------------------+");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	//method getting the room details
	private static void getRoomNumber(Connection con,Scanner scn) {
		System.out.println("Enter Reservation Id : ");
		int id=scn.nextInt();
		System.out.println("Enter Guest Name : ");
		String name=scn.next();
		String query3="SELECT ROOMNO FROM RESERVATIONS WHERE ID="+id+" AND GUESTNAME="+name+"'";
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query3);
			if(rs.next()) {
				int room=rs.getInt("roomno");
				System.out.println("Room Number For Reservation ID"+id+"Guest Name"+name+"is "+room);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	//method for reservation exist checking
	private static boolean reservationExists(Connection con,int id) {
		String query4="SELECT ID FROM RESERVATIONS WHERE ID="+id;
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query4);
			return rs.next();//if there is a result, the reservations will wxists
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
//method for update the reservation
	private static void updateReservation(Connection con,Scanner scn) {
		System.out.println("Enter the reservation ID to update : ");
		int id=scn.nextInt();
		scn.nextLine();//consume the new line charecter
		if(!reservationExists(con,id)) {
			System.out.println("Reservation is not found given id");
			return;
		}
		System.out.println("Enter new Guest Name : ");
		String newName=scn.nextLine();
		System.out.println("Enter new Room Number : ");
		int newRoomNo=scn.nextInt();
		System.out.println("Enter new Contact number : ");
		long newContact=scn.nextLong();
		String query5="UPDATE RESERVATIONS SET GUESTNAME ='"+newName+"',"+"ROOMNO="+newRoomNo+","+"CONTACT='"+newContact+","+"WHERE ID = "+id;
		try {
			Statement stmt=con.createStatement();
			int count=stmt.executeUpdate(query5);
			if(count>0) {
				System.out.println("Reservation updated successfully!!!!");
			}
			else {
				System.out.println("Reservation updated failed!!!!");
			}
		}
		catch(Exception e){
			e.printStackTrace(); 
		}
	}
	//method for  delete reservation
	private static void deleteReservation(Connection con,Scanner scn) {
		System.out.println("Enter Reservation id to delete : ");
		int id=scn.nextInt();
		if(reservationExists(con,id)) {
			System.out.println("Reservation is not found for given id");
			return;
		}
		String query6="DELETE FROM RESERVATIONS WHERE ID= "+id;
		try {
			Statement stmt=con.createStatement();
			int count=stmt.executeUpdate(query6);
			if(count>0) {
				System.out.println("Reservation delete Successfully!!!");
			}
			else {
				System.out.println("Reservation delete is failed!!!");
			}
		}
		catch(Exception e) {
			e.printStackTrace(); 
		}
	}
	//method for exit the reservation
	public static void exit() throws InterruptedException {
		System.out.println("Existing System");
		int i=5;
		while(i!=0) {
			System.out.println(".");
			Thread.sleep(1000);
			i--;
		}
		System.out.println();
		System.out.println("ThankYou For Hotel Reservation System!!!!! ");
	}
}

