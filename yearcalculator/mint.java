package yearcalculator;

public  class mint extends calculator {
	@Override
	public void min() {
		int mint=0;
	      double hr=0;
		for(int m=0;m<=60;m++) {
			mint++;
			if(mint%60==0) {
				 hr++;
			}
			System.out.println(mint+" mint is "+hr+" hours ");
		}
	}


}
