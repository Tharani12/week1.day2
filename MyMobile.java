package week1.day2;

public class MyMobile {
	public void makecall()
	{
		System.out.println("make a call");
	}
	public void sendMsg()
	{
		System.out.println("send a Message");
	}
	private void payBills()
	{
		System.out.println("pay the Bills");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MyMobile mobile = new MyMobile();
     mobile.makecall();
     mobile.sendMsg();
     mobile.payBills();
	}

}
