package spartaglobal.com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ITVHomepage {
    private WebDriver driver;
    private String homepageURL = "https://www.itv.com/";
    private By WatchLiveButtonID = By.id("nav-primary-live-tv");
    private By ShowsButtonID = By.id("nav-primary-a-z");
    private ITVHomepage itvHomepage;
    private ShowsPage showsPage;


    public ITVHomepage (WebDriver driver){
    this.driver = driver;
    this.showsPage = new ShowsPage(driver);
    this.itvHomepage = new ITVHomepage(driver);
    }
    public ITVHomepage getItvHomepage() {
        return itvHomepage;
    }

    public ShowsPage getShowsPage() {
        return showsPage;
    }

    public ITVHomepage gotoITVHomepageURL(){
        driver.navigate().to(homepageURL);
        return this;
    }
    public ITVHomepage clickWatchLive(){
        driver.findElement(WatchLiveButtonID).click();
        return this;
    }
    public ITVHomepage clickShowsButton() {
        driver.findElement(ShowsButtonID).click();
        return this;
    }

}

