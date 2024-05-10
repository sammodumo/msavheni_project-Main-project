import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import page_object.PageMsavheniWeb;

public class ContactInformation {
    @Test
    public void msavheniScript() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();

        driver.get("https://msavheni.co.za/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        PageMsavheniWeb testWeb = new PageMsavheniWeb(driver);

        testWeb.humBurgerBtn();
        Thread.sleep(2000);

        testWeb.selectContact();
        Thread.sleep(2000);

        testWeb.enterFullName();
        Thread.sleep(2000);

        testWeb.enterSubject();
        Thread.sleep(2000);

        testWeb.enterEmail();
        Thread.sleep(2000);

        testWeb.enterPhoneNumber();
        Thread.sleep(2000);

        testWeb.typeMassage();
        Thread.sleep(2000);

        testWeb.clickSendBtn();
        Thread.sleep(2000);

    }
}
