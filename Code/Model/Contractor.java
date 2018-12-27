public class Contractor
{
    private int contaractorId;
    private string contaractorName; //CompanyName
    private string contractorLicence; //Licence may be a string or an int
    private Pothole[] assignedPotholes; //TODO: This has to be a Java collection. Find out how to specify a collection

    public Contractor()
    {
        this.contaractorId = new Guid() //TODO: This needs to be change to Java specification too.

        //Assumption here is that a new object of Contractor is for defining a new contractor
    }

    public Contractor(int contaractorId, string contaractorName, string contractorLicence, Pothole pothole)
    {

    }

    public <retunetype_placeholder> GetContractorInfo(int contaractorId)
    {
        //TODO: Code to find the contractor from the data store
    }

    public <retunetype_placeholder> AssignPothole(Pothole pothole, string contaractorId)
    {
        //TODO: Code to create a Pothole object and assign it to a Contractor
    }
}