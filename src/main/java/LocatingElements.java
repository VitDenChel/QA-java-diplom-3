import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LocatingElements {

    //  Кнопка "Личный кабинет"
    @FindBy(how = How.XPATH, using = ".//p[text()='Личный Кабинет']")
    public SelenideElement HomePagePersonalAccountButton;

    // Регистрация
    @FindBy(how = How.XPATH, using = ".//a[text()='Зарегистрироваться']")
    public SelenideElement HomePageSingUp;

    // поле “Имя”
    @FindBy(how = How.XPATH, using = ".//input[@name ='name']")
    public SelenideElement SingUpName;

    // поле “Email”
    @FindBy(how = How.XPATH, using = ".//label[@class='input__placeholder text noselect text_type_main-default input__placeholder-focused']")
    public SelenideElement SingUpEmail;

    // поле “Пароль”
    @FindBy(how = How.XPATH, using = ".//input[@name ='Пароль']")
    public SelenideElement SingUpPassword;

    // Кнопка “Зарегистрироваться”
    @FindBy(how = How.XPATH, using = "//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']")
    public SelenideElement SingUpButton;

    // Кнопка "Войти в аккаунт"
    @FindBy(how = How.XPATH, using = "//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg']")
    public SelenideElement HomePageEnterButtonPersonalAccount;

    // Кнопка "Войти" в форме регистрации
    @FindBy(how = How.XPATH, using = ".//a[text()='Войти']")
    public SelenideElement SingUpPageEnterButtonPersonalAccount;

    // Кнопка "Войти" в форме восстановления пароля
    @FindBy(how = How.XPATH, using = ".//a[@class='Auth_link__1fOlj'][text() = 'Войти']")
    public SelenideElement RecoveryPasswordPageEnterButtonPersonalAccount;

    // Кнопка "Конструктор" в личном кабинете
    @FindBy(how = How.XPATH, using = ".//a[@class='AppHeader_header__link__3D_hX']")
    public SelenideElement PersonalAccountPageConstructorButton;

    // Логотип “Stellar Burgers”
    @FindBy(how = How.XPATH, using = "//div[@class='AppHeader_header__logo__2D0X2']")
    public SelenideElement PersonalAccountPageLogotypeStellarBurgers;

    // Кнопка "Выход" в личном кабинете
    @FindBy(how = How.XPATH, using = "//button[@class='Account_button__14Yp3 text text_type_main-medium text_color_inactive']")
    public SelenideElement PersonalAccountPageExitButton;

    // Раздел "Булки"
    @FindBy(how = How.XPATH, using = ".//span[text()='Булки']")
    public SelenideElement HomePageBunsSection;

    // Раздел "Соусы"
    @FindBy(how = How.XPATH, using = ".//span[text()='Соусы']")
    public SelenideElement HomePageSauceSection;

    // Раздел "Начинки"
    @FindBy(how = How.XPATH, using = ".//span[text()='Начинки']")
    public SelenideElement HomePageFillingSection;

    // Поле "Email" на странице входа в аккаунт
    @FindBy(how = How.XPATH, using = "//input[@class='text input__textfield text_type_main-default']")
    public SelenideElement EmailBoxEnterInPersonalAccount;

    // Поле "Пароль" на странице входа в аккаунт
    @FindBy(how = How.XPATH, using = ".//input[@name ='Пароль']")
    public SelenideElement PasswordBoxEnterInPersonalAccount;

    // Кнопка "Войти" на странице входа в аккаунт
    @FindBy(how = How.XPATH, using = "//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']")
    public SelenideElement EnterButtonForEnterInPersonalAccount;

    // Кнопка "Оформить заказ" на главной странице
    @FindBy(how = How.XPATH, using = "//button[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg'][text() = 'Оформить заказ']")
    public SelenideElement CreateOrderButtonInHomePage;

    // Поле "идентификатор заказа" на главной странице
    @FindBy(how = How.XPATH, using = ".//p[text()='идентификатор заказа']")
    public SelenideElement IdentifierOrderInHomePage;

    // Кнопка “Зарегистрироваться” на странице входа в личный кабинет
    @FindBy(how = How.XPATH, using = ".//a[text()='Зарегистрироваться']")
    public SelenideElement SingUpButtonOnEnterPageOfPersonalAccount;

    // Кнопка “Востановить пароль” на странице входа в личный кабинет
    @FindBy(how = How.XPATH, using = ".//a[@class='Auth_link__1fOlj'][text() = 'Восстановить пароль']")
    public SelenideElement RestorePasswordButtonOnEnterPageOfPersonalAccount;

    // Вкладка “Булки” выбрана
    @FindBy(how = How.XPATH, using = "//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[@class='text text_type_main-default'][text() = 'Булки']")
    public SelenideElement HomePageBunsSectionSelected;

    // Вкладка “Соусы” выбрана
    @FindBy(how = How.XPATH, using = "//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[@class='text text_type_main-default'][text() = 'Соусы']")
    public SelenideElement HomePageSaucesSectionSelected;

    // Вкладка “Начинки” выбрана
    @FindBy(how = How.XPATH, using = "//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[@class='text text_type_main-default'][text() = 'Начинки']")
    public SelenideElement HomePageFillingSectionSelected;
}




