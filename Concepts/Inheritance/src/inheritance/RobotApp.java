package inheritance;

public class RobotApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoctorRobot dr=new DoctorRobot();
		dr.charge();
		dr.talk();
		dr.walk();
		dr.surgery();
		System.out.println("================================");
		TeacherRobot tr=new TeacherRobot();
		tr.charge();
		tr.talk();
		tr.walk();
		tr.teach();
		System.out.println("================================");
		ChefRobot cr=new ChefRobot();
		cr.charge();
		cr.talk();
		cr.walk();
		cr.cook();


	}

}
