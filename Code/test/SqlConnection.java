   import java.util.*;
   import java.sql.*;
   public class SqlConnection {
   
	public static void connect() {
	   Connection conn = null;
	    try {

	    	 String userID;
	    	 String userPassword;
	    	 String firstName;
	    	 String lastName;
	    	 String middleName;
	    	 String contactNumber;
	    	 String userRole;
	    	 String emailAddress;
		     System.out.println("Please enter user ID: ");
		     Scanner scanner1 = new Scanner(System.in);
		     userID= scanner1.nextLine();
		     System.out.println("Please enter user Password: ");
		     Scanner scanner2 = new Scanner(System.in);
		     userPassword= scanner2.nextLine();
		     System.out.println("Please enter first name: ");
		     Scanner scanner3 = new Scanner(System.in);
		     firstName= scanner3.nextLine();
		     System.out.println("Please enter last name: ");
		     Scanner scanner4 = new Scanner(System.in);
		     lastName=  scanner4.nextLine();
		     System.out.println("Please enter middle name: ");
		     Scanner scanner5 = new Scanner(System.in);
		     middleName= scanner5.nextLine();
		     System.out.println("Please enter contact number(+91): ");
		     Scanner scanner6 = new Scanner(System.in);
		     contactNumber= scanner6.nextLine();
		     System.out.println("Please enter email Address: ");
		     Scanner scanner7 = new Scanner(System.in);
		     emailAddress= scanner7.nextLine();
		     System.out.println("Please enter user role (User or Administrator): ");
		     Scanner scanner8 = new Scanner(System.in);
		     userRole= scanner8.nextLine();
		     //close scanners.
		     scanner1.close();scanner2.close();scanner3.close();scanner4.close();scanner5.close();scanner6.close();scanner7.close();scanner8.close();
		     // database parameters
		     
		     String url = "jdbc:sqlite:c:/sqlite3/POTSYSTEMDB";
			  // create a connection to the database
			 conn = DriverManager.getConnection(url);   
			 System.out.println("Connection to SQLite has been established.");
			         
			 //Insert values to database
			 System.out.println("Inserting records into the table...");
			         Statement myStmt = conn.createStatement(); 
			         String sql = "INSERT INTO USER "+ "(userID, userPassword, firstName, lastName, middleName, contactNumber, emailAddress, userRole)"+"VALUES(?,?,?,?,?,?,?,?)";
			         PreparedStatement ps= conn.prepareStatement(sql);
			         
			         ps.setString(1, userID);
			         ps.setString(2, userPassword);
			         ps.setString(3, firstName );
			         ps.setString(4, lastName);
			         ps.setString(5, middleName);
			         ps.setString(6, contactNumber);
			         ps.setString(7, emailAddress);
			         ps.setString(8, userRole);
			         ps.executeUpdate();
			         myStmt.executeUpdate(sql);
			         System.out.println("Inserted records into the table...");
		            
	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        } finally {
	            try {
	                if (conn != null) {
	                    conn.close();
	                }
	            } catch (SQLException ex) {
	                System.out.println(ex.getMessage());
	            }
	        }
	    }
	public static void main(String[] args) {
	        connect();
	       
	    }

}
