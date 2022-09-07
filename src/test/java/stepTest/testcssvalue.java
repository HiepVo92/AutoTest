package stepTest;
import Commons.SetupHelp;
import DataFile.PropertiesFile;
import org.testng.annotations.*;
public class testcssvalue extends SetupHelp {

        @Test(priority = 1)
        public void navigate_to_forgot_page() throws Throwable {
            PropertiesFile.setPropertiesFile();
            openURL(PropertiesFile.getPropValue("browser"), PropertiesFile.getPropValue("urldev"));
            clickElement("class", PropertiesFile.getPropValue("LDbtnloginClass"));

        }

        @Test(priority = 2)
        public void click_forgot_button_in_login_page() throws Throwable {
            //clickElement("xpath", PropertiesFile.getPropValue("LGbtnforgotX"));
        }

        @Test(priority = 3)
        public void login_page_successfully() throws Throwable {
            //Thread.sleep(2000);
            //checkdisp("class", PropertiesFile.getPropValue("FGUIClass"));
        }
    @Test(priority = 4)
    public void inputtext4() throws Throwable {
        //    Thread.sleep(2000);
        //System.out.println(driver.findElement(By.xpath("//label[contains(text(),'パスワード')]")).getAttribute("placeholder"));
        // System.out.println(driver.findElement(By.xpath("//label[contains(text(),'パスワード')]")).getText());
//        String script = "return window.getComputedStyle(document.querySelector('.label-input'),':after').getPropertyValue('content')";
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        String content = (String) js.executeScript(script);
        //System.out.println(driver.findElement(By.xpath("//label[contains(text(),'パスワード')]")).getText()+content.substring(1,4));
        verifyLabeltextbox("xpath","//label[contains(text(),'パスワード')]","パスワードを入力");


        //inputText("id", PropertiesFile.getPropValue("FGemailid"), "hiepdev1.2@mailsac.com");
//        clickElement("xpath", PropertiesFile.getPropValue("FGbtnsubmitX"));
//        Thread.sleep(1000);
//        System.out.println(driver.findElement(By.id(PropertiesFile.getPropValue("FGemailerrorID"))).getText());
//        Thread.sleep(2000);
//        driver.findElement(By.id(PropertiesFile.getPropValue("FGemailid"))).clear();
//        Thread.sleep(1000);
//        System.out.println(driver.findElement(By.id(PropertiesFile.getPropValue("FGemailerrorID"))).getText());
//
//        inputText("id", PropertiesFile.getPropValue("FGemailid"), PropertiesFile.getPropValue("FGemaildata"));
//        clickElement("id", PropertiesFile.getPropValue("FGbtnsubmitID"));

    }
    @Test(priority = 5)
    public void confirm_code_page ()throws Throwable{
//        System.out.println(driver.findElement(By.className("head-text-wraper")).getText());
//        verifyElementText("class","head-text-wraper","パスワード再設定");
    }
        @AfterTest
    public void quit () throws Throwable {
            //Thread.sleep(3000);
            Quit();
        }



    }

