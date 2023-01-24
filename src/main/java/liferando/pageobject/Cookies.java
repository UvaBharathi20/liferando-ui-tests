package liferando.pageobject;

import org.openqa.selenium.By;
import liferando.commonUtils.Utils;

public class Cookies {
    public static void acceptCookies() throws InterruptedException {
        Utils.getDriver().findElement(By.cssSelector(CookiesConstants.getAcceptAllCookies())).click();
        Utils.getDriver().switchTo().defaultContent();
        Thread.sleep(3000);
    }
}
