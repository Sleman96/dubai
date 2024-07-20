package steps;

import dm.Base;
import io.cucumber.java.AfterAll;
import org.testng.annotations.AfterMethod;

public class Hooks extends Base {

    @AfterMethod
    public void quit() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}
