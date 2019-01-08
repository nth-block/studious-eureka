import java.util.Scanner;
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
	        System.out.println("User Menu");  

	            User user1 = new User();
	            System.out.println("Please enter user ID: ");
	            user1.setID (scanner.nextLine());
	            System.out.println("Please enter user Password: ");
	            user1.setPassword (scanner.nextLine());
	            System.out.println("Please enter first name: ");
	            user1.setfName (scanner.nextLine());
	            System.out.println("Please enter middle name: ");
	            user1.setmName (scanner.nextLine());
	            System.out.println("Please enter last name: ");
	            user1.setmName (scanner.nextLine());
	            System.out.println("Please enter contact number(+91): ");
	            user1.setcontactName (scanner.nextLine());
	            System.out.println("Please enter user role (User or Administrator): ");
	            user1.setuserRole (scanner.nextLine());
	            System.out.println("Please enter email Address: ");
	            user1.setemailAddress (scanner.nextLine());
	            user1.displayUser();
	            scanner.close();
	        }
	     

}
