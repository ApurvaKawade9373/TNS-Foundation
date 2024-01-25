package com.tnsif.client;

import com.tnsif.application.GSNormalAcc;
import com.tnsif.application.GSPrimeAcc;
import com.tnsif.framework.NormalAcc;
import com.tnsif.framework.PrimeAcc;

public class Client {

	public static void main(String[] args) {
	
		PrimeAcc pa= new GSPrimeAcc(321,"Harry",15000,true);
		pa.bookProduct(pa.getCharges());
		pa.toString();

		NormalAcc na= new GSNormalAcc(123,"Shubh",3000,50);
		na.bookProduct(na.getDeliveryCharge());
		na.toString();
	}

}
