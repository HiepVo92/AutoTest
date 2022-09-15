package stepDefinition;

import Commons.SetupHelp;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;


public class Step_03_Mypage extends SetupHelp {

    @When("^Go to mypage page successfully$")
    public void go_to_mypage_page_successfully() throws Throwable {
        Thread.sleep(4000);
        verifyElementText("css","MPUItitlecss","マイページ");
        verifyElementText("css","MPUIbtncaloidcss","カロママIDの確認");
        verifyElementText("css","MPUIbtnaddsupportercss","招待コードの入力はこちら");
        verifyElementText("css","MPUIconfirmemailcss","カロママID（メールアドレス）の認証をお願いします");
    }

    @When("^Click confirm cognito button in mypage page$")
    public void click_confirm_cognito_button_in_mypage_page() throws Throwable {
        clickElement("id","MPbtnconfirmID");
    }

    @Then("^Go to calo id detail page successfully$")
    public void go_to_calo_id_detail_page_successfully() throws Throwable {

    }

    @When("^Click back button in calo id detail page$")
    public void click_back_button_in_calo_id_detail_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Click add supporter button in mypage page$")
    public void click_add_supporter_button_in_mypage_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Go to supporter company input invitation code page successfully$")
    public void go_to_supporter_company_input_invitation_code_page_successfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Click back button in supporter company input invitation code page$")
    public void click_back_button_in_supporter_company_input_invitation_code_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Click icon account in healcheck page$")
    public void click_icon_account_in_healcheck_page() throws Throwable {
        clickElement("xpath","HCiconBackmypageX");
    }
    @Then("^Input email and pw of user do not have data HC$")
    public void input_email_and_pw_of_user_do_not_have_data_HC() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Go to no data health check page successfully$")
    public void go_to_no_data_health_check_page_successfully() throws Throwable {
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
    }

    @Then("^Click btn logout in mypage page$")
    public void click_btn_logout_in_mypage_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Input email and pw of user has data HC$")
    public void input_email_and_pw_of_user_has_data_HC() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Go to heal check top page successfully$")
    public void go_to_heal_check_top_page_successfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Click icon account in health check page$")
    public void click_icon_account_in_health_check_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Icon wanning not display$")
    public void icon_wanning_not_display() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Input email and pw of user do not verify email$")
    public void input_email_and_pw_of_user_do_not_verify_email() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Icon wanning display$")
    public void icon_wanning_display() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
