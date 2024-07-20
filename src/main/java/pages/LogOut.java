package pages;

import dm.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LogOut extends Base {


    public LogOut(){
        PageFactory.initElements(driver, this);}

    @FindBy(css="#loginForm\\:username")
    WebElement user;

    @FindBy(css="#loginForm\\:password")
    WebElement passaword;

    @FindBy(css="#Button_cust")
    WebElement login ;

    @FindBy(css="button.mx-name-actionButton6:nth-child(1)")
    WebElement logout;
    @FindBy(css="div.active > a:nth-child(4)")
    WebElement logEnd;

    public void performlogin (String name, String pass) throws InterruptedException {

        Thread.sleep(3000);
        user.sendKeys(name);
        passaword.sendKeys(pass);
        Thread.sleep(3000);
        login.click();}

    public void clickLog() throws InterruptedException {
        Thread.sleep(5000);
        logout.click();
        Thread.sleep(5000);
        logEnd.click();
        Thread.sleep(3000);

    }


}
