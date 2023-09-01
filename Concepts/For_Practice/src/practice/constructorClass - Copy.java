package practice;

public  class constructorClass {
int seat;
int cost;
String color;
String brand;

void CarIsMoving()
{ 
	System.out.println("Car is MOving");
}
void wheels()
{
	System.out.println("Car move with 4 wheels");
}

public constructorClass(int x,int y,String z,String w) {

seat=x;
cost=y;
color=z;
brand=w;
}
}
