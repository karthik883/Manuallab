package Student.implementation;
import java.util.Random;

import Student.home.Student;

public class StudentImplementation implements StudentDuty{

	@Override
	public String generateEmailID(String fname, String lname, String Dept) {
		// TODO Auto-generated method stub
		
		return fname + lname +"."+Dept+"@gamil.com";
	}

	@Override
	public  String generatepassword() {
		// TODO Auto-generated method stub
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowcaps = "abcdefghijklmnopqrstuvwxyz";
		String nums = "0123456789";
		String specialchars = "!@#$%^&*()";
		
		String combined = caps +lowcaps + nums +specialchars;
		String mypass = " ";
		
		Random random = new Random();
		for(int i= 0; i<=10; i++) {
			mypass = mypass+String.valueOf(combined.charAt(random.nextInt(combined.length())));
			
		}
		
		
		return mypass;
	}

	@Override
	public void showStudentDetails(Student e) {
		// TODO Auto-generated method stub
		System.out.println("enter the firstname:"+e.getFistname());
		System.out.println("enter the lastname:"+e.getLastname());
		System.out.println("enter the email:"+e.getEmail());
		System.out.println("enter the password:"+e.getPassword());
		
	}
	

}
