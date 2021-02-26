package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.UsersPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class UsersTable_Stepdefinitions {

    UsersPage usersPage = new UsersPage();

    @Then("Table should have following column names:")
    public void tableShouldHaveFollowingColumnNames(List<String> expectedColumnNames) {
       // System.out.println("expectedColumnNames = " + expectedColumnNames);
        // System.out.println("expectedColumnNames = " + expectedColumnNames.size());



        List<String> actualColumnNames = BrowserUtils.getElementsText(usersPage.tableHeaders);

        Assert.assertEquals(expectedColumnNames,actualColumnNames);

    }
}
