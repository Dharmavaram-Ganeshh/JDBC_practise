package InstaHomePage;

import java.sql.SQLException;
import java.util.Scanner;

import com.DB.DBUtills;

public class SingUp {

	public static void singUpApplication() throws SQLException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter FirstName=");
		String firstName=sc.next();
		System.out.println("Enter LastName=");
		String lastName=sc.next();
		System.out.println("Enter emailId=");
		String emailId=sc.next();
		System.out.println("Enter userName=");
		String userName=sc.next();
		System.out.println("Enter password=");
		String password=sc.next();
		System.out.println("Enter Confirm Password==");
		String confirmPassword=sc.next();
		
		if(password.equals(confirmPassword)) {
			SingUpData SingUpDataObj=new SingUpData(firstName, lastName, emailId, userName, confirmPassword);
			String res=DBUtills.instaSingUpData(SingUpDataObj);
			System.out.println(res);
		}else {
			System.out.println("pasword and ConfirmPassword are differnet") ;
		}
	}
}
