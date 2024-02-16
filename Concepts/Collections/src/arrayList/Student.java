package arrayList;

public class Student {
	int rollNo;
	String name;
	float percentage;
	
	public Student(int a,String b,float c)
	{
		this.rollNo=a;
		this.name=b;
		this.percentage=c;
	}

	@Override
	public String toString() {
		
		return rollNo+ " " +name+" "+percentage;
	}
}
