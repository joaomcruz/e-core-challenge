package pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class InvoicePage_PO extends Base_PO {

    public InvoicePage_PO() {
        super();
    }

    @FindBy(xpath = "//section[1]/div[1]/h4[1]")
    private WebElement hotelTitle;

    @FindBy(xpath = "//section[1]/div[1]/ul[1]/li[1]")
    private WebElement invoiceDate;

    @FindBy(xpath = "//section[1]/div[1]/ul[1]/li[2]")
    private WebElement dueDate;

    @FindBy(xpath = "//section[1]/div[1]/div[1]")
    private WebElement customerDetails;

    @FindBy(css = "div h6")
    private WebElement invoiceNumber;

    @FindBy(xpath = "//table[1]/tbody[1]/tr[1]/td[2]")
    private WebElement bookingCode;

    @FindBy(xpath = "//table[1]/tbody[1]/tr[2]/td[2]")
    private WebElement room;

    @FindBy(xpath = "//table[1]/tbody[1]/tr[3]/td[2]")
    private WebElement totalStayCount;

    @FindBy(xpath = "//table[1]/tbody[1]/tr[4]/td[2]")
    private WebElement totalStayAmount;

    @FindBy(xpath = "//table[1]/tbody[1]/tr[5]/td[2]")
    private WebElement checkIn;

    @FindBy(xpath = "//table[1]/tbody[1]/tr[6]/td[2]")
    private WebElement checkOut;

    @FindBy(xpath = "//table[2]/tbody[1]/tr/td[1]")
    private WebElement depositNow;

    @FindBy(xpath = "//table[2]/tbody[1]/tr/td[2]")
    private WebElement taxEVat;

    @FindBy(xpath = "//table[2]/tbody[1]/tr/td[3]")
    private WebElement totalAmount;

    public WebElement getDepositNow() {
        return depositNow;
    }

    public WebElement getTaxEVat() {
        return taxEVat;
    }

    public WebElement getTotalAmount() {
        return totalAmount;
    }

    public WebElement getInvoiceNumber() {
        return invoiceNumber;
    }

    public WebElement getHotelTitle() {
        return hotelTitle;
    }

    public WebElement getInvoiceDate() {
        return invoiceDate;
    }

    public WebElement getDueDate() {
        return dueDate;
    }


    public WebElement getCustomerDetails() {
        return customerDetails;
    }


    public WebElement getBookingCode() {
        return bookingCode;
    }

    public WebElement getRoom() {
        return room;
    }

    public WebElement getTotalStayCount() {
        return totalStayCount;
    }

    public WebElement getTotalStayAmount() {
        return totalStayAmount;
    }

    public WebElement getCheckIn() {
        return checkIn;
    }

    public WebElement getCheckOut() {
        return checkOut;
    }


}
