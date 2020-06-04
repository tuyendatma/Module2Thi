import java.io.Serializable;

public class PhoneBook implements Serializable {
    private String name;
    private int phoneNumber;
    private String address;
    private String email;
    private String gender;
    private String groups;
    private String DateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }
    public PhoneBook(){
    }

    public PhoneBook(String name, int phoneNumber, String address, String email, String gender, String groups, String dateOfBirth) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.gender = gender;
        this.groups = groups;
        this.DateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Name: "+name+", phoneNumber: "+phoneNumber+ ", Address: "+address+ ", email: "+ email +"" +
                ", Gender: " +gender+", Group: "+groups+ "DateOfBirth: " +DateOfBirth ;
    }
}
