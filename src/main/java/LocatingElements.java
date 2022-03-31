import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LocatingElements {

    //  Кнопка "Личный кабинет"
    @FindBy(how = How.XPATH, using = ".//p[text()='Личный Кабинет']")
    public SelenideElement homePagePersonalAccountButton;

    // Регистрация
    @FindBy(how = How.XPATH, using = ".//a[text()='Зарегистрироваться']")
    public SelenideElement homePageSingUp;

    // поле “Имя”
    @FindBy(how = How.XPATH, using = ".//input[@name ='name']")
    public SelenideElement singUpName;

    // поле “Email”
    @FindBy(how = How.XPATH, using = ".//label[@class='input__placeholder text noselect text_type_main-default input__placeholder-focused']")
    public SelenideElement singUpEmail;

    // поле “Пароль”
    @FindBy(how = How.XPATH, using = ".//input[@name ='Пароль']")
    public SelenideElement singUpPassword;

    // Кнопка “Зарегистрироваться”
    @FindBy(how = How.XPATH, using = "//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']")
    public SelenideElement singUpButton;

    // Кнопка "Войти в аккаунт"
    @FindBy(how = How.CSS, using = "[class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg']")
    public SelenideElement homePageEnterButtonPersonalAccount;

    // Кнопка "Войти" в форме регистрации
    @FindBy(how = How.XPATH, using = ".//a[text()='Войти']")
    public SelenideElement singUpPageEnterButtonPersonalAccount;

    // Кнопка "Войти" в форме восстановления пароля
    @FindBy(how = How.XPATH, using = ".//a[text() = 'Войти']")
    public SelenideElement recoveryPasswordPageEnterButtonPersonalAccount;

    // Кнопка "Конструктор" в личном кабинете
    @FindBy(how = How.XPATH, using = ".//p[text()='Конструктор']")
    public SelenideElement personalAccountPageConstructorButton;

    // Логотип “Stellar Burgers”
    @FindBy(how = How.XPATH, using = "//div[@class='AppHeader_header__logo__2D0X2']")
    public SelenideElement personalAccountPageLogotypeStellarBurgers;

    // Кнопка "Выход" в личном кабинете
    @FindBy(how = How.CSS, using = "button[type=button]")
    public SelenideElement personalAccountPageExitButton;

    // Раздел "Булки"
    @FindBy(how = How.XPATH, using = ".//span[text()='Булки']")
    public SelenideElement homePageBunsSection;

    // Раздел "Соусы"
    @FindBy(how = How.XPATH, using = ".//span[text()='Соусы']")
    public SelenideElement homePageSauceSection;

    // Раздел "Начинки"
    @FindBy(how = How.XPATH, using = ".//span[text()='Начинки']")
    public SelenideElement homePageFillingSection;

    // Поле "Email" на странице входа в аккаунт
    @FindBy(how = How.CSS, using = "input[type=text]")
    public SelenideElement emailBoxEnterInPersonalAccount;

    // Поле "Пароль" на странице входа в аккаунт
    @FindBy(how = How.CSS, using = "input[type=password]")
    public SelenideElement passwordBoxEnterInPersonalAccount;

    // Кнопка "Войти" на странице входа в аккаунт
    @FindBy(how = How.CSS, using = "[class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']")
    public SelenideElement enterButtonForEnterInPersonalAccount;

    // Кнопка "Оформить заказ" на главной странице
    @FindBy(how = How.XPATH, using = "//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg'][text() = 'Оформить заказ']")
    public SelenideElement createOrderButtonInHomePage;

    // Поле "идентификатор заказа" на главной странице
    @FindBy(how = How.XPATH, using = ".//p[text()='идентификатор заказа']")
    public SelenideElement identifierOrderInHomePage;

    // Кнопка “Зарегистрироваться” на странице входа в личный кабинет
    @FindBy(how = How.CSS, using = "[class = Auth_link__1fOlj]")
    public SelenideElement singUpButtonOnEnterPageOfPersonalAccount;

    // Кнопка “Востановить пароль” на странице входа в личный кабинет
    @FindBy(how = How.XPATH, using = ".//a[text() = 'Восстановить пароль']")
    public SelenideElement restorePasswordButtonOnEnterPageOfPersonalAccount;

    // Вкладка “Булки” выбрана
    @FindBy(how = How.XPATH, using = "//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[@class='text text_type_main-default'][text() = 'Булки']")
    public SelenideElement homePageBunsSectionSelected;

    // Вкладка “Соусы” выбрана
    @FindBy(how = How.XPATH, using = "//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[@class='text text_type_main-default'][text() = 'Соусы']")
    public SelenideElement homePageSaucesSectionSelected;

    // Вкладка “Начинки” выбрана
    @FindBy(how = How.XPATH, using = "//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[@class='text text_type_main-default'][text() = 'Начинки']")
    public SelenideElement homePageFillingSectionSelected;
}




