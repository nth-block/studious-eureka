
public class Pothole {
	int potHoleid;
	float potHoleLattitude;
	float potHoleLongitude;
	double totalCost;
	boolean approvedByBBMP;
	float potHoleSize;
	boolean potHoleFixed;
	String potHoleFixedDate;
	
	public Pothole() {
		
	}
	
	 public int getPotID(int potHoleid){
		return this.potHoleid;
	 }
	 public float getpotLat(float potHoleLattitude)
	 {
		return this.potHoleLattitude;
	 }
	 public float getpotLong(float potHoleLongitude) {
		return this.potHoleLongitude;
	 }
	 public double getCost(double totalCost) {
		return this.totalCost;
	 }
	 public boolean getapprovalStatus(boolean approvedByBBMP) {
		return this.approvedByBBMP;
	 }
	 public float getpotSize(float potHoleSize) {
		return this.potHoleSize;
	 }
	 public String getpotfixedDate(String potHoleFixedDate) {
		return this.potHoleFixedDate;
	}

	 public void setPotID(int potHoleid) {
		 this.potHoleid=potHoleid;
	 }
	 public void setpotLat(float potHoleLattitude) {
		 this.potHoleLattitude=potHoleLattitude;
	 }
	 public void setpotLong(float potHoleLongitude) {
		 this.potHoleLongitude=potHoleLongitude;
	 }
	 public void settotalCost(double totalCost) {
		 this.totalCost=totalCost;
	 }
	 public void setapprovalStatus(boolean approvedByBBMP) {
		 this.approvedByBBMP=approvedByBBMP;
	 }
	 public void setpotSize(float potHoleSize) {
		 this.potHoleSize=potHoleSize;
	 }
	 public void setpotfixedDate(String potHoleFixedDate){
		 this.potHoleFixedDate=potHoleFixedDate;
	 }
	  
	 public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
