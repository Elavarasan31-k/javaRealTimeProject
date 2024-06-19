package BusReservation;

public class Bus {
       private int busno;
       private boolean ac;
       private int capacity; //get and set methods
        public Bus(int busno,boolean ac,int capacity) {
        	this.busno=busno;
        	this.ac=ac;
        	this.capacity=capacity;
        }
        public int getbusno() {
        	return busno;
        }
        public void setbusno(int busno) {
        	busno=busno;
        }
        public boolean getac() {
        	return ac;
        }
        public void setac() {
        	ac=ac;
        }
        public int getCapacity() { //accessor method
        	return capacity;
        }
        public void serCapacity(int capacity) {//mutator
        	capacity=capacity;
        }
        public void displayBusInfo() {
        	System.out.println("Bus No:" + busno + " Ac:" + ac + " Total Capacity: "+ capacity);
        }
        
}
