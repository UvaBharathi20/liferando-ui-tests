package liferando.pageobject.Homepage;

import liferando.commonUtils.Constants;

public class SearchOptionConstants extends Constants {
    private static final String searchBoxId = "combobox-input_0";

    private static final String addressOption = "//*[@data-qa=\"location-panel-results-item-element\"]";

    private static final String firstNameId="input[name='name']";
    public static String getSearchBoxId() {
        return searchBoxId;
    }
    public static String getAddressOption() {
        return addressOption;
    }
}
