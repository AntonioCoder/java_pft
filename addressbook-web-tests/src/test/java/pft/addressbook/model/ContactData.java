package pft.addressbook.model;

import java.io.File;

public class ContactData {
    private int id = Integer.MAX_VALUE;
    private String firstName;
    private String middlename;
    private String lastName;
    private String nickname;
    private String home;
    private String mobile;
    private  String group;
    private String allPhones;
    private File photo;

    public ContactData withPhoto(File photo) {
        this.photo = photo;
        return this;
    }

    public File getPhoto() {
        return photo;
    }

    public String getFirstname() {
        return firstName;
    }

//    public String getMiddlename() {
//        return middlename;
//    }

    public String getLastname() {
        return lastName;
    }
//    public String getNickname() {
//        return nickname;
//    }

//    public String getHome() {
//        return home;
//    }

//    public String getMobile() {
//        return mobile;
//    }

//    public String getGroup() { return group; }

    public ContactData withId(int id) {
        this.id = id;
        return this;
    }
    public ContactData withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public ContactData withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public ContactData withAllPhones(String allPhones) {
        this.allPhones = allPhones;
        return this;
    }

    public ContactData withGroup(String group) {
        this.group = group;
        return this;
    }
}
