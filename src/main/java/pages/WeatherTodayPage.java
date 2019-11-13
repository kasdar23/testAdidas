package pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WeatherTodayPage extends PageObject{

    @FindBy(xpath = "//h1[contains(@class,'h4')]")
    public WebElement location;
}
