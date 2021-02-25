package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    @Given("the user log in as {string} user")
    public void the_user_log_in_as_user(String userType) {

        Driver.get().get(ConfigurationReader.get("url"));

        String username = null;
        String password = null;

        if(userType.equals("help desk")){
            username = ConfigurationReader.get("helpdesk_username");
            password = ConfigurationReader.get("helpdesk_password");
        }else if(userType.equals("human resource")){
            username = ConfigurationReader.get("humanresource_username");
            password = ConfigurationReader.get("humanresource_password");
        }else if(userType.equals("marketing")){
            username = ConfigurationReader.get("marketing_username");
            password = ConfigurationReader.get("marketing_password");
        }

        new LoginPage().login(username,password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {

        Assert.assertFalse("Verify page",Driver.get().getTitle().equals("Authorization"));
    }


}