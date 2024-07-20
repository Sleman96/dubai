package pages;

import dm.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "profileBtn")
    WebElement Homelog;

    @FindBy(css="#loginForm\\:username")
    WebElement user;

    @FindBy(css="#loginForm\\:password")
    WebElement passaword;

    @FindBy(css="#Button_cust")
    WebElement login ;

    @FindBy(css="#searchfield > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > input:nth-child(1)")
    WebElement search;

    @FindBy(css=".search-btn-mag")
    WebElement searchClick;

    @FindBy(css="#searchcontainer-header > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > input:nth-child(1)")
    WebElement searchHeader;
    @FindBy(css="#searchcontainer-headermain > i:nth-child(1)")
    WebElement headerClick;
    @FindBy(css="#menu-item-302295 > a:nth-child(1)")
    WebElement services;
    @FindBy(css="a.translate:nth-child(1)")
    WebElement arabic;

     public void performlogin (String name, String pass) throws InterruptedException {

         user.sendKeys(name);
         passaword.sendKeys(pass);
         Thread.sleep(3000);
         login.click();

     }

       public void invalid(String n, String p) throws InterruptedException {

         Thread.sleep(3000);
           user.sendKeys(n);
           passaword.sendKeys(p);
           Thread.sleep(3000);
           login.click();

       }
       public void searchEngine() throws InterruptedException {
         Thread.sleep(3000);
         search.sendKeys("news");
         Thread.sleep(3000);
         searchClick.click();

    }

    public void searchHeader() throws InterruptedException {
         Thread.sleep(3000);
         searchHeader.sendKeys("news");
         Thread.sleep(3000);
         headerClick.click();

    }
    public void OnclickServies()throws InterruptedException {
         driver.manage().window().maximize();
         Thread.sleep(3000);
         services.click();
         Thread.sleep(3000);
    }
    public void translateToArabic() throws InterruptedException {
         Thread.sleep(3000);
         arabic.click();
    }
}
