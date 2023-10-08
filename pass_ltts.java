// write a java code to chess password is valid or not
import java.util.Scanner;
public class Password {

	public static boolean isValid(String pass) {
		boolean flag=true;
		int upper=0, lower=0,digit=0, symbol=0;
		
		
		if(pass.length()<8 && pass.length()>12) {
			flag=false;
			return flag;
		}
		for(int i=0;i<pass.length();i++) {
			char ch=pass.charAt(i);
			if(Character.isUpperCase(ch)) {
				upper++;
			}
			if(Character.isLowerCase(ch)) {
				lower++;
			}
			if(Character.isDigit(ch)) {
				digit++;
			}
			else {
				symbol++;
			}
		}
		if(upper==0 || lower==0 || digit==0 || symbol==0) {
			return false;
		}
		else {
			return true;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Password : ");
		String pass = scan.nextLine();
		
		if(isValid(pass)) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password");
		}

	}

}
