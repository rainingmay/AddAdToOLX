public class Main {

    private static String email = "yana.balatsko@gmail.com";
    private static String pass = "LookAt";

    public static void main(String[] args) throws InterruptedException {
        WebDriverHelper.openBrowser();
        WebDriverHelper baseUrl = new WebDriverHelper(WebDriverHelper.getDriver());
        WebDriverHelper.getDriver().get("https://www.olx.ua/");
        WebDriverHelper.waitForPage();
        BrowserWork.signInMethod(email,  pass);

    }
}
