package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageMsavheniWeb {
    WebDriver driver;

    public PageMsavheniWeb(WebDriver webDrivers){
        driver = webDrivers;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html/body/header/div/div[2]/nav/button/span")
    private WebElement humBurger;

    @FindBy(xpath = "//*[@id=\"menu-105\"]/li[3]/a")
    private WebElement about;

//    @FindBy(xpath = "/html/body/section[6]/div/div/div[3]/div[2]/a[1]")
//    private WebElement facebook;

//    @FindBy(xpath = "/html/body/section[6]/div/div/div[3]/div[2]/a[2]")
//    private WebElement instagram;

//    @FindBy(xpath = "/html/body/section[6]/div/div/div[3]/div[2]/a[3]")
//    private WebElement twitter;

    @FindBy(xpath = "//*[@id=\"menu-105\"]/li[4]/a")
    private WebElement services;

    @FindBy(xpath = "//*[@id=\"accordion-button-132\"]/span[2]")
    private WebElement masterPlanning;

    @FindBy(xpath = "//*[@id=\"accordion-button-132\"]/span[2]")
    private WebElement closeMasterPlanning;

    @FindBy(xpath = "//*[@id=\"menu-105\"]/li[5]/a")
    private WebElement work;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/article[1]/div/div[2]/div/a/div[3]")
    private WebElement workExplore;

    @FindBy(xpath = "//*[@id=\"menu-105\"]/li[6]/a")
    private WebElement contactTap;

    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement fullName;

    @FindBy(xpath = "//*[@id=\"rsogjh\"]")
    private WebElement subject;

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement email;

    @FindBy(xpath = "//*[@id=\"czvcll\"]")
    private WebElement phoneNumber;

    @FindBy(xpath = "//*[@id=\"mezijy\"]")
    private WebElement massage;

    @FindBy(xpath = "//*[@id=\"contact-form102\"]/div[6]/button")
    private WebElement sendBtn;





    public void humBurgerBtn(){
        humBurger.click();
    }

    public void selectAbout(){
        about.click();
    }

//    public void facebookIcon(){
//        facebook.click();
//    }

//    public void instagramIcon(){
//        instagram.click();
//    }

//    public void twitterIcon(){
//        twitter.click();
//    }
//
    public void selectServices(){
        services.click();
    }

    public void masterPlanningDropDown(){
        masterPlanning.click();
    }

    public void masterPlanningClose(){
        closeMasterPlanning.click();
    }

    public void selectWorkTap(){
        work.click();
    }

    public void clickWorkExplore(){
        workExplore.click();
    }

    public void selectContact(){
        contactTap.click();
    }

    public void enterFullName(){
        fullName.sendKeys("Quality Assurance");
    }

    public void enterSubject(){
        subject.sendKeys("Tester");
    }

    public void enterEmail(){
        email.sendKeys("qualitytest@gmail.com");
    }

    public void enterPhoneNumber(){
        phoneNumber.sendKeys("0712345678");
    }

    public void typeMassage(){
        massage.sendKeys("You are the Best Landscape organisation ever in the industry");
    }

    public void clickSendBtn(){
        sendBtn.click();
    }
}