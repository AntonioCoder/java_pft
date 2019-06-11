package pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletingTests extends TestBase {


    @Test
    public void testGroupDeleting(){
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnGroupPage();
    }


}