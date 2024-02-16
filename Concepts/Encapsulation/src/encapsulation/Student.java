package encapsulation;

public class Student {
	private int rollNo;
	private String name;
	private int age;
	
	public Student(int rollNo,String name,int age)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
	}
	
	public int getRollno()
	{
		return rollNo;
	}
	public String getName()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}

}
