package moneycalcy;

public class print {
        public void help(india ind) {
        	if(ind instanceof SriLanga) {
        		SriLanga sri=(SriLanga)ind;
        		sri.money(0);
        	}
        	else if(ind instanceof Usa) {
        		Usa us=(Usa)ind;
        		us.money(0);
        	}
        	else if(ind instanceof Landon) {
        		Landon lan=(Landon)ind;
        		lan.money(0);
        	}
        	else if(ind instanceof Austria) {
        		Austria aus=(Austria)ind;
        		aus.money(0);
        	}
        	else {
        		Nz nz=(Nz)ind;
        		nz.money(0);
        	}
        }
}
