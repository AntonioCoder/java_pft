package pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletingTests extends TestBase {


    @Test(enabled = false)
    public void testContactDeleting(){
        app.contact().selectContact("1");
        app.contact().deleteSelectedContacts();
        app.wd.switchTo().alert().accept();
    }


}