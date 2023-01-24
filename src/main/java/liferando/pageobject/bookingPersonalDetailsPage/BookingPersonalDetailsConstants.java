package liferando.pageobject.bookingPersonalDetailsPage;

public class BookingPersonalDetailsConstants {
    private static final String companyNameId = "input[name='company']";

    private static final String salutation = "select[name='salutation']";

    private static final String chooseSalutation="option[value='Mr']";
    private static final String firstNameId="input[name='name']";
    private static final String lastNameId="input[name='surname']";
    private static final String address="input[name='address']";
    private static final String VATId="input[name='vatNo']";
    private static final String emailId="input[name='email']";
    private static final String phoneId="input[name='tel']";
    private static final String nextButtton="button[type='submit']";
    //complete booking page
    private static final String otherId="input[id='other']";
    private static final String otherTextBox="input[placeholder='miscellaneous']";
    private static final String acceptId="input[id='accept']";

    public static String getCompanyNameId() {
        return companyNameId;
    }
    public static String getSalutation() { return salutation; }
    public static String getChooseSalutation() {
        return chooseSalutation;
    }
    public static String getFirstNameId() {
        return firstNameId;
    }
    public static String getLastNameId() {
        return lastNameId;
    }
    public static String getAddress() {
        return address;
    }
    public static String getVATId() {
        return VATId;
    }
    public static String getEmailId() { return emailId; }
    public static String getPhoneId() { return phoneId; }
    public static String getnextButton() { return nextButtton; }
    public static String getOtherId() { return otherId; }
    public static String getOtherTextBox() { return otherTextBox; }
    public static String getAcceptId() { return acceptId; }
}
