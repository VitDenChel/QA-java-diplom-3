import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class WorkWithPersonalAccountTest {

    @Test
    public void CheckLinkByClickingOnPersonalAccountTest() {
        boolean isEnterButtonForEnterInPersonalAccountDisplayed = open(WorkWithPersonalAccount.URL, WorkWithPersonalAccount.class)
                .clickHomePagePersonalAccountButton()
                .isEnterButtonForEnterInPersonalAccountDisplayed();

        Assert.assertTrue("Enter button is not appeared", isEnterButtonForEnterInPersonalAccountDisplayed);
    }

    @Test
    public void CheckLinkByClickingOnConstructorButtonFromPersonalAccountTest() {
        boolean isHomePageBunsButtonDisplayed = open(WorkWithPersonalAccount.URL, WorkWithPersonalAccount.class)
                .clickHomePagePersonalAccountButton()
                .clickPersonalAccountPageConstructorButton()
                .isHomePageBunsButtonDisplayed();

        Assert.assertTrue("Buns button is not appeared", isHomePageBunsButtonDisplayed);
    }

    @Test
    public void CheckLinkByClickingOnLogotypeStellarBurgersFromPersonalAccountTest() {
        boolean isHomePageBunsButtonDisplayed = open(WorkWithPersonalAccount.URL, WorkWithPersonalAccount.class)
                .clickHomePagePersonalAccountButton()
                .clickPersonalAccountPageLogotypeStellarBurgers()
                .isHomePageBunsButtonDisplayed();

        Assert.assertTrue("Buns button is not appeared", isHomePageBunsButtonDisplayed);
    }

    @Test
    public void ExitFromPersonalAccountTest() {

        final String givenEmail = "vvhgjsilan@yandex.ru";
        final String givenPassword = "OuNuVzmAzZ";

        boolean isEnterButtonForEnterInPersonalAccountDisplayed = open(WorkWithPersonalAccount.URL, WorkWithPersonalAccount.class)
                .clickHomePagePersonalAccountButton()
                .clickEmailBoxEnterInPersonalAccount()
                .setEmail(givenEmail)
                .clickPasswordBoxEnterInPersonalAccount()
                .setPassword(givenPassword)
                .clickEnterButtonForEnterInPersonalAccount()
                .clickHomePagePersonalAccountButton()
                .clickPersonalAccountPageExitButton()
                .isEnterButtonForEnterInPersonalAccountDisplayed();

        Assert.assertTrue("Enter button is not appeared", isEnterButtonForEnterInPersonalAccountDisplayed);
    }
}
