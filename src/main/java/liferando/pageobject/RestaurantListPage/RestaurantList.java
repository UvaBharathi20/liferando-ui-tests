package liferando.pageobject.RestaurantListPage;

import liferando.commonUtils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;

import static liferando.commonUtils.Constants.getWaitAfterClick;


public class RestaurantList {
    static WebDriver driver = Utils.getDriver();
    public static void selectOption10AndLess() throws InterruptedException{
        driver.findElement(By.cssSelector(RestaurantListConstants.getFilterBy10AndLess())).click();
        Thread.sleep(getWaitAfterClick());
    }

    public static void selectTheCategory(String category) throws InterruptedException{
        if(category=="italian")
            driver.findElement(By.cssSelector(RestaurantListConstants.getItalianCategory())).click();
    }

    public static void validateSelectedCategory(String category) throws InterruptedException{
        Boolean restaurantHasCategory = false;
        List<WebElement> restaurantCuisineList = driver.findElements(By.cssSelector(RestaurantListConstants.getRestaurantCuisines()));
        for(WebElement restaurantCuisines: restaurantCuisineList) {
            List<WebElement>  cuisines = restaurantCuisines.findElements(By.cssSelector("span[data-qa=\"cuisine\"]"));
            System.out.println("###");
            for(WebElement cuisine: cuisines){
                if(cuisine.getText().contains(category))
                    restaurantHasCategory= true;
            }
            //check after iterating each restaurant.
            Assert.assertFalse(!restaurantHasCategory,"Non category restaurant displayed");
            restaurantHasCategory = false;

        }
    }
}