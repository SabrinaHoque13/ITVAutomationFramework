package spartaglobal.com.Pages;

import org.openqa.selenium.WebDriver;

import java.util.WeakHashMap;

public class ShowsPage {
    private WebDriver driver;
    private String showspageURL = "https://www.itv.com/hub/shows";

    public ShowsPage( WebDriver driver) {
        this.driver = driver;
    }
    public ShowsPage gotoShowsPageURL(){
        driver.navigate().to(showspageURL);

        return this;
    }
}
