public class MapInfo
{
    private int pincode;
    private string addressLine1;
    private string addressLine2;
    private string addressLine3;

    //Pothole address (mapInfo) is user defined in this iteration.
    // Subsequent iterations will integrate with a Maps provider service

    public MapInfo(string addressLine1, string addressLine2, string addressLine3, string pincode)
    {
        this.pincode = pincode;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
    }

    public <retunetype_placeholder> GetLocation()
    {
        //find out how to construct the address non-primitive data type
    }
}