import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ConstractorSection {
    public static final String URL = "https://stellarburgers.nomoreparties.site/";

    @FindBy(how = How.XPATH, using = ".//span[text()='Булки']")
    public SelenideElement HomePageBunsSection;

    @FindBy(how = How.XPATH, using = ".//span[text()='Соусы']")
    public SelenideElement HomePageSauceSection;

    @FindBy(how = How.XPATH, using = ".//span[text()='Начинки']")
    public SelenideElement HomePageFillingSection;

    @FindBy(how = How.XPATH, using = "//div[@class = 'tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[@class = 'text text_type_main-default'][text() = 'Булки']")
    public SelenideElement HomePageBunsSectionSelected;

    @FindBy(how = How.XPATH, using = "//div[@class = 'tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[@class = 'text text_type_main-default'][text() = 'Соусы']")
    public SelenideElement HomePageSauceSectionSelected;

    @FindBy(how = How.XPATH, using = "//div[@class = 'tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[@class = 'text text_type_main-default'][text() = 'Начинки']")
    public SelenideElement HomePageFillingSectionSelected;

    public ConstractorSection clickHomePageBunsSection() {
        this.HomePageBunsSection.click();
        return this;
    }

    public ConstractorSection clickHomePageSauceSection() {
        this.HomePageSauceSection.click();
        return this;
    }

    public ConstractorSection clickHomePageFillingSection() {
        this.HomePageFillingSection.click();
        return this;
    }

    public boolean isHomePageBunsSectionSelectedDisplayed() {
        return this.HomePageBunsSectionSelected.isDisplayed();
    }

    public boolean isHomePageSauceSectionSelectedDisplayed() {
        return this.HomePageSauceSectionSelected.isDisplayed();
    }

    public boolean isHomePageFillingSectionSelectedDisplayed() {
        return this.HomePageFillingSectionSelected.isDisplayed();
    }
}
