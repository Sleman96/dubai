package steps;

import dm.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

import java.io.IOException;

public class ServicesSteps extends Base {
     HomePage homePage;
     Hooks hooks;

    @When("user open website and go to home page")
    public void user_open_website_and_go_to_home_page() throws InterruptedException, IOException {
        launchBrowser("edge");
        Thread.sleep(3000);
    }


    @When("click on services")
    public void clickOnServices() throws InterruptedException {
        homePage=new HomePage();
        homePage.OnclickServies();

    }

    @Then("user should navigate to services DM")
    public void userShouldNavigateToServicesDM() throws InterruptedException {
        System.out.println(" is done");
        hooks=new Hooks();
        hooks.quit();

    }
}
