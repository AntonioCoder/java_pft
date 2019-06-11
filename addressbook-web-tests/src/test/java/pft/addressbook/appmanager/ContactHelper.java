package pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {


    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("middlename"), contactData.getMiddlename());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("nickname"), contactData.getNickname());
        type(By.name("home"), contactData.getHome());
        type(By.name("mobile"), contactData.getMobile());
    }

    public void submitContactCreation(){
        click(By.xpath("//input[@name='submit']"));
    }

    public void returnToHomePage(){click(By.linkText("home page"));}

    public void initContactModification(){ click(By.xpath("//img[@alt='Edit']"));}

    public void submitContactModification(){click(By.xpath("//input[@name='update']"));}

    public void selectContact(String id) { click(By.id(id));}

    public void deleteSelectedContacts() { click(By.xpath("//input[@value='Delete']")); }
}

