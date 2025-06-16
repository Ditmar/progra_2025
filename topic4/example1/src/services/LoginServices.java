package services;

public class LoginServices {

    public boolean isValidLogin(String email, String password) {
        if (!email.equals("test@gmail.com") && !password.equals("123")) {
            return false;
        }
        return true;
    }
}
