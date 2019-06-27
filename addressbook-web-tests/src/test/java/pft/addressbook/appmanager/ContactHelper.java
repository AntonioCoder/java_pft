package pft.addressbook.appmanager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pft.addressbook.model.ContactData;
import pft.addressbook.model.GroupData;
import pft.addressbook.model.Groups;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContactHelper extends HelperBase {


    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getFirstname());
//        type(By.name("middlename"), contactData.getMiddlename());
        type(By.name("lastname"), contactData.getLastname());
        attach(By.name("photo"), contactData.getPhoto());
//        type(By.name("nickname"), contactData.getNickname());
//        type(By.name("home"), contactData.getHome());
//        type(By.name("mobile"), contactData.getMobile());
//        if (isElementPresent(By.name("new_group"))){
//            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
//        }
//        if (creation){
//            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
//        }else{
//            Assert.assertFalse(isElementPresent(By.name("new_group")));
//        }

    }

    public void initContactCreation(){ click(By.linkText("add new"));}

    public void submitContactCreation(){
        click(By.xpath("//input[@name='submit']"));
    }

    public void returnToHomePage(){click(By.linkText("home page"));}

    public void initContactModification(){ click(By.xpath("//img[@alt='Edit']"));}

    public void submitContactModification(){click(By.xpath("//input[@name='update']"));}

    public void selectContact(String id) { click(By.id(id));}

    public void deleteSelectedContacts() { click(By.xpath("//input[@value='Delete']")); }


    public List<ContactData> contacts = new ArrayList<>();



    public Set<ContactData> all() {
        Set<ContactData> contacts = new HashSet<ContactData>();
        List<WebElement> rows = wd.findElements(By.name("entry"));
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            int id = Integer.parseInt(cells.get(0).findElement(By.tagName("input")).getAttribute("value"));
            String lastname = cells.get(1).getText();
            String firstname = cells.get(2).getText();
            String allPhones = cells.get(5).getText();
            contacts.add(new ContactData().withId(id).withFirstName(firstname).withLastName(lastname).withAllPhones(allPhones));
        }
        return contacts;
    }
}

