package liferando.restaurantCategories;

import liferando.commonUtils.Utils;
import liferando.pageobject.Homepage.SearchOption;
import liferando.pageobject.RestaurantListPage.RestaurantList;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static liferando.pageobject.Cookies.acceptCookies;

public class TestSelectionOfCousine {
    @BeforeMethod
    public void setUp() throws InterruptedException {
        Utils.setProperty();
        Utils.startChromeSession();
        Utils.openLiferandoApp();
    }

    @AfterMethod
    public void tearDown() {
        Utils.quitDriver();
    }

    @DataProvider(name = "user-details-provider")
    public Object[][] dataProviderMethod() {
        return new Object[][]{{ "Pistoriusstrasse 141, Berlin", "italian"}};
    }

    @Test(dataProvider = "user-details-provider")
    public void CuisineSelectionTest(String address, String category) throws InterruptedException {
        acceptCookies();
        SearchOption.enterAddressInSearchBar(address);
        SearchOption.selectAddress();
        RestaurantList.selectTheCategory(category);
        RestaurantList.validateSelectedCategory(category);
    }
}
