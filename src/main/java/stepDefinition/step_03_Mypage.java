package stepDefinition;

import Commons.SetupHelp;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;


public class step_03_Mypage extends SetupHelp {

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

    @When("^Click back button in mypage page$")
    public void click_back_button_in_mypage_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
