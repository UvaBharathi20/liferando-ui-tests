package liferando.minimumOrderAmount;

import liferando.commonUtils.Utils;
import liferando.pageobject.Homepage.SearchOption;
import liferando.pageobject.RestaurantListPage.RestaurantList;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static liferando.pageobject.Cookies.acceptCookies;

public class TestSearchWithMinimumOrderAmount {
    @BeforeMethod
    public void setUp() throws InterruptedException {
        Utils.setProperty();
        Utils.startChromeSession();
        Utils.openLiferandoApp();
    }

    @AfterMethod
    public void tearDown() {
        //Utils.quitDriver();
    }

    @DataProvider(name = "user-details-provider")
    public Object[][] dataProviderMethod() {
        return new Object[][]{{ "Pistoriusstrasse 141, Berlin"}};
    }


    @Test(dataProvider = "user-details-provider")
    public void booking(String address) throws InterruptedException {
        acceptCookies();
        SearchOption.enterAddressInSearchBar(address);
        SearchOption.selectAddress();
        RestaurantList.selectOption10AndLess();
    }
}
