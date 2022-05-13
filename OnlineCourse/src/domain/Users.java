
package domain;


public abstract class Users {
    private String Email ,password;

    public Users(String Email, String password) {
        this.Email = Email;
        this.password = password;
        
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
    
}
