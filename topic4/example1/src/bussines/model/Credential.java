package bussines.model;

public class Credential {
    private String userName;
    private String password;

    public Credential(String userNaMe, String password) {
        this.userName = userNaMe;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
