import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class ConstructorSectionTest {
    @Test
    public void CheckLinkToBunsSectionTest() throws InterruptedException {
        boolean isHomePageBunsSectionSelectedDisplayed = open(ConstractorSection.URL, ConstractorSection.class)
                .isHomePageBunsSectionSelectedDisplayed();

        Assert.assertTrue("Enter button is not appeared", isHomePageBunsSectionSelectedDisplayed);
    }

    @Test
    public void CheckLinkToSauceSectionTest() throws InterruptedException {
        boolean isHomePageSauceSectionSelectedDisplayed = open(ConstractorSection.URL, ConstractorSection.class)
                .clickHomePageSauceSection()
                .isHomePageSauceSectionSelectedDisplayed();

        Assert.assertTrue("Enter button is not appeared", isHomePageSauceSectionSelectedDisplayed);
    }

    @Test
    public void CheckLinkToFillingSectionTest() throws InterruptedException {
        boolean isHomePageFillingSectionSelectedDisplayed = open(ConstractorSection.URL, ConstractorSection.class)
                .clickHomePageFillingSection()
                .isHomePageFillingSectionSelectedDisplayed();

        Assert.assertTrue("Enter button is not appeared", isHomePageFillingSectionSelectedDisplayed);
    }
}
