package InstaHomePage;

import java.sql.SQLException;
import java.util.Scanner;

import com.DB.DBUtills;

public class InstaHomePage {
	public static void main(String[] args) throws SQLException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("                                         ❤️❤️Welcome to Instagram❤️❤️");
		System.out.println("select option:");
		System.out.println("1.New Account?singUp");
		System.out.println("2.Login");
		System.out.println("----------------------------------------");
		System.out.println("Enter Option:");
		int userOption=sc.nextInt();
		
		switch(userOption) {
		case 1:{
			SingUp.singUpApplication();
			break;
		 }
		case 2:{
			System.out.println("Enter UserName=");
			String userName=sc.next();
			System.out.println("Enter password=");
			String password=sc.next();
			boolean isValiduser=DBUtills.isUserValidLogin(userName, password);
			if(isValiduser) {
				System.out.println("Welcome to Instagram!!"+" "+userName+"❤️❤");
			}else {
				System.out.println("Invalid Credentials!! Try Again");
			}
			break;
		}
		default:{
			System.out.println("Enter Valid Option!! Try again");
		 }
		}
	}
}
