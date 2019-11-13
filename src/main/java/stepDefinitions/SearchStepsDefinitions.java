package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import steps.SearchSteps;

public class SearchStepsDefinitions {
    @Steps
    SearchSteps searchSteps;

    @Given("I am on the Weather.com main page")
    public void open(){
        searchSteps.openPage();
    }

    @And("Click on the search field")
    public void clickOnTheSearchButton(){
        searchSteps.clickOnTheSearchButton();
    }

    @When("I type (.*)$")
    public void typeQuery(String query){
        searchSteps.typeQuery(query);
    }

    @Then("I verify there is the weather forecast for (.*)$")
    public void cityWeatherForecastExist(String query){
        Assert.assertTrue("Verify there is the weather forecast for " + query, searchSteps.verifyCityWeatherForecastExist(query));
    }

    @Then("I verify there is the message: (.*)$")
    public void wrongSearch(String errorMessage){
        Assert.assertTrue("Verify there is the message: " + errorMessage, searchSteps.verifyProblem(errorMessage));
    }
}
