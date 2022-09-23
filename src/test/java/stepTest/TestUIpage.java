package stepTest;
import Commons.SetupHelp;
import DataFile.PropertiesFile;
import org.openqa.selenium.By;

import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.*;
//import static com.gmail.api.GmailAPI.*;

public class TestUIpage extends SetupHelp {
    @Test(priority = 1)
    public void navigate_to_page() throws Throwable {
        PropertiesFile.setPropertiesFile();
        openURL(PropertiesFile.getPropValue("browser"), PropertiesFile.getPropValue("urlprd"));
        clickElement("class","LDbtnloginClass");
        inputText("id","LGemailID",PropertiesFile.getPropValue("LGemailPhoneNumber"));
        inputText("id","LGpassID","Password123");
        clickElement("css","LGbtnsubmitcss");
        Thread.sleep(5000);
    }
    @Test(priority = 2)
    public void Test2() throws Throwable {
        //Thread.sleep(4000);
//        verifyElementText("css", "TPtitlecss", "最新の健診データ");
//        verifyElementText("css", "TPcontentcss", "身体計測\n" +
//                "血圧\n" +
//                "肝機能\n" +
//                "血中脂質\n" +
//                "糖代謝\n" +
//                "腎機能\n" +
//                "貧血\n" +
//                "尿酸");
        //movetoEndPage();
//        verifyElementText("id", "TPbtnHClistID", "健診データ一覧");
//        verifyElementText("css", "SUbtnsubmitcss", "");
        //clickElement("xpath","HCiconBackmypageX");
        //Thread.sleep(2000);
        //click btn confirm
        //clickElement("id","MPbtnconfirmID");
        //click btn back in caloID
        //clickElement("css","CaLoIDbtnBackcss");
        //click add supporter
        //clickElement("xpath","MPbtnAddSupporterX");
    }
    @Test (priority = 3)
    public void Test3() throws Throwable {
//        verifyElementText("css", "MFAtitlecss", "SMSで2段階認証");
//        verifyElementText("css","MFAtextUIcss","+********6109 宛のSMSに認証コードをお送りしました");
//        verifyElementText("css", "MFAreSendCodecss", "認証コードを再送する");
//        verifyElementText("", "", "");
//        verifyPlaceHolderAttribute("","","placeholder","");
//        verifyLabeltextbox("xpath","LGemaillabelX","メールアドレスを入力");
    }
    @Test(priority = 4)
    public void  get_text_in_page() throws Throwable {
//        Thread.sleep(5000);
//        System.out.println(driver.findElement(By.cssSelector(".mfa-head-text.bold-arial")).getText());
//        System.out.println(driver.findElement(By.cssSelector("div[class='text-left'] p[class='small-text']")).getText());
//        System.out.println(driver.findElement(By.cssSelector("#input-invitation-code-7")).getAttribute("placeholder"));
//        System.out.println(driver.findElement(By.cssSelector("div[class='text-left']")).getAttribute("placeholder"));
 //       System.out.println(driver.findElement(By.cssSelector("#resend-code-link")).getText());
//        System.out.println(driver.findElement(By.cssSelector("div[class='text-left']")).getText());
        //System.out.println(driver.findElement(By.xpath("//p[contains(text(),'二段階認証')]")));
//        System.out.println(driver.findElement(By.id("button-health-check-list")).getText());
    }
    @Test(priority = 5)
    public void check_btn_invitation_code() throws Throwable {
//        Thread.sleep(5000);
        getCodeSMS();

    }
    @Test(priority = 6)
    public void QUIT() throws Throwable {
        Thread.sleep(2000);
       //Quit();
    }
}