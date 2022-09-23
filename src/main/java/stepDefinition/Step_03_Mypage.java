package stepDefinition;

import Commons.SetupHelp;
import DataFile.PropertiesFile;
import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Step_03_Mypage extends SetupHelp {

    @When("^Go to mypage page successfully$")
    public void go_to_mypage_page_successfully() throws Throwable {
        Thread.sleep(4000);
        verifyElementText("css","MPUItitlecss","マイページ");
        verifyElementText("css","MPUIbtncaloidcss","ログイン情報の確認");
        verifyElementText("css","MPUIbtnaddsupportercss","招待コードをお持ちの方");
    }
    @Then("^Go to mypage1 page successfully$")
    public void go_to_mypage1_page_successfully() throws Throwable {
        Thread.sleep(4000);
        verifyElementText("css","MPUItitlecss","マイページ");
        verifyElementText("css","MPUIbtncaloidcss","ログイン情報の確認");
        verifyElementText("css","MPUIbtnaddsupportercss","招待コードをお持ちの方");
        verifyElementText("css","MPUIconfirmemailcss","カロママID（メールアドレス）の認証をお願いします");
    }

    @When("^Click confirm cognito button in mypage page$")
    public void click_confirm_cognito_button_in_mypage_page() throws Throwable {
        clickElement("id","MPbtnconfirmID");
    }

    @Then("^Go to calo id detail page successfully$")
    public void go_to_calo_id_detail_page_successfully() throws Throwable {
        verifyElementText("css", "CaLoIDbtnBackcss", "マイページ");
        verifyElementText("css", "CaLoIDtitlecss", "ログイン情報の確認");
        verifyElementText("css", "CaLoIDUIcss", "カロママID\n" +
                "メールアドレス\n" +
//                "hieptestprd@yopmail.com\n" +
                "変更\n" +
                "パスワード\n" +
                "******\n" +
                "変更\n" +
                "二段階認証\n" +
                "SMS認証\n" +
                "未登録");
    }

    @When("^Click back button in calo id detail page$")
    public void click_back_button_in_calo_id_detail_page() throws Throwable {
        clickElement("css","CaLoIDbtnBackcss");
    }

    @When("^Click add supporter button in mypage page$")
    public void click_add_supporter_button_in_mypage_page() throws Throwable {
        clickElement("xpath","MPbtnAddSupporterX");
    }

    @Then("^Go to supporter company input invitation code page successfully$")
    public void go_to_supporter_company_input_invitation_code_page_successfully() throws Throwable {
        verifyElementText("css", "ICUIheadtextcss", "招待コード（数字7桁）の入力");
        verifyElementText("css","ICUIsubTitlecss","数字のみで構成される7桁の招待コードを入力してください");
        verifyElementText("css", "ICUIbtnSubmitcss", "次へ");
        verifyElementText("css", "IClabelTextboxcss", "招待コード");
        verifyPlaceHolderAttribute("css","ICplaceholdercss","placeholder","1234567");
        Thread.sleep(2000);
        click();
        Thread.sleep(1000);
        verifyPlaceHolderAttribute("css","ICplaceholdercss","placeholder","招待コードを入力");
    }

    @When("^Click back button in supporter company input invitation code page$")
    public void click_back_button_in_supporter_company_input_invitation_code_page() throws Throwable {
        backBrowser();
    }

    @When("^Click icon account in health check page$")
    public void Click_icon_account_in_health_check_page() throws Throwable {
        clickElement("xpath","HCiconBackmypageX");
    }
    @Then("^Input email and pw of user do not have data HC$")
    public void input_email_and_pw_of_user_do_not_have_data_HC() throws Throwable {
        inputText("id","LGemailID", PropertiesFile.getPropValue("LGemailDoNotHaveDaTaHC"));
        inputText("id","LGpassID","Password123");
    }

    @Then("^Go to no data health check page successfully$")
    public void go_to_no_data_health_check_page_successfully() throws Throwable {
        Thread.sleep(3000);
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
    }

    @Then("^Click btn logout in mypage page$")
    public void click_btn_logout_in_mypage_page() throws Throwable {
        clickElement("css","MPbtnLogoutcss");
    }

    @Then("^Input email and pw of user has data HC$")
    public void input_email_and_pw_of_user_has_data_HC() throws Throwable {
        inputText("id","LGemailID",PropertiesFile.getPropValue("LGemailHasDataHC"));
        inputText("id","LGpassID","Password123");
    }

    @Then("^Go to heal check top page successfully$")
    public void go_to_heal_check_top_page_successfully() throws Throwable {
        Thread.sleep(10000);
        verifyElementText("css", "TPtitlecss", "最新の健診データ");
        verifyElementText("css", "TPcontentcss", "身体計測\n" +
                "血圧\n" +
                "肝機能\n" +
                "血中脂質\n" +
                "糖代謝\n" +
                "腎機能\n" +
                "貧血\n" +
                "尿酸");
        movetoEndPage();
        verifyElementText("id", "TPbtnHClistID", "健診データ一覧");
    }

    @When("^Icon warning not display$")
    public void icon_warning_not_display() throws Throwable {
        if (driver.findElement(By.id("email-not-confrim")).isDisplayed()){
            System.out.println("Icon warning Display");
        }else {
            System.out.println("Icon warning not display");
        }
    }

    @Then("^Input email and pw of user do not verify email$")
    public void input_email_and_pw_of_user_do_not_verify_email() throws Throwable {
        inputText("id","LGemailID",PropertiesFile.getPropValue("LGemailDoNotVerify"));
        inputText("id","LGpassID","Password123");
    }

    @Then("^Icon warning display$")
    public void icon_warning_display() throws Throwable {
        if (driver.findElement(By.id("email-not-confrim")).isDisplayed()){
            System.out.println("Icon warning Display");
        }else {
            System.out.println("Icon warning not display");
        }
    }

}
