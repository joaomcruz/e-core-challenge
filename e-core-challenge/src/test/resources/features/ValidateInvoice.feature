@Alltests

Feature: Validate invoice information

  Scenario Outline: I enter correct data to login in to the system
    Given I have successfully logged into the application
    When I click on the first invoice details
    Then I validate the invoice hotel name information <HotelName>
    Then I validate the invoice date information <InvoiceDate>
    Then I validate the invoice Due Date information <DueDate>
    Then I validate the Invoice Number information <InvoiceNumber>
    Then I validate the invoice Booking Code information <BookingCode>
    Then I validate the invoice Customer Details information <CustomerDetails>
    Then I validate the invoice Room information <Room>
    Then I validate the invoice Check In information <CheckIn>
    Then I validate the invoice CheckOut information <CheckOut>
    Then I validate the invoice Total Stay Count information <TotalStayCount>
    Then I validate the invoice Total Stay Amount information <TotalStayAmount>
    Then I validate the invoice Deposit Now information <DepositNow>
    Then I validate the invoice Tax&VAT information <Tax&VAT>
    Then I validate the invoice Total Amount information <TotalAmount>

    Examples:
      | HotelName        | InvoiceDate | DueDate    | InvoiceNumber | BookingCode | CustomerDetails                          | Room            | CheckIn    | CheckOut   | TotalStayCount | TotalStayAmount | DepositNow | Tax&VAT | TotalAmount |
      | Rendezvous Hotel | 14/01/2018  | 15/01/2018 | 110           | 0875        | JOHNY SMITH  R2, AVENUE DU MAROC  123456 | Superior Double | 14/01/2018 | 15/01/2018 | 1              | $150            | USD $20.90 | USD $19 | USD $209    |