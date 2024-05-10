import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import page_object.PageMsavheniWeb;

public class About {
    @Test
    public void msavheniScript() throws InterruptedException {
        WebDriver driver = WebDriverManager.chromedriver().create();

        driver.get("https://msavheni.co.za/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        PageMsavheniWeb testWeb = new PageMsavheniWeb(driver);

        testWeb.humBurgerBtn();
        Thread.sleep(2000);

        testWeb.selectAbout();
        Thread.sleep(2000);
    }
}
