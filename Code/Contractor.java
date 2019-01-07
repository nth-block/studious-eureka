
public class Contractor {
	String contractorName;
	String contractorID;
	String contractorLicense;
	
	public Contractor(){
	//
	}
	public String getcontID(String contractorID) {
		return this.contractorID;
	}
	public String getcontName(String contractorName) {
		return this.contractorName;
	}
	public String getcontLicense(String contractorLicense) {
		return this.contractorLicense;
	}
	public void setContID(String contractorID)
	{
		this.contractorID=contractorID;
	}
	public void setContName(String contractorName) {
		this.contractorName=contractorName;
	}
	public void setContLicense(String contractorLicense) {
		this.contractorLicense=contractorLicense;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
