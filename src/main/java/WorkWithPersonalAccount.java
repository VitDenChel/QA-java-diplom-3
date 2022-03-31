import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WorkWithPersonalAccount {
    public static final String URL = "https://stellarburgers.nomoreparties.site/";

    @FindBy(how = How.XPATH, using = ".//p[text()='Личный Кабинет']")
    public SelenideElement homePagePersonalAccountButton;

    // Кнопка "Войти" на странице входа в аккаунт
    @FindBy(how = How.CSS, using = "[class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']")
    public SelenideElement enterButtonForEnterInPersonalAccount;

    // Кнопка "Конструктор" в личном кабинете
    @FindBy(how = How.XPATH, using = ".//p[text()='Конструктор']")
    public SelenideElement personalAccountPageConstructorButton;

    // Логотип “Stellar Burgers”
    @FindBy(how = How.XPATH, using = "//div[@class='AppHeader_header__logo__2D0X2']")
    public SelenideElement personalAccountPageLogotypeStellarBurgers;

    //Кнопка "Булки"
    @FindBy(how = How.XPATH, using = ".//span[text()='Булки']")
    public SelenideElement homePageBunsButton;

    @FindBy(how = How.CSS, using = "input[type=text]")
    public SelenideElement emailBoxEnterInPersonalAccount;

    @FindBy(how = How.CSS, using = "input[type=password]")
    public SelenideElement passwordBoxEnterInPersonalAccount;

    @FindBy(how = How.CSS, using = "button[type=button]")
    public SelenideElement personalAccountPageExitButton;

    public WorkWithPersonalAccount clickHomePagePersonalAccountButton() {
        this.homePagePersonalAccountButton.click();
        return this;
    }

    public boolean isEnterButtonForEnterInPersonalAccountDisplayed() {
        return this.enterButtonForEnterInPersonalAccount.isDisplayed();
    }

    public WorkWithPersonalAccount clickPersonalAccountPageConstructorButton() {
        this.personalAccountPageConstructorButton.click();
        return this;
    }

    public WorkWithPersonalAccount clickPersonalAccountPageLogotypeStellarBurgers() {
        this.personalAccountPageLogotypeStellarBurgers.click();
        return this;
    }

    public boolean isHomePageBunsButtonDisplayed() {
        return this.homePageBunsButton.isDisplayed();
    }

    public WorkWithPersonalAccount clickEmailBoxEnterInPersonalAccount() {
        this.emailBoxEnterInPersonalAccount.click();
        return this;
    }

    public WorkWithPersonalAccount setEmail(String Email) {
        this.emailBoxEnterInPersonalAccount.sendKeys(Email);
        return this;
    }

    public WorkWithPersonalAccount clickPasswordBoxEnterInPersonalAccount() {
        this.passwordBoxEnterInPersonalAccount.click();
        return this;
    }

    public WorkWithPersonalAccount setPassword(String Password) {
        this.passwordBoxEnterInPersonalAccount.sendKeys(Password);
        return this;
    }

    public WorkWithPersonalAccount clickEnterButtonForEnterInPersonalAccount() {
        this.enterButtonForEnterInPersonalAccount.click();
        return this;
    }

    public WorkWithPersonalAccount clickPersonalAccountPageExitButton() {
        this.personalAccountPageExitButton.click();
        return this;
    }
}
