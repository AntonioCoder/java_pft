package pft.addressbook.tests;

import org.testng.annotations.Test;
import pft.addressbook.model.ContactData;
import pft.addressbook.model.Groups;

import java.io.File;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation(){
        Groups groups = app.db().groups();

        File photo = new File("src/test/resources/1.png");
        ContactData contactData = new ContactData().withFirstName("testname111").withLastName("test_surmane").withPhoto(photo).inGroup(groups.iterator().next());
        app.contact().initContactCreation();
        app.contact().fillContactForm(contactData, true);
        app.contact().submitContactCreation();
        app.contact().returnToHomePage();

    }

}
