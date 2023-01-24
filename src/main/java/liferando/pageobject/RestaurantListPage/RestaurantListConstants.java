package liferando.pageobject.RestaurantListPage;

import liferando.commonUtils.Constants;

public class RestaurantListConstants extends Constants {
    private static final String filterByShowAll = "label[for=\"radio_0\"]";
    private static final String filterBy10AndLess = "label[for=\"radio_1\"]";
    private static final String filterBy15AndLess = "label[for=\"radio_2\"]";
    private static final String italianCategory = "div[aria-label=\"Select Italian style pizza category\"]";
    private static final String restaurantCuisines = "div[data-qa=\"restaurant-cuisines\"]";

    public static String getFilterBy10AndLess() {
        return filterBy10AndLess;
    }
    public static String getItalianCategory() {
        return italianCategory;
    }
    public static String getRestaurantCuisines(){
        return restaurantCuisines;
    }
}
