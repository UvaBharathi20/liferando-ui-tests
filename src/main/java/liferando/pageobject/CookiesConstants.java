package liferando.pageobject;

public class CookiesConstants {
    // accept all cookies class name
    private static final String acceptAllCookies = "button[aria-label=\"Accept all cookies\"]";
    private static final String acceptEssentialCookies = "button[aria-label=\"Accept essential cookie package\"]";

    public static String getAcceptAllCookies() {
        return acceptAllCookies;
    }
}
