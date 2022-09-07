package stepTest;
import Commons.SetupHelp;
import DataFile.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
public class TestUIpage extends SetupHelp {
    @Test(priority = 1)
    public void navigate_to_page() throws Throwable {
        PropertiesFile.setPropertiesFile();
        openURL(PropertiesFile.getPropValue("browser"), PropertiesFile.getPropValue("urlstg"));
        clickElement("class","LDbtnregisterClass");

//        Thread.sleep(1000);
//        //check select box not check
//        selectboxnotcheck("xpath","CCcheckbox1X");
//        selectboxnotcheck("xpath","CCcheckbox2X");
//        Thread.sleep(1000);
//        //click check box
//        clickElement("xpath","CCcheckbox1X");
//        clickElement("xpath","CCcheckbox2X");
//        Thread.sleep(1000);
//        //check select box check
//        selectboxcheck("xpath", "CCcheckbox1X");
//        selectboxcheck("xpath", "CCcheckbox2X");
//        clickElement("xpath","CCcheckbox1X");
//        clickElement("xpath","CCcheckbox2X");
//        Thread.sleep(2000);
//        checkbtnenable("css","CCbtnsubmitcss");
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("#check-code-btn")).click();
//        clickElement("css","CCbtnsubmitcss");
//        clickElement("css","CPbtnsubmitcss");
//        clickElement("css","TOUbtnsubmitcss");
    }
    @Test(priority = 2)
    public void UI_in_page() throws Throwable {
   //     Thread.sleep(3000);
//        verifyElementText("css", "SUUIbtnbackcss", "戻る");
//        verifyElementText("css", "SUUIheadercss", "カロママIDの登録");
//        verifyElementText("css", "SUUItitlecss", "ログインする時に使うカロママID（メールアドレス）とパスワードを設定してください");
//        verifyElementText("css", "SUUItextcss", "8文字以上でかつ英大文字、英小文字、数字を含む");
//        verifyElementText("css", "SUbtnsubmitcss", "登録する");
//        verifyPlaceHolderAttribute("xpath", "SUplaceholderemailX", "placeholder", "username@calomama.com");
//        verifyPlaceHolderAttribute("xpath", "SUplaceholderpassX", "placeholder", "パスワードを入力");
//        verifyLabeltextbox("xpath", "SUlabelemailX", "メールアドレスを入力");
//        verifyLabeltextbox("css", "SUlabelpasscss", "パスワードを入力");
    }
    @Test (priority = 3)
    public void submit_button_en_dis() throws Throwable {
//        checkbtndisable("css","SUbtnsubmitcss");
//        inputText("xpath","SUemailX","text123");
//        checkbtndisable("css","SUbtnsubmitcss");
//        inputText("xpath","SUpassX","Passs");
//        clickElement("xpath","SUtoggleX");
//        checkbtnenable("css","SUbtnsubmitcss");
//        clearText("xpath","SUemailX");
//        clearText("xpath","SUpassX");
//        Thread.sleep(2000);
        //checkbtndisable("css","SUbtnsubmitcss");
    }
    @Test(priority = 4)
    public void  get_text_in_page() throws Throwable {
   //     Thread.sleep(2000);
//        System.out.println(driver.findElement(By.cssSelector(".back-text")).getText());
//        System.out.println(driver.findElement(By.cssSelector(".head-text.pc-font-size-13em.bold-arial")).getText());
//        System.out.println(driver.findElement(By.cssSelector(".small-text")).getText());
//        System.out.println(driver.findElement(By.cssSelector(".info-text.light-text")).getText());
//        System.out.println(driver.findElement(By.cssSelector(".button-wraper")).getText());
    }
    @Test(priority = 5)
    public void check_validation() throws Throwable {

    }
    @Test(priority = 6)
    public void QUIT() throws Throwable {

        //Quit();
    }
}