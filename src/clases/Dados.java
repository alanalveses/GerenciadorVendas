package clases;

/**
 *
 * @author Alan
 */
public class Dados {

    public boolean validateUser(String user, String password) {
        if (user.equals("alan") && password.equals("123")) {
            return true;
        } else {
            return false;
        }
    }
}
