package steps;

import net.thucydides.core.annotations.Step;
import pages.MainPage;
import pages.SearchDropDownSection;
import pages.WeatherTodayPage;

public class SearchSteps {
    private MainPage mainPage;
    private WeatherTodayPage weatherTodayPage;
    private SearchDropDownSection searchDropDownSection;

    @Step("Open Weather.com website")
    public void openPage(){
        mainPage.open();
    }

    @Step("Type query")
    public void typeQuery(String query){
        mainPage.searchInput.type(query);
    }

    @Step("Click on the search field")
    public void clickOnTheSearchButton(){
        mainPage.searchInput.click();
    }

    @Step ("Verify there is the weather forecast for this city")
    public boolean verifyCityWeatherForecastExist(String query) {
        searchDropDownSection.searchDropDown.get(0).click();
        return weatherTodayPage.location.getText().contains(query.toUpperCase());
    }

    @Step ("Verify there is message")
    public boolean verifyProblem(String errorMessage) {
        return (searchDropDownSection.searchDropDown.get(0).getText()).equals(errorMessage);
    }
}
