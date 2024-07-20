package steps;

import dm.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import pages.HomePage;

import java.io.IOException;

public class InterfaceArabicSteps extends Base {
      HomePage homePage;
      Hooks hooks;



    @When("Go to Dm Home page")
    public void GoToDmHomePage() throws InterruptedException, IOException {
        launchBrowser("firefox");
        Thread.sleep(3000);

    }

    @When("Choose Arabic interface")
    public void chooseArabicInterface() throws InterruptedException {
        homePage=new HomePage();
        homePage.translateToArabic();


    }

    @Then("The Website is translated to Arabic")
    public void theWebsiteIsTranslatedToArabic() throws InterruptedException {
        System.out.println("is Done");
        hooks=new Hooks();
        hooks.quit();

    }
}
