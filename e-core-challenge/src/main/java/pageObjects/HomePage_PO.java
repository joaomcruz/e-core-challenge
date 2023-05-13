package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Global_Variables;


public class HomePage_PO extends Base_PO {

    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;

    @FindBy(id = "btnLogin")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@role = 'alert']")
    private WebElement errorMessageWebElement;



    public HomePage_PO() {
        super();
    }

    public void visitHomePage() {
        navigateTo_URL(Global_Variables.URL);
    }


    public void login(String username,String password){
        fillUsernameInput(username);
        fillPasswordInput(password);
        waitForWebElementAndClick(loginButton);
    }

    public void fillUsernameInput(String username) {
        sendKeys(usernameField,username);
    }

    public void fillPasswordInput(String password) {
        sendKeys(passwordField,password);
    }

    public void clickOnLoginButton(){
        waitForWebElementAndClick(loginButton);
    }

    public WebElement getErrorMessageWebElement() {
        return errorMessageWebElement;
    }


}
