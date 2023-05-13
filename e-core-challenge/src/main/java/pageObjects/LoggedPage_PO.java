package pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;


public class LoggedPage_PO extends Base_PO {


    @FindBy(xpath = "//a[contains(text(), 'Invoice Details')]")
    private List<WebElement> invoiceDetailsButton;

    @FindBy(xpath = "//a[text() = 'Logout']")
    private WebElement logoutButton;


    private String logoutButtonXpath = "//a[text() = 'Logout']";

    public String getButtonLogoutXpath() {
        return logoutButtonXpath;
    }
    public LoggedPage_PO() {
        super();
    }

    public void clickInvoiceDetails()  {
        clickFirstElementListAndSwitchToNewTab(invoiceDetailsButton);
    }


}
