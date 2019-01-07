public class PasswordDerivation
{

    private static int workload = 12;

    public static String hash(String userPassword) {
        String salt = BCrypt.gensalt(workload);
		String hashed_password = BCrypt.hashpw(userPassword, salt);
        return(hashed_password);
    }
}