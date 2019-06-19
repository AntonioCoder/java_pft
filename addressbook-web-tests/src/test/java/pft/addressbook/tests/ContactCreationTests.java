package pft.addressbook.tests;

import org.testng.annotations.Test;
import pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test(enabled = false)
    public void testContactCreation(){

        app.contact().initContactCreation();
        app.contact().fillContactForm(new ContactData(), true);
        app.contact().submitContactCreation();
        app.goTo().gotoHomePage();

    }

}
