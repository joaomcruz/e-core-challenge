package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.*;
import utils.Global_Variables;

public class InvoiceDetails_Steps extends Base_PO {

    private final HomePage_PO homePage_PO;

    private final LoggedPage_PO loggedPage_PO;

    private final InvoicePage_PO invoicePagePo;


    public InvoiceDetails_Steps(HomePage_PO homePage_PO, LoggedPage_PO loggedPage_PO, InvoicePage_PO invoicePagePo) {
        this.homePage_PO = homePage_PO;
        this.loggedPage_PO = loggedPage_PO;
        this.invoicePagePo = invoicePagePo;
    }


    @Given("I have successfully logged into the application")
    public void I_successfully_log_in() {
        homePage_PO.visitHomePage();
        homePage_PO.login(Global_Variables.USERNAME, Global_Variables.PASSWORD);
        isElementPresent(loggedPage_PO.getButtonLogoutXpath());
    }

    @When("I click on the first invoice details")
    public void I_click_on_the_first_invoice_details() {
        loggedPage_PO.clickInvoiceDetails();
    }

    @Then("I validate the invoice hotel name information {}")
    public void I_validate_the_invoice_hotel_name_information(String hotelName) {
        assertWebElementString(hotelName, invoicePagePo.getHotelTitle());
    }

    @Then("I validate the invoice date information {}")
    public void I_validate_the_invoice_date_information(String invoiceDate) {
        assertDate(invoiceDate, invoicePagePo.getInvoiceDate());
    }

    @Then("I validate the invoice Due Date information {}")
    public void I_validate_the_invoice_due_date_information(String dueDate) {
        assertDate(dueDate, invoicePagePo.getDueDate());
    }

    @Then("I validate the Invoice Number information {}")
    public void I_validate_the_invoice_number_information(String invoiceNumber) {
        assertWebElementValue(invoiceNumber, invoicePagePo.getInvoiceNumber());
    }

    @Then("I validate the invoice Booking Code information {}")
    public void I_validate_the_invoice_booking_code_information(String bookingCode) {
        assertWebElementString(bookingCode, invoicePagePo.getBookingCode());
    }

    @Then("I validate the invoice Customer Details information {}")
    public void I_validate_the_invoice_customer_details_information(String customerDetails) {
       assertWebElementTrimmedStrings(customerDetails, invoicePagePo.getCustomerDetails());
    }

    @Then("I validate the invoice Room information {}")
    public void I_validate_the_invoice_room_information(String invoiceRoom) {
        assertWebElementString(invoiceRoom, invoicePagePo.getRoom());
    }

    @Then("I validate the invoice Check In information {}")
    public void I_validate_the_invoice_check_in_information(String checkIn) {
        assertWebElementString(checkIn,invoicePagePo.getCheckIn());
    }

    @Then("I validate the invoice CheckOut information {}")
    public void I_validate_the_invoice_check_out_information(String checkOut) {
        assertWebElementString(checkOut, invoicePagePo.getCheckOut());
    }

    @Then("I validate the invoice Total Stay Count information {}")
    public void I_validate_the_invoice_total_stay_count_information(String totalStayCount) {
        assertWebElementString(totalStayCount, invoicePagePo.getTotalStayCount());
    }

    @Then("I validate the invoice Total Stay Amount information {}")
    public void I_validate_the_invoice_total_stay_amount_information(String totalStayAmount) {
        assertWebElementString(totalStayAmount, invoicePagePo.getTotalStayAmount());
    }

    @Then("I validate the invoice Deposit Now information {}")
    public void I_validate_the_invoice_deposit_now_information(String depositNow) {
        assertWebElementString(depositNow, invoicePagePo.getDepositNow());
    }

    @Then("I validate the invoice Tax&VAT information {}")
    public void I_validate_the_invoice_taxvat_information(String taxeVat) {
        assertWebElementString(taxeVat, invoicePagePo.getTaxEVat());
    }

    @Then("I validate the invoice Total Amount information {}")
    public void I_validate_the_invoice_total_amount_information(String totalAmount) {
        assertWebElementString(totalAmount, invoicePagePo.getTotalAmount());
    }


}


