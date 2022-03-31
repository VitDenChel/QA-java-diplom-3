import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EnterInPersonalAccount {
    public static final String URL = "https://stellarburgers.nomoreparties.site/";

    @FindBy(how = How.CSS, using = "[class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg']")
    public SelenideElement homePageEnterButtonPersonalAccount;

    @FindBy(how = How.CSS, using = "input[type=text]")
    public SelenideElement emailBoxEnterInPersonalAccount;


    @FindBy(how = How.CSS, using = "input[type=password]")
    public SelenideElement passwordBoxEnterInPersonalAccount;


    @FindBy(how = How.XPATH, using = "//button[text()='Войти']")
    public SelenideElement enterButtonForEnterInPersonalAccount;

      @FindBy(how = How.XPATH, using = ".//p[text()='Личный Кабинет']")
    public SelenideElement homePagePersonalAccountButton;

    @FindBy(how = How.CSS, using = "[class = Auth_link__1fOlj]")
    public SelenideElement singUpButtonOnEnterPageOfPersonalAccount;

    @FindBy(how = How.XPATH, using = ".//a[text()='Войти']")
    public SelenideElement singUpPageEnterButtonPersonalAccount;

    @FindBy(how = How.XPATH, using = ".//a[text() = 'Восстановить пароль']")
    public SelenideElement restorePasswordButtonOnEnterPageOfPersonalAccount;

    @FindBy(how = How.XPATH, using = ".//a[text() = 'Войти']")
    public SelenideElement recoveryPasswordPageEnterButtonPersonalAccount;

    public EnterInPersonalAccount clickEnterButtonOnHomePage() {
        this.homePageEnterButtonPersonalAccount.click();
        return this;
    }

    public EnterInPersonalAccount clickEmailBox() {
        this.emailBoxEnterInPersonalAccount.click();
        return this;
    }

    public EnterInPersonalAccount clearEmailBox() {
        this.emailBoxEnterInPersonalAccount.clear();
        return this;
    }

    public EnterInPersonalAccount setEmail(String Email) {
        this.emailBoxEnterInPersonalAccount.sendKeys(Email);
        return this;
    }

    public EnterInPersonalAccount clickPasswordBox() {
        this.passwordBoxEnterInPersonalAccount.click();
        return this;
    }

    public EnterInPersonalAccount clearPasswordBox() {
        this.passwordBoxEnterInPersonalAccount.clear();
        return this;
    }
    public EnterInPersonalAccount setPassword(String Password) {
        this.passwordBoxEnterInPersonalAccount.sendKeys(Password);
        return this;
    }

    public EnterInPersonalAccount clickEnterButton() {
        this.enterButtonForEnterInPersonalAccount.click();
        return this;
    }

      public boolean isEnterButtonPersonalAccountDisplayed() {
        return this.homePageEnterButtonPersonalAccount.isDisplayed();
    }

    public EnterInPersonalAccount clickPersonalAccountButton() {
        this.homePagePersonalAccountButton.click();
        return this;
    }

    public EnterInPersonalAccount clickSingUpButton() {
        this.singUpButtonOnEnterPageOfPersonalAccount.click();
        return this;
    }

    public EnterInPersonalAccount clickSingUpPageEnterButtonPersonalAccount() {
        this.singUpPageEnterButtonPersonalAccount.click();
        return this;
    }

    public EnterInPersonalAccount clickRecoveryPasswordPageEnterButtonPersonalAccount() {
        this.recoveryPasswordPageEnterButtonPersonalAccount.click();
        return this;
    }

    public EnterInPersonalAccount clickRestorePasswordButtonOnEnterPageOfPersonalAccount() {
        this.restorePasswordButtonOnEnterPageOfPersonalAccount.click();
        return this;
    }
}
