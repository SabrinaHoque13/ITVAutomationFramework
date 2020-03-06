package spartaglobal.com.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import spartaglobal.com.Pages.ITVHomepage;
import spartaglobal.com.SeleniumConfig.SeleniumConfig;

public class ITVSiteStepDefs {
    private SeleniumConfig seleniumConfig = new SeleniumConfig("chrome", "C:\\Users\\sabri\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
    private ITVHomepage itvHomepage = new ITVHomepage(seleniumConfig.getDriver());


    @Given("I am on itv.com")
    public void i_am_on_itv_com() {
        itvHomepage.getItvHomepage().gotoITVHomepageURL();        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @When("I click on the Show button in the header")
    public void i_click_on_the_Show_button_in_the_header() {
        itvHomepage.getItvHomepage().gotoITVHomepageURL().clickShowsButton();
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @Then("I will see all the shows available for viewing")
    public void i_will_see_all_the_shows_available_for_viewing() {
        itvHomepage.getShowsPage().gotoShowsPageURL();
        Assert.assertEquals("https://www.itv.com/hub/shows", seleniumConfig.getDriver().getCurrentUrl());
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
 }


 }
