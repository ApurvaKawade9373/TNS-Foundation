package com.tnsif.framework;


public abstract class ShopAcc {
	 private int accNo;
	   private String accNm;
	   private float charges;
	   
	   // Constructor
		public ShopAcc(int accNo, String accNm,float charges) 
		{
			super();
			this.accNo=accNo;
			this.accNm=accNm;
			this.charges=charges;
		}
		
		//getter setter for accNo
		public int getAccNo() {
	        return accNo;
	    }

	    public void setAccNo(int accNo) {
	        this.accNo = accNo;
	    }
	    //getter setter for accNm
	    public String getAccNm() {
	        return accNm;
	    }

	    public void setAccNm(String accNm) {
	        this.accNm = accNm;
	    }
	    
	    //getter setter for charges
	    public float getCharges() {
	        return charges;
	    }

	    public void setCharges(int charges) {
	        this.charges = charges;
	    }
	    
	  //method for booking a product
		public void bookpProduct(float charges )
		{
			System.out.println("Product booked and the charges are:" +charges);
		}
		public void items(float charges) 
		{
			System.out.println("Items are delivered with the charges:" +charges);
		}
	
		
		public  String toString()
		{
			return "Account Number:" + accNo +", Charges: " +charges;
		}
}
