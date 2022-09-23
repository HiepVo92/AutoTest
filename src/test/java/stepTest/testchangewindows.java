package stepTest;
import Commons.SetupHelp;
import DataFile.PropertiesFile;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class testchangewindows extends SetupHelp {
    private JavascriptExecutor jsExecutor;
    private String emailContent, confirmationCode;
    private Character Number1, Number2, Number3, Number4, Number5, Number6;

    @Test(priority = 1)
    public void navigate_to_page() throws Throwable {
        PropertiesFile.setPropertiesFile();
        openURL(PropertiesFile.getPropValue("browser"), "https://stg-cmplus-api-iss-cognito.stg-kawaru.jp/web/views/user/login");
        Thread.sleep(1000);

    }
    @Test(priority = 2)
        public void click1() throws Throwable{
//        clickElement("xpath",PropertiesFile.getPropValue("LGbtnforgotX"));
//        inputText("id", "email", "hiepstg1.1@mailsac.com");
//        clickElement("xpath","FGbtnsubmitX");
        //Thread.sleep(2000);

    }

    @Test(priority = 3)
    public void getconfirmcode() throws Throwable {
        jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.open('https://accounts.google.com/','_blank');");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        //Switch qua tab mailsac.com vừa mở
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(3000);
        driver.findElement(By.xpath( "//input[@id='identifierId']")).sendKeys("linkcom.qc.at");
        driver.findElement(By.xpath( "//span[normalize-space()='Next']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath( "//input[@name='Passwd']")).sendKeys("Linkcom@123");
        driver.findElement(By.xpath( "//span[normalize-space()='Next']")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("(//td[@class='col-xs-4'])[1]")).click();
        emailContent = driver.findElement(By.xpath("(//div[@class='ng-binding ng-scope'])[1]")).getText();
        //System.out.println(emailContent);
        Thread.sleep(2000);
        Pattern date = Pattern.compile("[0-9]{6}");
        Matcher matcher = date.matcher(emailContent);
        matcher.find();
        confirmationCode = emailContent.substring(matcher.start(), matcher.end());
        System.out.println(confirmationCode);
        PropertiesFile.setPropValue("confirmationCode",confirmationCode);
        Number1 = confirmationCode.charAt(0);
        PropertiesFile.setPropValue("RGnumber1", String.valueOf(Number1));
        Number2 = confirmationCode.charAt(1);
        PropertiesFile.setPropValue("RGnumber2", String.valueOf(Number2));
        Number3 = confirmationCode.charAt(2);
        PropertiesFile.setPropValue("RGnumber3", String.valueOf(Number3));
        Number4 = confirmationCode.charAt(3);
        PropertiesFile.setPropValue("RGnumber4", String.valueOf(Number4));
        Number5 = confirmationCode.charAt(4);
        PropertiesFile.setPropValue("RGnumber5", String.valueOf(Number5));
        Number6 = confirmationCode.charAt(5);
        PropertiesFile.setPropValue("RGnumber6", String.valueOf(Number6));
        //Switch về lại tab playground.mailslurp.com (index = 0)
        driver.switchTo().window(tabs.get(0));

        //===============




            //Điền confirmation code
//        driver.findElement(By.xpath("//input[@name='char-1']")).sendKeys(PropertiesFile.getPropValue("RGnumber1"));
//        driver.findElement(By.xpath("//input[@name='char-2']")).sendKeys(PropertiesFile.getPropValue("RGnumber2"));
//        driver.findElement(By.xpath("//input[@name='char-3']")).sendKeys(PropertiesFile.getPropValue("RGnumber3"));
//        driver.findElement(By.xpath("//input[@name='char-4']")).sendKeys(PropertiesFile.getPropValue("RGnumber4"));
//        driver.findElement(By.xpath("//input[@name='char-5']")).sendKeys(PropertiesFile.getPropValue("RGnumber5"));
//        driver.findElement(By.xpath("//input[@name='char-6']")).sendKeys(PropertiesFile.getPropValue("RGnumber6"));
//
        }
    }

