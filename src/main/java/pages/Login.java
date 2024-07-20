package pages;

import dm.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login extends Base {
   public Login(){
        PageFactory.initElements(driver, this);
    }
    JavascriptExecutor executor = (JavascriptExecutor)driver;

    @FindBy(css=".mx-name-actionButton119")
    WebElement profile;

    @FindBy(css="button.btn:nth-child(3)")
    WebElement payment;

 public  void perform() throws InterruptedException {
     Thread.sleep(5000);
     executor.executeScript("arguments[0].click();",profile);
      driver.navigate().to("https://hub.dm.gov.ae/link/Dashboard");
      Thread.sleep(5000);
     executor.executeScript("arguments[0].click();",payment);
      Thread.sleep(1000);

 }



}
