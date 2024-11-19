package Models;
import Models.Super.Person;

public class User extends Person{
    private String address, email;

    public User(String name, int tel, String address, String email) {
        super(name, tel);
        this.address = address;
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
    return "User [ name=" + super.getName() + ", telephone=" + super.getTel() + ", address=" + address + ", email=" + email + "]";
    }

    

   

    
    





}
