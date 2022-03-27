import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class EnterInPersonalAccountTest {
    @Test
    public void EnterInPersonalAccountTest() {

        final String givenEmail = "vvhgjsilan@yandex.ru";
        final String givenPassword = "OuNuVzmAzZ";

        EnterInPersonalAccount enterInPersonalAccount = open(EnterInPersonalAccount.URL, EnterInPersonalAccount.class)
                .clickEnterButtonOnHomePage()
                .clickEmailBox()
                .setEmail(givenEmail)
                .clickPasswordBox()
                .setPassword(givenPassword)
                .clickEnterButton();

        boolean isEnterButtonPersonalAccountDisplayed = page(EnterInPersonalAccount.class)
                .isEnterButtonPersonalAccountDisplayed();
        Assert.assertFalse("Enter button is appeared", isEnterButtonPersonalAccountDisplayed);
    }

    @Test
    public void EnterInPersonalAccountUsingPersonalAccountButtonTest() {

        final String givenEmail = "vvhgjsilan@yandex.ru";
        final String givenPassword = "OuNuVzmAzZ";

        EnterInPersonalAccount enterInPersonalAccount = open(EnterInPersonalAccount.URL, EnterInPersonalAccount.class)
                .clickPersonalAccountButton()
                .clickEmailBox()
                .setEmail(givenEmail)
                .clickPasswordBox()
                .setPassword(givenPassword)
                .clickEnterButton();

        boolean isEnterButtonPersonalAccountDisplayed = page(EnterInPersonalAccount.class)
                .isEnterButtonPersonalAccountDisplayed();
        Assert.assertFalse("Enter button is appeared", isEnterButtonPersonalAccountDisplayed);
    }

    @Test
    public void EnterInPersonalAccountUsingRegistrationFormTest() {

        final String givenEmail = "vvhgjsilan@yandex.ru";
        final String givenPassword = "OuNuVzmAzZ";

        EnterInPersonalAccount enterInPersonalAccount = open(EnterInPersonalAccount.URL, EnterInPersonalAccount.class)
                .clickEnterButtonOnHomePage()
                .clickSingUpButton()
                .clickSingUpPageEnterButtonPersonalAccount()
                .clickEmailBox()
                .setEmail(givenEmail)
                .clickPasswordBox()
                .setPassword(givenPassword)
                .clickEnterButton();

        boolean isEnterButtonPersonalAccountDisplayed = page(EnterInPersonalAccount.class)
                .isEnterButtonPersonalAccountDisplayed();
        Assert.assertFalse("Enter button is appeared", isEnterButtonPersonalAccountDisplayed);
    }

    @Test
    public void EnterInPersonalAccountUsingRecoveryPasswordFormTest() {

        final String givenEmail = "vvhgjsilan@yandex.ru";
        final String givenPassword = "OuNuVzmAzZ";

        EnterInPersonalAccount enterInPersonalAccount = open(EnterInPersonalAccount.URL, EnterInPersonalAccount.class)
                .clickEnterButtonOnHomePage()
                .clickRestorePasswordButtonOnEnterPageOfPersonalAccount()
                .clickRecoveryPasswordPageEnterButtonPersonalAccount()
                .clickEmailBox()
                .setEmail(givenEmail)
                .clickPasswordBox()
                .setPassword(givenPassword)
                .clickEnterButton();

        boolean isEnterButtonPersonalAccountDisplayed = page(EnterInPersonalAccount.class)
                .isEnterButtonPersonalAccountDisplayed();
        Assert.assertFalse("Enter button is appeared", isEnterButtonPersonalAccountDisplayed);
    }
}
