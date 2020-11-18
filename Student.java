package Pratice;

public class Student {
    private String ID;
    private String Name;
    private String Address;
    private String Phone;

    public Student (String ID, String Name , String Address, String Phone){
        this.ID = ID;
        this.Name = Name;
        this.Address = Address;
        this.Phone= Phone;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getPhone() {
        return Phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }
}
