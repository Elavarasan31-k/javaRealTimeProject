package yearcalculator;


public  class year  {
	public void print(calculator c) {
		if(c instanceof second) {
              second s=(second)c;
              s.sec();
		}
		else if(c instanceof mint) {
            mint m=(mint)c;
            m.min();
		}
		else if(c instanceof hour) {
            hour h=(hour)c;
            h.hr();
		}
		else{
               day d=(day)c;
               d.days();
		}

	}
}