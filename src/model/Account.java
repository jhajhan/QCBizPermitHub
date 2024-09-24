package model;

public class Account {
    private String email;
    private String username;
    private String password;
    private int accountID;
    private String name;
    private long regNum;
    private int Status;
    
    public int getStatus() {
        return Status;
    }
    public void setStatus(int status) {
        Status = status;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String cs) {
        this.password = cs;
    }
    public int getAccountID() {
        return accountID;
    }
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public void setRegNum (long regNum) {
        this.regNum = regNum;
    }
    public long getRegNum () {
        return regNum;
    }

    
}
