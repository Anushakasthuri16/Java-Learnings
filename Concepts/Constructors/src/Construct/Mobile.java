package Construct;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MobileClass MC= new MobileClass("Blue","MI",10000,6,3);
System.out.print(MC.brand+" brand "+MC.width+ " width " +MC.color+ " color " +MC.height+ " height "+MC.cost+" cost " );
MC.makeACall();
	
MobileClass MC1=new MobileClass("Black","Realme");

System.out.print(MC1.brand+" brand "+MC1.width+ " width " +MC1.color+ " color " +MC1.height+ " height "+MC1.cost+" cost ");
MC1.sentMessage();

MobileClass MC2=new MobileClass("white","Iphone",450000);

System.out.print(MC2.brand+" brand "+MC2.width+ " width " +MC2.color+ " color " +MC2.height+ " height "+MC2.cost+" cost ");
MC2.sentMessage();
MC2.makeACall();
	}

	}

