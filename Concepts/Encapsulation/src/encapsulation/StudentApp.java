package encapsulation;

public class StudentApp {

	public static void main(String[] args) {
		
		Student s1=new Student(1,"Anu",22);
		System.out.println(s1.getRollno()+" "+s1.getName()+" "+s1.getage());
		
		Student s2=new Student(2,"Navya",23);
		System.out.println(s2.getRollno()+" "+s2.getName()+" "+s2.getage());
		

	}

}
