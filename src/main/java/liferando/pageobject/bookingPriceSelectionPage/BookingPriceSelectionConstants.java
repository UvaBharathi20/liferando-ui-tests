package liferando.pageobject.bookingPriceSelectionPage;

public class BookingPriceSelectionConstants {
    //xpath for average gross salary 1000 button
    private static final String upTo1000 = "label[for='average-gross-1000']";

    //css for started package.
    private static final String starterPackage = "div._packages__items_5qgvw_147 > div:nth-child(1) > div._package__info_5qgvw_192 > div._package__button_5qgvw_271";

    // Next button
    private static final String nextButton = "button[type='submit']";

    public static String getUpTo1000() {
        return upTo1000;
    }

    public static String getStarterPackage() {
        return starterPackage;
    }

    public static String getNextButton() {
        return nextButton;
    }
}

