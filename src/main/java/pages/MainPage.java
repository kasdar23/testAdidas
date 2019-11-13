package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https:\\Weather.com")
public class MainPage extends PageObject {

    @FindBy(xpath = "//input")
    public WebElementFacade searchInput;
}
