package week3.day2;

public abstract class CanaraBank implements Payments{
	
	public void recordPaymentDetails()
	{
		System.out.println("Payment Details are listed below");
	}
	
	//Method Implementation which are defined as unimplemented methods in interface
	public void cashOnDelivery()
	{
		System.out.println("1.Cash on Delivery");
	}
	
	public void upiPayments()
	{
		System.out.println("2.UPI Payments");
	}
	
	public void cardPayments()
	{
		System.out.println("3.Card Payments");
	}
	
	public void internetBanking()
	{
		System.out.println("4.Internet Banking");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
