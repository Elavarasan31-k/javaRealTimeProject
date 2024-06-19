package yearcalculator;


public class day extends calculator {
	@Override
	public void days() {
		int day=0;
	      int yr=0;
		for(int d=0;d<=365;d++) {
			day++;
			if(day%365==0) {
				 yr++;
			}
			System.out.println(day+" day is "+yr+" years");
		}
	}


}