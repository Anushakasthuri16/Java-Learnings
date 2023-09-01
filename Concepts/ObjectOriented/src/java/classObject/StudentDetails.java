package java.classObject;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 =new Student();
		Student s2 =new Student();
		s1.age=22;
		s1.name="anu";
		s1.clg="Shree Rama";
		s1.branch="CSE";
		s1.id=512;
				
		s2.age=21;
		s2.name="Sravya";
		s2.clg="Shree Rama";
		s2.branch="CSE";
		s2.id=519;
		
		s1.Java();
		s2.apti();
		s1.revise();
		s1.revise();
		System.out.println(s1.name+ " " +s1.branch+ " " +s1.clg+ " " +s1.id+ " " +s1.age);
		System.out.println(s2.name+ " " +s2.branch+ " " +s2.clg+ " " +s2.id+ " " +s2.age);
					
		

	}

}
