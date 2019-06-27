package pft.addressbook.tests;

import org.testng.annotations.Test;
import pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test(enabled = false)
    public void testContactModification(){
        app.contact().initContactModification();
        app.contact().fillContactForm(new ContactData().withFirstName("testname").withLastName("test_surmane").withGroup("test1"), true);
        app.contact().submitContactModification();
        app.contact().returnToHomePage();
    }
}
