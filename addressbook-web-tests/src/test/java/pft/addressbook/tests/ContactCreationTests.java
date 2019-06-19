package pft.addressbook.tests;

import org.testng.annotations.Test;
import pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test(enabled = false)
    public void testContactCreation(){

        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("a", "a", "a", "a", "a", "a", "test1"), true);
        app.getContactHelper().submitContactCreation();
        app.goTo().gotoHomePage();

    }

}
