package stepTest;
import Commons.SetupHelp;
import DataFile.PropertiesFile;
import org.testng.annotations.*;
public class TestUIpage extends SetupHelp {
    @Test(priority = 1)
    public void navigate_to_page() throws Throwable {
        PropertiesFile.setPropertiesFile();
        openURL(PropertiesFile.getPropValue("browser"), PropertiesFile.getPropValue("urlprd"));
        clickElement("class","LDbtnloginClass");
        inputText("id","LGemailID",PropertiesFile.getPropValue("LGemaildata"));
        inputText("id","LGpassID","Password123");
        clickElement("css","LGbtnsubmitcss");
        Thread.sleep(5000);
    }
    @Test(priority = 2)
    public void UI_in_page() throws Throwable {
        //Thread.sleep(5000);
        verifyElementText("css", "HCnodataTitlecss", "まずは健診データを\n" +
                "登録しましょう。");
        verifyElementText("css", "HCnodataUIbtnOCRcss", "撮って入力");
        verifyElementText("css", "HCnodataUIbtnManualcss", "手入力");
        verifyElementText("css", "HCnodataUIcontentcss", "健康診断結果表をご用意いただき\n" +
                "スマートフォンのカメラで撮影するか、\n" +
                "数値を手入力してください。\n" +
                "\n" +
                "入力された健診データをグラフ化し、\n" +
                "ママが判定＆改善のアドバイス！");
        //verifyElementText("css", "SUbtnsubmitcss", "登録する");
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
//        Thread.sleep(5000);
//        System.out.println(driver.findElement(By.cssSelector(".title")).getText());
//        System.out.println(driver.findElement(By.cssSelector("a[id='input-ocr-button'] div[class='action_content']")).getText());
//        System.out.println(driver.findElement(By.cssSelector("div[name='phone']")).getText());
//        System.out.println(driver.findElement(By.cssSelector(".text_content")).getText());
       // System.out.println(driver.findElement(By.cssSelector(".button-wraper")).getText());
    }
    @Test(priority = 5)
    public void check_validation() throws Throwable {

    }
    @Test(priority = 6)
    public void QUIT() throws Throwable {
        Thread.sleep(2000);
        Quit();
    }
}