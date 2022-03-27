import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EnterInPersonalAccount {
    public static final String URL = "https://stellarburgers.nomoreparties.site/";

    @FindBy(how = How.XPATH, using = "//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg']")
    public SelenideElement HomePageEnterButtonPersonalAccount;

    @FindBy(how = How.XPATH, using = "//input[@class='text input__textfield text_type_main-default']")
    public SelenideElement EmailBoxEnterInPersonalAccount;


    @FindBy(how = How.XPATH, using = ".//input[@name ='Пароль']")
    public SelenideElement PasswordBoxEnterInPersonalAccount;


    @FindBy(how = How.XPATH, using = "//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']")
    public SelenideElement EnterButtonForEnterInPersonalAccount;

      @FindBy(how = How.XPATH, using = ".//p[text()='Личный Кабинет']")
    public SelenideElement HomePagePersonalAccountButton;

    @FindBy(how = How.XPATH, using = ".//a[text()='Зарегистрироваться']")
    public SelenideElement SingUpButtonOnEnterPageOfPersonalAccount;

    @FindBy(how = How.XPATH, using = ".//a[text()='Войти']")
    public SelenideElement SingUpPageEnterButtonPersonalAccount;

    @FindBy(how = How.XPATH, using = ".//a[@class='Auth_link__1fOlj'][text() = 'Восстановить пароль']")
    public SelenideElement RestorePasswordButtonOnEnterPageOfPersonalAccount;

    @FindBy(how = How.XPATH, using = ".//a[@class='Auth_link__1fOlj'][text() = 'Войти']")
    public SelenideElement RecoveryPasswordPageEnterButtonPersonalAccount;

    public EnterInPersonalAccount clickEnterButtonOnHomePage() {
        this.HomePageEnterButtonPersonalAccount.click();
        return this;
    }

    public EnterInPersonalAccount clickEmailBox() {
        this.EmailBoxEnterInPersonalAccount.click();
        return this;
    }

    public EnterInPersonalAccount setEmail(String Email) {
        this.EmailBoxEnterInPersonalAccount.sendKeys(Email);
        return this;
    }

    public EnterInPersonalAccount clickPasswordBox() {
        this.PasswordBoxEnterInPersonalAccount.click();
        return this;
    }

    public EnterInPersonalAccount setPassword(String Password) {
        this.PasswordBoxEnterInPersonalAccount.sendKeys(Password);
        return this;
    }

    public EnterInPersonalAccount clickEnterButton() {
        this.EnterButtonForEnterInPersonalAccount.click();
        return this;
    }

      public boolean isEnterButtonPersonalAccountDisplayed() {
        return this.HomePageEnterButtonPersonalAccount.isDisplayed();
    }

    public EnterInPersonalAccount clickPersonalAccountButton() {
        this.HomePagePersonalAccountButton.click();
        return this;
    }

    public EnterInPersonalAccount clickSingUpButton() {
        this.SingUpButtonOnEnterPageOfPersonalAccount.click();
        return this;
    }

    public EnterInPersonalAccount clickSingUpPageEnterButtonPersonalAccount() {
        this.SingUpPageEnterButtonPersonalAccount.click();
        return this;
    }

    public EnterInPersonalAccount clickRecoveryPasswordPageEnterButtonPersonalAccount() {
        this.RecoveryPasswordPageEnterButtonPersonalAccount.click();
        return this;
    }

    public EnterInPersonalAccount clickRestorePasswordButtonOnEnterPageOfPersonalAccount() {
        this.RestorePasswordButtonOnEnterPageOfPersonalAccount.click();
        return this;
    }
}
