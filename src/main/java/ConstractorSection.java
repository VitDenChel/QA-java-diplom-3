import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ConstractorSection {
    public static final String URL = "https://stellarburgers.nomoreparties.site/";

    @FindBy(how = How.XPATH, using = ".//span[text()='Булки']")
    public SelenideElement homePageBunsSection;

    @FindBy(how = How.XPATH, using = ".//span[text()='Соусы']")
    public SelenideElement homePageSauceSection;

    @FindBy(how = How.XPATH, using = ".//span[text()='Начинки']")
    public SelenideElement homePageFillingSection;

    @FindBy(how = How.XPATH, using = "//div[@class = 'tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[@class = 'text text_type_main-default'][text() = 'Булки']")
    public SelenideElement homePageBunsSectionSelected;

    @FindBy(how = How.XPATH, using = "//div[@class = 'tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[@class = 'text text_type_main-default'][text() = 'Соусы']")
    public SelenideElement homePageSauceSectionSelected;

    @FindBy(how = How.XPATH, using = "//div[@class = 'tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[@class = 'text text_type_main-default'][text() = 'Начинки']")
    public SelenideElement homePageFillingSectionSelected;

    public ConstractorSection clickHomePageBunsSection() {
        this.homePageBunsSection.click();
        return this;
    }

    public ConstractorSection clickHomePageSauceSection() {
        this.homePageSauceSection.click();
        return this;
    }

    public ConstractorSection clickHomePageFillingSection() {
        this.homePageFillingSection.click();
        return this;
    }

    public boolean isHomePageBunsSectionSelectedDisplayed() {
        return this.homePageBunsSectionSelected.isDisplayed();
    }

    public boolean isHomePageSauceSectionSelectedDisplayed() {
        return this.homePageSauceSectionSelected.isDisplayed();
    }

    public boolean isHomePageFillingSectionSelectedDisplayed() {
        return this.homePageFillingSectionSelected.isDisplayed();
    }
}
