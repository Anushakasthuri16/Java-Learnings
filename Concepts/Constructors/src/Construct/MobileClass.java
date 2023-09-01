package Construct;

public class MobileClass {
	
int cost;
String color;
String brand;
double width;
double height;

void makeACall()
{
	System.out.println("Mobile is ringing");
}
void sentMessage()
{
	System.out.println("Mobile is senting a message");
}
MobileClass(String x,String y,int z,int a, int b)
{
	color=x;
	brand=y;
	cost=z;
	width=a;
	height=b;
}
MobileClass(String x,String y)
{
	color=x;
	brand=y;
	cost=15000;
	width=3.1;
	height=6.2;
}
MobileClass(String x,String y,int z)
{
	color=x;
	brand=y;
	cost=z;
	width=3.6;
	height=6.5;

}
}
