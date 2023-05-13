package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.*;


public class Login_Steps extends Base_PO {

    private final HomePage_PO homePage_PO;


    private final LoggedPage_PO loggedPage_PO;

    private final InvoicePage_PO invoicePagePo;


    public Login_Steps(HomePage_PO homePage_PO, LoggedPage_PO loggedPage_PO,InvoicePage_PO invoicePagePo) {
        this.homePage_PO = homePage_PO;
        this.loggedPage_PO = loggedPage_PO;
        this.invoicePagePo = invoicePagePo;
    }

    @Given("I access the website to login")
    public void I_access_the_website_to_login() {
        homePage_PO.visitHomePage();
    }

    @And("I enter the username {word}")
    public void I_enter_the_username(String username) {
        homePage_PO.fillUsernameInput(username);
    }

    @And("I enter the password {word}")
    public void I_enter_the_password(String password) {
        homePage_PO.fillPasswordInput(password);
    }

    @And("I click on the login button")
    public void I_click_on_the_login_button() {
        homePage_PO.clickOnLoginButton();
    }

    @Then("I check that I successfully logged in")
    public void I_check_that_i_successfully_logged_in() {
        isElementPresent(loggedPage_PO.getButtonLogoutXpath());
    }

    @Then("I check that I am presented with a wrong credentials message {}")
    public void I_check_that_i_am_presented_with_a_wrong_credentials_message(String message) {
        assertWebElementString(message, homePage_PO.getErrorMessageWebElement());
    }

}
