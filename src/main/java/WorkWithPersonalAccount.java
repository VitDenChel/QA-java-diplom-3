import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WorkWithPersonalAccount {
    public static final String URL = "https://stellarburgers.nomoreparties.site/";

    @FindBy(how = How.XPATH, using = ".//p[text()='Личный Кабинет']")
    public SelenideElement HomePagePersonalAccountButton;

    // Кнопка "Войти" на странице входа в аккаунт
    @FindBy(how = How.XPATH, using = "//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']")
    public SelenideElement EnterButtonForEnterInPersonalAccount;

    // Кнопка "Конструктор" в личном кабинете
    @FindBy(how = How.XPATH, using = ".//a[@class='AppHeader_header__link__3D_hX']")
    public SelenideElement PersonalAccountPageConstructorButton;

    // Логотип “Stellar Burgers”
    @FindBy(how = How.XPATH, using = "//div[@class='AppHeader_header__logo__2D0X2']")
    public SelenideElement PersonalAccountPageLogotypeStellarBurgers;

    //Кнопка "Булки"
    @FindBy(how = How.XPATH, using = ".//span[text()='Булки']")
    public SelenideElement HomePageBunsButton;

    @FindBy(how = How.XPATH, using = "//input[@class='text input__textfield text_type_main-default']")
    public SelenideElement EmailBoxEnterInPersonalAccount;

    @FindBy(how = How.XPATH, using = ".//input[@name ='Пароль']")
    public SelenideElement PasswordBoxEnterInPersonalAccount;

    @FindBy(how = How.XPATH, using = "//button[@class='Account_button__14Yp3 text text_type_main-medium text_color_inactive']")
    public SelenideElement PersonalAccountPageExitButton;

    public WorkWithPersonalAccount clickHomePagePersonalAccountButton() {
        this.HomePagePersonalAccountButton.click();
        return this;
    }

    public boolean isEnterButtonForEnterInPersonalAccountDisplayed() {
        return this.EnterButtonForEnterInPersonalAccount.isDisplayed();
    }

    public WorkWithPersonalAccount clickPersonalAccountPageConstructorButton() {
        this.PersonalAccountPageConstructorButton.click();
        return this;
    }

    public WorkWithPersonalAccount clickPersonalAccountPageLogotypeStellarBurgers() {
        this.PersonalAccountPageLogotypeStellarBurgers.click();
        return this;
    }

    public boolean isHomePageBunsButtonDisplayed() {
        return this.HomePageBunsButton.isDisplayed();
    }

    public WorkWithPersonalAccount clickEmailBoxEnterInPersonalAccount() {
        this.EmailBoxEnterInPersonalAccount.click();
        return this;
    }

    public WorkWithPersonalAccount setEmail(String Email) {
        this.EmailBoxEnterInPersonalAccount.sendKeys(Email);
        return this;
    }

    public WorkWithPersonalAccount clickPasswordBoxEnterInPersonalAccount() {
        this.PasswordBoxEnterInPersonalAccount.click();
        return this;
    }

    public WorkWithPersonalAccount setPassword(String Password) {
        this.PasswordBoxEnterInPersonalAccount.sendKeys(Password);
        return this;
    }

    public WorkWithPersonalAccount clickEnterButtonForEnterInPersonalAccount() {
        this.EnterButtonForEnterInPersonalAccount.click();
        return this;
    }

    public WorkWithPersonalAccount clickPersonalAccountPageExitButton() {
        this.PersonalAccountPageExitButton.click();
        return this;
    }
}
