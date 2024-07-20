package steps;

import dm.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.Login;

import java.io.IOException;
import java.time.Duration;


public class LogInSteps extends Base {

    HomePage loginpage;
    Login perform;
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(50));

    Hooks hooks;

    @Given("user open website and go to login test.")
    public void user_open_website_and_go_to_login_test() throws IOException, InterruptedException {
        launchBrowser("firefox");

        driver.findElement(By.id("profileBtn")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }
    @When("user fill email and password and click on login.")
    public void user_fill_email_and_password_and_click_on_login() throws InterruptedException {
        Thread.sleep(3000);
        loginpage=new HomePage();
        loginpage.performlogin("slemanalhasan","123456Aa@@" );

    }
    @Then("user should navigate to home page.")
    public void user_should_navigate_to_home_page() throws InterruptedException {
       perform = new Login();
       perform.perform();
        hooks=new Hooks();
        hooks.quit();

        }

        @When("user fill email and password invalid and click on login.")
        public void user_fill_email_and_password_invalid_and_click_on_login() throws InterruptedException {
        loginpage = new HomePage();
        loginpage.invalid("Sleamnaaaa", "123456789");
        Thread.sleep(2000);


        }

    @When("user fill email and password invalid contain many number.")
    public void userFillEmailAndPasswordInvalidContainManyNumber() throws InterruptedException {
        loginpage = new HomePage();
        loginpage.invalid("Sleaman", "1234567855555555555555555555555555555555555555555555555555555555555555");
        Thread.sleep(2000);

    }

    @When("user fill email and password invalid contain one number or character")
    public void userFillEmailAndPasswordInvalidContainOneNumberOrCharacter() throws InterruptedException {
        loginpage = new HomePage();
        loginpage.invalid("Sleaman", "1");
        Thread.sleep(2000);
    }

    @Then("is error")
    public void is_error() throws InterruptedException {
        System.out.println("error");
        hooks=new Hooks();
        hooks.quit();

    }
}


