import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class EnterInPersonalAccountTest {

    @Test
    public void enterInPersonalAccountUsingEnterButtonTest() {

        final String givenEmail = "vvhgjsilan@yandex.ru";
        final String givenPassword = "OuNuVzmAzZ";

        boolean isEnterButtonPersonalAccountDisplayed = open(EnterInPersonalAccount.URL, EnterInPersonalAccount.class)
                .clickEnterButtonOnHomePage()
                .clickEmailBox()
                .clearEmailBox()
                .setEmail(givenEmail)
                .clickPasswordBox()
                .clearPasswordBox()
                .setPassword(givenPassword)
                .clickEnterButton()
                .isEnterButtonPersonalAccountDisplayed();

        Assert.assertFalse("Enter button is appeared", isEnterButtonPersonalAccountDisplayed);
    }

    @Test
    public void enterInPersonalAccountUsingPersonalAccountButtonTest() {

        final String givenEmail = "vvhgjsilan@yandex.ru";
        final String givenPassword = "OuNuVzmAzZ";

        boolean isEnterButtonPersonalAccountDisplayed = open(EnterInPersonalAccount.URL, EnterInPersonalAccount.class)
                .clickPersonalAccountButton()
                .clickEmailBox()
                .clearEmailBox()
                .setEmail(givenEmail)
                .clickPasswordBox()
                .clearPasswordBox()
                .setPassword(givenPassword)
                .clickEnterButton()
                .isEnterButtonPersonalAccountDisplayed();

        Assert.assertFalse("Enter button is appeared", isEnterButtonPersonalAccountDisplayed);
    }

    @Test
    public void enterInPersonalAccountUsingRegistrationFormTest() {

        final String givenEmail = "vvhgjsilan@yandex.ru";
        final String givenPassword = "OuNuVzmAzZ";

        boolean isEnterButtonPersonalAccountDisplayed = open(EnterInPersonalAccount.URL, EnterInPersonalAccount.class)
                .clickEnterButtonOnHomePage()
                .clickSingUpButton()
                .clickSingUpPageEnterButtonPersonalAccount()
                .clickEmailBox()
                .clearEmailBox()
                .setEmail(givenEmail)
                .clickPasswordBox()
                .clearPasswordBox()
                .setPassword(givenPassword)
                .clickEnterButton()
                .isEnterButtonPersonalAccountDisplayed();

        Assert.assertFalse("Enter button is appeared", isEnterButtonPersonalAccountDisplayed);
    }

    @Test
    public void enterInPersonalAccountUsingRecoveryPasswordFormTest() {

        final String givenEmail = "vvhgjsilan@yandex.ru";
        final String givenPassword = "OuNuVzmAzZ";

        boolean isEnterButtonPersonalAccountDisplayed = open(EnterInPersonalAccount.URL, EnterInPersonalAccount.class)
                .clickEnterButtonOnHomePage()
                .clickRestorePasswordButtonOnEnterPageOfPersonalAccount()
                .clickRecoveryPasswordPageEnterButtonPersonalAccount()
                .clickEmailBox()
                .clearEmailBox()
                .setEmail(givenEmail)
                .clickPasswordBox()
                .clearPasswordBox()
                .setPassword(givenPassword)
                .clickEnterButton()
                .isEnterButtonPersonalAccountDisplayed();

        Assert.assertFalse("Enter button is appeared", isEnterButtonPersonalAccountDisplayed);
    }
}
