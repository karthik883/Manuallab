package Student.implementation;

import Student.home.Student;

public interface StudentDuty {
	String generateEmailID(String fname, String lname, String Dept);
	String generatepassword();
	void showStudentDetails(Student e);
	

}
