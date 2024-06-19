package yearcalculator;

public  class second extends calculator {

	@Override
	public void sec() {
		int seconds=1;
		int mint=0;
		for(int s=0;s<seconds;s++) {
			seconds++;
			if(seconds%60==0) {
				
				System.out.println(seconds+" second is "+mint+" mints");
				mint++;
			}
			
		}
	}

}
