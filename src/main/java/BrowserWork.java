import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrowserWork {

    @FindBy (id="topLoginLink")
    static WebElement myProfile;

    @FindBy (id="userEmail")
    static WebElement userEmail;

    @FindBy (id="userPass")
    static WebElement userPass;

    @FindBy (id="se_userLogin")
    static WebElement signInButton;

    @FindBy (id="postNewAdLink")
    static WebElement addNewAdButton;

    @FindBy (id="add-title")
    static WebElement addAdTitle;

    @FindBy (id="catgory-breadcrumb-text")
    static WebElement addAdGroup;


    @FindBy (id="cat-37")
    static WebElement electronicaGroup;

    public static void signInMethod(String email, String password) throws InterruptedException {

        // make a method for this
        myProfile.click();
        WebDriverHelper.waitForPage();
        //

        fillData(userEmail, email);
        fillData(userPass, password);
        WebDriverHelper.waitForPage();
        signInButton.click();
    }

    public static void fillData(WebElement element, String text) {
        //element.click();
        element.clear();
        element.sendKeys(text);
    }

    public static void createNewAdd(String title) throws InterruptedException {
        addNewAdButton.click();
        WebDriverHelper.waitForPage();
        fillData(addAdTitle, title);
        addAdGroup.click();
        WebDriverHelper.waitForPage();
        electronicaGroup.click();

    }
}
