package com.ali.ui.stepDefinitions;

import com.ali.ui.pages.HomePage;
import com.ali.ui.pages.SearchResultsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Locale;

public class SearchStepdef {
    HomePage homePage = new HomePage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();
    @When("user selects {string} from categories")
    public void user_selects_from_categories(String category) {
        Select select = new Select(homePage.searchDropdownBox);
        select.selectByVisibleText(category);
    }
    @When("user search for {string}")
    public void user_search_for(String keyword) {
     homePage.searchtxtbox.sendKeys(keyword + Keys.ENTER);
    }
    @Then("verify search results contain {string}")
    public void verify_search_results_contain(String keyword) {
        List<WebElement> resultList = searchResultsPage.allSearchItemList;
        int count = 0;
        for (int i = 1; i < resultList.size(); i++) {
            if (!resultList.get(i).getText().toLowerCase().contains(keyword) ) {
                count++;

            }
            System.out.println(resultList.get(i).getText());
        }
        Assert.assertTrue(count==0);



    }
}
