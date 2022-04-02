package com.ali.ui.stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import com.ali.ui.pages.HomePage;
import com.ali.ui.pages.SignInPage;
import com.ali.utilities.ConfigReader;
import com.ali.utilities.Driver;

public class LoginStepDefs {
    HomePage homePage = new HomePage();
    SignInPage signInPage = new SignInPage();

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }
    @Given("user login to account")
    public void user_cliks_to_login() {
        homePage.navUser.click();
        signInPage.email.sendKeys(ConfigReader.getProperty("valid_email"), Keys.ENTER);
        signInPage.password.sendKeys(ConfigReader.getProperty("valid_password"),Keys.ENTER);
    }

    @Then("user should login successfully")
    public void user_should_login_successfully() {
        System.out.println(homePage.navUser.getText());
        Assert.assertFalse(homePage.navUser.getText().contains("sign in"));
    }


    @And("close the browser")
    public void closeTheBrowser() {
//        Driver.closeDriver();

    }
}
