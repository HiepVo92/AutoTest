package Commons;

import DataFile.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.gmail.api.GmailAPI.getGmailService;
import static com.gmail.api.GmailAPI.getMailBody;


public class SetupHelp {
        public static WebDriver driver;
        private JavascriptExecutor jsExecutor;
        private String emailContent, confirmationCode;
        private Character Number1, Number2, Number3, Number4, Number5, Number6;

        //===================== Khởi tạo BROWSER and Open URL  ====================

        private WebDriver initChromeDriver() {
            System.out.println("Launching chrome browser...");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            return driver;
        }
        private WebDriver initFirefoxDriver() {
            System.out.println("Launching firefox browser...");
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            return driver;
        }

        public void openURL(String browserType, String url) {
            switch (browserType.trim().toLowerCase()) {
                case "chrome": {
                    driver = initChromeDriver();
                    driver.navigate().to(url);

                }
                break;

                case "firefox": {
                    driver = initFirefoxDriver();
                    driver.navigate().to(url);
                }
                break;
            }
        }

        //==========Extend settup===



        //==================== Nhập text vào element
        public void inputText(String locators, String element, String value) {
            switch (locators.trim().toLowerCase()) {
                case "xpath" -> driver.findElement(By.xpath(PropertiesFile.getPropValue(element))).sendKeys(value);
                case "class" -> driver.findElement(By.className(PropertiesFile.getPropValue(element))).sendKeys(value);
                case "id" -> driver.findElement(By.id(PropertiesFile.getPropValue(element))).sendKeys(value);
                case "name" -> driver.findElement(By.name(PropertiesFile.getPropValue(element))).sendKeys(value);
                case "css" -> driver.findElement(By.cssSelector(PropertiesFile.getPropValue(element))).sendKeys(value);
                case "parlink" -> driver.findElement(By.partialLinkText(PropertiesFile.getPropValue(element))).sendKeys(value);
            }
        }
        //=====================Clear text =====
        public void clearText(String locators, String element) {
            switch (locators.trim().toLowerCase()) {
                case "xpath" -> { for (int i = 0; i <= 50;i=i+1) {
                    driver.findElement(By.xpath(PropertiesFile.getPropValue(element))).sendKeys(Keys.BACK_SPACE);
                }}
                case "class" -> { for (int i = 0; i <= 50;i=i+1) {
                    driver.findElement(By.className(PropertiesFile.getPropValue(element))).sendKeys(Keys.BACK_SPACE);
                }}
                case "id" -> { for (int i = 0; i <= 50;i=i+1) {
                    driver.findElement(By.id(PropertiesFile.getPropValue(element))).sendKeys(Keys.BACK_SPACE);
                }}
                case "css" -> { for (int i = 0; i <= 50;i=i+1) {
                    driver.findElement(By.cssSelector(PropertiesFile.getPropValue(element))).sendKeys(Keys.BACK_SPACE);
                }}
                case "parlink" -> { for (int i = 0; i <= 50;i=i+1) {
                    driver.findElement(By.partialLinkText(PropertiesFile.getPropValue(element))).sendKeys(Keys.BACK_SPACE);
                }}
            }
        }

        //====================== Click element======

        public void clickElement(String locators, String element) {
            switch (locators.trim().toLowerCase()) {
                case "xpath" -> driver.findElement(By.xpath(PropertiesFile.getPropValue(element))).click();
                case "class" -> driver.findElement(By.className(PropertiesFile.getPropValue(element))).click();
                case "id" -> driver.findElement(By.id(PropertiesFile.getPropValue(element))).click();
                case "name" -> driver.findElement(By.name(PropertiesFile.getPropValue(element))).click();
                case "css" -> driver.findElement(By.cssSelector(PropertiesFile.getPropValue(element))).click();
                case "parlink" -> driver.findElement(By.partialLinkText(PropertiesFile.getPropValue(element))).click();
            }
        }

        //====================== Check message, title, header...check text
        public void verifyElementText(String locators,String element,String textValue) {
            switch (locators.trim().toLowerCase()) {
                case "xpath" -> {
                Assert.assertEquals(driver.findElement(By.xpath(PropertiesFile.getPropValue(element))).getText(),textValue);
                System.out.println(driver.findElement(By.xpath(PropertiesFile.getPropValue(element))).getText());
                }
                case "class" -> {
                Assert.assertEquals(driver.findElement(By.className(PropertiesFile.getPropValue(element))).getText(),textValue);
                System.out.println(driver.findElement(By.className(PropertiesFile.getPropValue(element))).getText());
                }
                case "id" -> {
                Assert.assertEquals(driver.findElement(By.id(PropertiesFile.getPropValue(element))).getText(),textValue);
                System.out.println(driver.findElement(By.id(PropertiesFile.getPropValue(element))).getText());

                }
                case "css" -> {
                Assert.assertEquals(driver.findElement(By.cssSelector(PropertiesFile.getPropValue(element))).getText(),textValue);
                System.out.println(driver.findElement(By.cssSelector(PropertiesFile.getPropValue(element))).getText());
                }
                case "parlink" -> {
                Assert.assertEquals(driver.findElement(By.partialLinkText(PropertiesFile.getPropValue(element))).getText(),textValue);
                System.out.println(driver.findElement(By.partialLinkText(PropertiesFile.getPropValue(element))).getText());
                }
            }
        }
        //================ Check Get Attribute ======
        public void verifyPlaceHolderAttribute(String locators,String element,String Attribute,String textValue) {
            switch (locators.trim().toLowerCase()) {
                case "xpath" -> {
                    Assert.assertEquals(driver.findElement(By.xpath(PropertiesFile.getPropValue(element))).getAttribute(Attribute),textValue);
                    System.out.println(driver.findElement(By.xpath(PropertiesFile.getPropValue(element))).getAttribute(Attribute));
                }
                case "class" -> {
                    Assert.assertEquals(driver.findElement(By.className(PropertiesFile.getPropValue(element))).getAttribute(Attribute),textValue);
                    System.out.println(driver.findElement(By.className(PropertiesFile.getPropValue(element))).getAttribute(Attribute));
                }
                case "id" -> {
                    Assert.assertEquals(driver.findElement(By.id(PropertiesFile.getPropValue(element))).getAttribute(Attribute),textValue);
                    System.out.println(driver.findElement(By.id(PropertiesFile.getPropValue(element))).getAttribute(Attribute));
                }
                case "css" -> {
                    Assert.assertEquals(driver.findElement(By.cssSelector(PropertiesFile.getPropValue(element))).getAttribute(Attribute),textValue);
                    System.out.println(driver.findElement(By.cssSelector(PropertiesFile.getPropValue(element))).getAttribute(Attribute));
                }
                case "parlink" -> {
                    Assert.assertEquals(driver.findElement(By.partialLinkText(PropertiesFile.getPropValue(element))).getAttribute(Attribute),textValue);
                    System.out.println(driver.findElement(By.partialLinkText(PropertiesFile.getPropValue(element))).getAttribute(Attribute));
                }
            }
        }
        //================ Check go to page successfully
        public void checkDisp(String locators,String element) {
            switch (locators.trim().toLowerCase()) {
                case "xpath" -> {
                    Assert.assertTrue(driver.findElement(By.xpath(PropertiesFile.getPropValue(element))).isDisplayed());
                }
                case "class" -> {
                    Assert.assertTrue(driver.findElement(By.className(PropertiesFile.getPropValue(element))).isDisplayed());
                }
                case "id" -> {
                    Assert.assertTrue(driver.findElement(By.id(PropertiesFile.getPropValue(element))).isDisplayed());
                }
                case "name" -> {
                    Assert.assertTrue(driver.findElement(By.name(PropertiesFile.getPropValue(element))).isDisplayed());
                }
                case "css" -> {
                    Assert.assertTrue(driver.findElement(By.cssSelector(PropertiesFile.getPropValue(element))).isDisplayed());

                }
                case "parlink" -> {
                    Assert.assertTrue(driver.findElement(By.partialLinkText(PropertiesFile.getPropValue(element))).isDisplayed());
                }
            }
        }

            //================ Check button Enable=====
            public void checkbtnenable(String locators,String element) {
                switch (locators.trim().toLowerCase()) {
                    case "xpath" -> {
                        Assert.assertTrue(driver.findElement(By.xpath(PropertiesFile.getPropValue(element))).isEnabled());
                    }
                    case "class" -> {
                        Assert.assertTrue(driver.findElement(By.className(PropertiesFile.getPropValue(element))).isEnabled());
                    }
                    case "id" -> {
                        Assert.assertTrue(driver.findElement(By.id(PropertiesFile.getPropValue(element))).isEnabled());
                    }
                    case "name" -> {
                        Assert.assertTrue(driver.findElement(By.name(PropertiesFile.getPropValue(element))).isEnabled());
                    }
                    case "css" -> {
                        Assert.assertTrue(driver.findElement(By.cssSelector(PropertiesFile.getPropValue(element))).isEnabled());

                    }
                    case "parlink" -> {
                        Assert.assertTrue(driver.findElement(By.partialLinkText(PropertiesFile.getPropValue(element))).isEnabled());
                    }
                }
            }
            //=================== Check button disable ==============
            public void checkbtndisable(String locators,String element) {
                switch (locators.trim().toLowerCase()) {
                    case "xpath" -> {
                        Assert.assertFalse(driver.findElement(By.xpath(PropertiesFile.getPropValue(element))).isEnabled());
                    }
                    case "class" -> {
                        Assert.assertFalse(driver.findElement(By.className(PropertiesFile.getPropValue(element))).isEnabled());
                    }
                    case "id" -> {
                        Assert.assertFalse(driver.findElement(By.id(PropertiesFile.getPropValue(element))).isEnabled());
                    }
                    case "name" -> {
                        Assert.assertFalse(driver.findElement(By.name(PropertiesFile.getPropValue(element))).isEnabled());
                    }
                    case "css" -> {
                        Assert.assertFalse(driver.findElement(By.cssSelector(PropertiesFile.getPropValue(element))).isEnabled());

                    }
                    case "parlink" -> {
                        Assert.assertFalse(driver.findElement(By.partialLinkText(PropertiesFile.getPropValue(element))).isEnabled());
                    }
                }
            }
            //==================Check select box đã được check
            public void selectboxcheck(String locators,String element) {
                switch (locators.trim().toLowerCase()) {
                    case "xpath" -> {
                        Assert.assertTrue(driver.findElement(By.xpath(PropertiesFile.getPropValue(element))).isSelected());
                    }
                    case "class" -> {
                        Assert.assertTrue(driver.findElement(By.className(PropertiesFile.getPropValue(element))).isSelected());
                    }
                    case "id" -> {
                        Assert.assertTrue(driver.findElement(By.id(PropertiesFile.getPropValue(element))).isSelected());
                    }
                    case "name" -> {
                        Assert.assertTrue(driver.findElement(By.name(PropertiesFile.getPropValue(element))).isSelected());
                    }
                    case "css" -> {
                        Assert.assertTrue(driver.findElement(By.cssSelector(PropertiesFile.getPropValue(element))).isSelected());

                    }
                    case "parlink" -> {
                        Assert.assertTrue(driver.findElement(By.partialLinkText(PropertiesFile.getPropValue(element))).isSelected());
                    }
                }
            }
            //================== Check select box chưa được check
            public void selectboxnotcheck(String locators,String element) {
                switch (locators.trim().toLowerCase()) {
                    case "xpath" -> {
                        Assert.assertFalse(driver.findElement(By.xpath(PropertiesFile.getPropValue(element))).isSelected());
                    }
                    case "class" -> {
                        Assert.assertFalse(driver.findElement(By.className(PropertiesFile.getPropValue(element))).isSelected());
                    }
                    case "id" -> {
                        Assert.assertFalse(driver.findElement(By.id(PropertiesFile.getPropValue(element))).isSelected());
                    }
                    case "name" -> {
                        Assert.assertFalse(driver.findElement(By.name(PropertiesFile.getPropValue(element))).isSelected());
                    }
                    case "css" -> {
                        Assert.assertFalse(driver.findElement(By.cssSelector(PropertiesFile.getPropValue(element))).isSelected());

                    }
                    case "parlink" -> {
                        Assert.assertFalse(driver.findElement(By.partialLinkText(PropertiesFile.getPropValue(element))).isSelected());
                    }
                }
            }
        //=============== Get code  =======
        public void getconfirmcode(String emailvrf) throws Throwable {
            jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("window.open('https://mailsac.com/','_blank');");
            ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
            //Switch qua tab mailsac.com vừa mở
            driver.switchTo().window(tabs.get(1));
            Thread.sleep(3000);
            driver.findElement(By.xpath( "//input[@placeholder='anything']")).sendKeys(emailvrf);
            driver.findElement(By.xpath( "//button[normalize-space()='Check the mail!']")).click();
            Thread.sleep(2000);
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
            PropertiesFile.setPropValue("confirmationCode", confirmationCode);
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
        }

        //====== Check color ========
        public void checkColor(String locators, String element, String value) {
            switch (locators.trim().toLowerCase()) {
                case "xpath" -> {
                    Assert.assertEquals(Color.fromString(driver.findElement(By.xpath(PropertiesFile.getPropValue(element))).getCssValue("color").trim()).asHex(),value);
                    System.out.println(Color.fromString(driver.findElement(By.xpath(PropertiesFile.getPropValue(element))).getCssValue("color").trim()).asHex());
                }
                case "class" -> {
                    Assert.assertEquals(Color.fromString(driver.findElement(By.className(PropertiesFile.getPropValue(element))).getCssValue("color").trim()).asHex(),value);
                    System.out.println(Color.fromString(driver.findElement(By.className(PropertiesFile.getPropValue(element))).getCssValue("color").trim()).asHex());
                }
                case "id" ->{
                    Assert.assertEquals(Color.fromString(driver.findElement(By.id(PropertiesFile.getPropValue(element))).getCssValue("color").trim()).asHex(),value);
                    System.out.println(Color.fromString(driver.findElement(By.id(PropertiesFile.getPropValue(element))).getCssValue("color").trim()).asHex());
                }
                case "name" ->{
                    Assert.assertEquals(Color.fromString(driver.findElement(By.name(PropertiesFile.getPropValue(element))).getCssValue("color").trim()).asHex(),value);
                    System.out.println(Color.fromString(driver.findElement(By.name(PropertiesFile.getPropValue(element))).getCssValue("color").trim()).asHex());
                }
                case "css" ->{
                    Assert.assertEquals(Color.fromString(driver.findElement(By.cssSelector(PropertiesFile.getPropValue(element))).getCssValue("color").trim()).asHex(),value);
                    System.out.println(Color.fromString(driver.findElement(By.cssSelector(PropertiesFile.getPropValue(element))).getCssValue("color").trim()).asHex());
                }
                case "parlink" ->{
                    Assert.assertEquals(Color.fromString(driver.findElement(By.partialLinkText(PropertiesFile.getPropValue(element))).getCssValue("color").trim()).asHex(),value);
                    System.out.println(Color.fromString(driver.findElement(By.partialLinkText(PropertiesFile.getPropValue(element))).getCssValue("color").trim()).asHex());
                }
            }
        }
        //============== Check Label textbox =======
        public void verifyLabeltextbox(String locators,String element,String textValue) {
            String script = "return window.getComputedStyle(document.querySelector('.label-input'),':after').getPropertyValue('content')";
            JavascriptExecutor js = (JavascriptExecutor)driver;
            String content = (String) js.executeScript(script);
            switch (locators.trim().toLowerCase()) {
                case "xpath" -> {
                    Assert.assertEquals(driver.findElement(By.xpath(PropertiesFile.getPropValue(element))).getText()+content.substring(1,4),textValue);
                    System.out.println(driver.findElement(By.xpath(PropertiesFile.getPropValue(element))).getText()+content.substring(1,4));
                }
                case "class" -> {
                    Assert.assertEquals(driver.findElement(By.className(PropertiesFile.getPropValue(element))).getText()+content.substring(1,4),textValue);
                    System.out.println(driver.findElement(By.className(PropertiesFile.getPropValue(element))).getText()+content.substring(1,4));
                }
                case "id" -> {
                    Assert.assertEquals(driver.findElement(By.id(PropertiesFile.getPropValue(element))).getText()+content.substring(1,4),textValue);
                    System.out.println(driver.findElement(By.id(PropertiesFile.getPropValue(element))).getText()+content.substring(1,4));

                }
                case "css" -> {
                    Assert.assertEquals(driver.findElement(By.cssSelector(PropertiesFile.getPropValue(element))).getText()+content.substring(1,4),textValue);
                    System.out.println(driver.findElement(By.cssSelector(PropertiesFile.getPropValue(element))).getText()+content.substring(1,4));
                }
                case "parlink" -> {
                    Assert.assertEquals(driver.findElement(By.partialLinkText(PropertiesFile.getPropValue(element))).getText()+content.substring(1,4),textValue);
                    System.out.println(driver.findElement(By.partialLinkText(PropertiesFile.getPropValue(element))).getText()+content.substring(1,4));
                }
            }
        }
        //========= move element =====

        public void movetoEndPage (){
            Actions actions = new Actions(driver);
            actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
            actions.keyUp(Keys.CONTROL).build().perform();
        }
        public void movetoElement(String locators,String element){
            Actions actions = new Actions(driver);
            switch (locators.trim().toLowerCase()) {
                case "xpath" -> {
                    actions.moveToElement(driver.findElement(By.xpath(PropertiesFile.getPropValue(element))));
                }
                case "class" -> {
                    actions.moveToElement(driver.findElement(By.className(PropertiesFile.getPropValue(element))));
                }
                case "id" -> {
                    actions.moveToElement(driver.findElement(By.id(PropertiesFile.getPropValue(element))));
                }
                case "name" -> {
                    actions.moveToElement(driver.findElement(By.name(PropertiesFile.getPropValue(element))));
                }
                case "css" -> {
                    actions.moveToElement(driver.findElement(By.cssSelector(PropertiesFile.getPropValue(element))));

                }
                case "parlink" -> {
                    actions.moveToElement(driver.findElement(By.partialLinkText(PropertiesFile.getPropValue(element))));
                }
            }

        }
        //=============== Mở trang trước trong nhật ký duyệt web của bạn cho thẻ hiện tại
            public void backBrowser (){
                Actions actions = new Actions(driver);
                actions.keyDown(Keys.COMMAND).sendKeys(Keys.ARROW_LEFT).build().perform();
                actions.keyUp(Keys.COMMAND).build().perform();
            }
            //===== click ====
            public void click (){
                Actions actions = new Actions(driver);
                actions.click().build().perform();
            }
            // ==== sendkey actions ==
            public void sendKeyAction(String value){
                Actions actions = new Actions(driver);
                actions.sendKeys(value).build().perform();
            }
            //======== Get Code SMS MFA ====
        public void getCodeSMS () throws GeneralSecurityException, IOException {
            getGmailService();
            getMailBody("l.nguyen@linkncom.co.jp");
        }

            //=================== QUIT browser ==============

            public void Quit (){
                driver.quit();
            }
    }
