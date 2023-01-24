package liferando.pageobject.bookingPersonalDetailsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import liferando.commonUtils.Utils;

import static liferando.pageobject.DriverActions.entervalues;

public class BookingPersonalDetails {

    public static void enterPersonalDetails(String adddress, String vatNo, String email, String phone) throws InterruptedException {
        WebDriver driver = Utils.getDriver();

        entervalues(driver.findElement(By.cssSelector(BookingPersonalDetailsConstants.getCompanyNameId())),"TestComapny");
        driver.findElement(By.cssSelector(BookingPersonalDetailsConstants.getSalutation())).click();
        driver.findElement(By.cssSelector(BookingPersonalDetailsConstants.getChooseSalutation())).click();
        entervalues(driver.findElement(By.cssSelector(BookingPersonalDetailsConstants.getFirstNameId())),"testfirstname");
        entervalues(driver.findElement(By.cssSelector(BookingPersonalDetailsConstants.getLastNameId())),"testlastname");
        WebElement addresElement = driver.findElement(By.cssSelector(BookingPersonalDetailsConstants.getAddress()));
        entervalues(addresElement, adddress);
        addresElement.sendKeys(Keys.RETURN);
        Thread.sleep(3000);
        entervalues(driver.findElement(By.cssSelector(BookingPersonalDetailsConstants.getVATId())), vatNo);
        entervalues(driver.findElement(By.cssSelector(BookingPersonalDetailsConstants.getEmailId())), email);
        entervalues(driver.findElement(By.cssSelector(BookingPersonalDetailsConstants.getPhoneId())), phone);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(BookingPersonalDetailsConstants.getnextButton())).click();
    }

    public static void completeBooking(){
        WebDriver driver = Utils.getDriver();
        driver.findElement(By.cssSelector(BookingPersonalDetailsConstants.getOtherId())).click();
        entervalues(driver.findElement(By.cssSelector(BookingPersonalDetailsConstants.getOtherTextBox())), "test");
        driver.findElement(By.cssSelector(BookingPersonalDetailsConstants.getAcceptId())).click();
        driver.findElement(By.cssSelector(BookingPersonalDetailsConstants.getnextButton())).click();
    }
}
