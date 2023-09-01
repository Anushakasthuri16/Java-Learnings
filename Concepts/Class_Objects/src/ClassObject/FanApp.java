package ClassObject;



public class FanApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fan f1 =new fan();
		fan f2 = new fan();
		fan f3 = new fan();
		f1.brand="Usha";
		f1.cost=4000;
		f1.no_Of_Wings=3;
		f1.color="White";
		
		f2.brand="Crompton";
		f2.cost=4500;
		f2.color="Blue";
		f2.no_Of_Wings=4;
		
		f3.brand="Sony";
		f3.cost=5000;
		f3.color="Black";
		f3.no_Of_Wings=5;
		
		System.out.println(f1.brand+" "+f1.color+ " " +f1.cost+ " " +f1.no_Of_Wings);
		System.out.println(f2.brand+" "+f2.color+ " " +f2.cost+ " " +f2.no_Of_Wings);
		System.out.println(f3.brand+" "+f3.color+ " " +f3.cost+ " " +f3.no_Of_Wings);
		System.out.println("-----------------------------------------------------------------");
		
		f1.blow_Air();
		f1.rotate();
		System.out.println("-----------------------------------------------------------------");
		
		f2.blow_Air();
		f2.rotate();
		System.out.println("-----------------------------------------------------------------");
		
		f3.blow_Air();
		f3.rotate();
		
		
	}



	}


