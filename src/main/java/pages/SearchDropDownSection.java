package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.util.List;

public class SearchDropDownSection extends PageObject {

    @FindBy(css = ".styles__item__sCSPm")
    public List<WebElementFacade> searchDropDown;
}
