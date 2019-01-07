
public class PotHoleGeometry {
	private float potGeo;
	public PotHoleGeometry(float length, float width, String measurement_unit ) {
		this.potGeo = length*width/10000;
	}

	public float getSize(float potGeo)
    {
        return this.potGeo;
    }
	public void setSize(float potGeo) {
		this.potGeo=potGeo;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
