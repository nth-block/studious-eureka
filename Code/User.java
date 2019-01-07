public class User {

	 String userID;
	 String userPassword;
	 String firstName;
	 String lastName;
	 String middleName;
	 int contactNumber;
	 String userRole;
	 
	public User(){}
	//Getters & Setters
	public String getID(String userID) {
		return this.userID;
	}
	public String getPassword(String userPassword) {
		return this.userPassword;
	}
	public String getfName(String firstName) {
		return this.firstName;
	}
	public String getmName(String middleName) {
		return this.middleName;
	}
	public String getlName(String lastName) {
		return this.lastName;

	}
	public int getcontactNum(int contactNumber) {
		return this.contactNumber;
	}
	public String getuserRole(String userRole) {
		return this.userRole;
	}
	
	public void setID(String userID)
	{
		this.userID=userID;
	}
	public void setPassword(String userPassword){
		this.userPassword=userPassword;
	}
	public void setfName(String firstName) {

		this.firstName=firstName;
	}
	public void setmName(String middleName) {
		this.middleName=middleName;
	}
	public void setlName(String lastName) {
		this.lastName=lastName;
	}
	public void setcontactName(int contactNumber) {
		this.contactNumber=contactNumber;
	}
	public void setuserRole(String userRole) {
		this.userRole= userRole;
	}

	//Main 	
	public static void main(String[] args) {

		User u1= new User();
		
		
	}
	
		
}