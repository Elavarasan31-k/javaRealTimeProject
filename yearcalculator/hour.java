package yearcalculator;


public  class hour extends calculator {
	@Override
	public void hr() {
		double hr=0;
	      int day=0;
		for(int h=0;h<=24;h++) {
			hr++;
			if(hr%24==0) {
				 day++;
			}
			System.out.println(hr+" hour is "+day+" days");
		}
	}


}
