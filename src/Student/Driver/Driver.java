package Student.Driver;
import java.util.Scanner;

import Student.home.Student;
import Student.implementation.*;

public class Driver {
	public static void main(String [] args) {
		StudentImplementation Student = new StudentImplementation();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the first name:");
		 String firstname = sc.next();
		 System.out.println("enter the last name");
		 String lastname = sc.next();
		 
		 System.out.println("1.ComputerScience");
		 System.out.println("2.Electrical");
		 System.out.println("3.Electronics");
		 System.out.println("4.Mechanical");
		 System.out.println("5.Data Science");
		 
		 System.out.println("please chose the department:");
		 int choice = sc.nextInt();
		 String genEmail =" ";
		 String genpassword =" ";
		 
		 switch(choice) {
		 case 1:
			 genEmail = Student.generateEmailID(firstname, lastname, "Comp");
			 break;
		 case 2:
			 genEmail = Student.generateEmailID(firstname, lastname, "Electric");
			 break;
		 case 3:
			 genEmail = Student.generateEmailID(firstname, lastname, "Electron");
			 break;
		 case 4:
			 genEmail = Student.generateEmailID(firstname, lastname, "Mech");
			 break;
		 case 5:
			 genEmail = Student.generateEmailID(firstname, lastname, "DataSc");
			 break;
			 default:
				 System.out.println("please enter the valid input");
		 }
		 System.out.println(genEmail);
		 
		 genpassword=Student.generatepassword();
		 Student karthik = new Student();
		 karthik.setFistname(firstname);
		 karthik.setLastname(lastname);
		 karthik.setEmail(genEmail);
		 karthik.setPassword(genpassword);
		 Student.showStudentDetails(karthik);
		 sc.close();
		 
		 
		 
		 
		
		
	}

}
