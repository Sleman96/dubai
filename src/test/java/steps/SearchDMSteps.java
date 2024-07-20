package steps;

import dm.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

import java.io.IOException;

public class SearchDMSteps extends Base {

    HomePage home;
    Hooks hooks;

    @Given("user open website and go to search page")
    public void userOpenWebsiteAndGoToSearchPage() throws InterruptedException, IOException {
        launchBrowser("firefox");
        Thread.sleep(3000);
    }


    @When("search in middle for the page")
    public void searchInMiddleForThePage() throws InterruptedException {
        home=new HomePage();
        home.searchEngine();
        Thread.sleep(3000);

    }


    @Then("user should navigate to search DM")
    public void userShouldNavigateToSearchDM() throws InterruptedException {
        System.out.println("is done");
        hooks=new Hooks();
        hooks.quit();

    }


    @When("search in header page")
    public void searchInHeaderPage() throws InterruptedException {
   home =new HomePage();
   home.searchHeader();
   Thread.sleep(3000);

    }
}
