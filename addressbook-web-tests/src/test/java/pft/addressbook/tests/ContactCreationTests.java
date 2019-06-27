package pft.addressbook.tests;

import org.testng.annotations.Test;
import pft.addressbook.model.ContactData;

import java.io.File;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation(){

        app.contact().initContactCreation();
        File photo = new File("src/test/resources/1.png");
        app.contact().fillContactForm(new ContactData().withFirstName("testname111").withLastName("test_surmane").withPhoto(photo), true);
        app.contact().submitContactCreation();
        app.contact().returnToHomePage();

    }

}
