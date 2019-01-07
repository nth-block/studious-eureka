public class Credential
{
    String userId;
    String userPassword;

    public Credential(String userId, String userPassword)
    {
        this.userId = userId;
        this.userPassword = PasswordDerivation.hash(userPassword)
    }

    public Void login(String userId, String userPassword)
    {
        //Pending implementation
    }

    public Void savePassword(String userPassword)
    {
        //Pending implementation
    }
}