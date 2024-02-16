package arrayList;

import java.util.ArrayList;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(12,"Anu",75);
		Student s2=new Student(3,"Pooji",83);
		Student s3=new Student(46,"Sai",74);
		ArrayList al=new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println(al);
	
	}

}
