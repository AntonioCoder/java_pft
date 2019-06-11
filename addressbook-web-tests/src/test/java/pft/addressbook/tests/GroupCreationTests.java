package pft.addressbook.tests;


import org.testng.annotations.*;
import pft.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase{


  @Test
  public void testGroupCreation() {

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().initGroupCreation();
    app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnGroupPage();
//    app.getSessionHelper().logout();
  }


}