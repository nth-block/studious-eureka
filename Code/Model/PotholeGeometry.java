public class PotholeGeometry
{
    private float size;

    //Constructor to calculate area of the pothole. No default / non-parameterised constructor exists as it is meaningless to instiantiate this class without the area
    // Pothole is assumend to be fixed as a rectangular patch rather than a random geometric shape
    // Passed parameters are in centimeters, area calculated will be in square meters to enable

    public PotholeGeometry(float length, float width, string measurement_unit )
    {
        this.size = length*breadth/10000;
    }
    
    public float GetSize()
    {
        return this.size;
    }
}