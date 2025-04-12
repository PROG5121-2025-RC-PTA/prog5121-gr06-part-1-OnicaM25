package logintester;

import java.util.Scanner;
public class LoginTester{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String username, password, phone; 
		
		System.out.print("Enter Username: ");
		username = input.nextLine();
		System.out.print("Enter Password: ");
		password = input.nextLine();
		System.out.print("Enter Phone Number (starting with South African international code (+27)): ");
		phone = input.nextLine();
		
		Login login = new Login();
		boolean  validatePhone = login.checkCellPhoneNumber(phone);
		boolean  validateUsername = login.checkUserName(username);
		boolean  validatePassword = login.checkPasswordComplexity(password);
		
		if(validateUsername == true){
			System.out.println("Username successfully captured.");
		}else{
			System.out.println("Username is not correctly formatted, please ensure that your username " + 
			"contains an underscore and is no more than five characters in length.");
		}
		
		if(validatePassword == true){
			System.out.println("Password  successfully captured.");
		}else{
			System.out.println("Password  is not correctly formatted; please ensure that the password " + 
			"contains at least eight characters, a capital and small letter, a number, and a special character.");
		}
		
		if(validatePhone == true){
			System.out.println("Cell phone number successfully added.");
		}else{
			System.out.println("Cell phone number incorrectly formatted or does not contain international code.");
		}
	}

    private static class Login {

        public Login() {
        }

        private boolean checkCellPhoneNumber(String phone) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private boolean checkUserName(String username) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private boolean checkPasswordComplexity(String password) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
