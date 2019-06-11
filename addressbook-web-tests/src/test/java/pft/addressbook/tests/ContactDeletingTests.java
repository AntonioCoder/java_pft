package pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactDeletingTests extends TestBase {


    @Test
    public void testContactDeleting(){
        app.getContactHelper().selectContact("1");
        app.getContactHelper().deleteSelectedContacts();
        app.wd.switchTo().alert().accept();
    }


}