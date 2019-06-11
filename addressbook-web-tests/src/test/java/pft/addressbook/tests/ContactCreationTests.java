package pft.addressbook.tests;

import org.testng.annotations.Test;
import pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation(){

        app.getNavigationHelper().gotoNewContactPage();
        app.getContactHelper().fillContactForm(new ContactData("a", "a", "a", "a", "a", "a"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();

    }

}
