package pft.addressbook.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.File;


@Entity
@Table(name = "addressbook")
public class ContactData {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "home")
    @Type(type = "text")
    private String homePhone;

    @Column(name = "mobile")
    @Type(type = "text")
    private String mobilePhone;

    @Override
    public String toString() {
        return "ContactData{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", homePhone='" + homePhone + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", workPhone='" + workPhone + '\'' +
                ", group='" + group + '\'' +
                ", allPhones='" + allPhones + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }

    @Column(name = "work")
    @Type(type = "text")
    private String workPhone;

    @Transient
    private  String group;

    @Transient
    private String allPhones;

    @Column(name = "photo")
    @Type(type = "text")
    private String photo;

    public ContactData withHomePhone(String homePhone) {
        this.homePhone = homePhone;
        return this;
    }

    public ContactData withMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public ContactData withWorkPhone(String workPhone) {
        this.workPhone = workPhone;
        return this;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }





    public ContactData withPhoto(File photo) {
        this.photo = photo.getPath();
        return this;
    }

    public File getPhoto() {
        return new File(photo);
    }

    public String getFirstname() {
        return firstname;
    }

//    public String getMiddlename() {
//        return middlename;
//    }

    public String getLastname() {
        return lastname;
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
        this.firstname = firstName;
        return this;
    }
    public ContactData withLastName(String lastName) {
        this.lastname = lastName;
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
