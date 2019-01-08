public class User {

	 String userID;
	 String userPassword;
	 String firstName;
	 String lastName;
	 String middleName;
	 String contactNumber;
	 String userRole;
	 String emailAddress;
	 
	public User(){}
	//Getters & Setters
	public String getID() {
		return this.userID;
	}
	public String getPassword() {
		return this.userPassword;
	}
	public String getfName() {
		return this.firstName;
	}
	public String getmName() {
		return this.middleName;
	}
	public String getlName() {
		return this.lastName;

	}
	public String getcontactNum() {
		return this.contactNumber;
	}
	public String getuserRole() {
		return this.userRole;
	}
	public String getemailAddress(){
		return this.emailAddress;
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
	public void setcontactName(String contactNumber) {

		this.contactNumber=contactNumber;
	}
	public void setemailAddress(String emailAddress) {
		this.emailAddress=emailAddress;
	}
	public void setuserRole(String userRole) {
		this.userRole= userRole;
	}

	public void displayUser() {

		System.out.println("UserId:"+ getID());
		System.out.println("Name:" + getfName()+getmName()+getlName());
		System.out.println("Contact Number:" + getcontactNum());
		System.out.println("Email Address:"+ getemailAddress());
		System.out.println("User Role"+ getuserRole());
		System.out.println("");
	}
}