package steps;

import dm.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.LogOut;
import pages.Login;

import java.io.IOException;
import java.time.Duration;

public class LogOutSteps extends Base {

    HomePage loginpage;
    Login perform;
    LogOut l;
    Hooks hooks;

    JavascriptExecutor executor = (JavascriptExecutor) driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));


    @Given("user open website and go to login test")
    public void user_open_website_and_go_to_login_test() throws IOException {
        launchBrowser("edge");
        driver.findElement(By.id("profileBtn")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    @When("user fill email and password and click on login")
    public void user_fill_email_and_password_and_click_on_login() throws InterruptedException {

        loginpage = new HomePage();
        loginpage.performlogin("slemanalhasan", "123456Aa@@");

    }

    @And("user should navigate home page.")
    public void user_should__navigate_home_page() {
        System.out.println("done");
    }

    @Then("user logout from website")
    public void user_logout_from_website() throws InterruptedException {
        l= new LogOut();
        l.clickLog();
        Thread.sleep(3000);
        hooks=new Hooks();
        hooks.quit();
    }
}

