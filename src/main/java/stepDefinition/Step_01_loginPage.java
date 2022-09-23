package stepDefinition;
import Commons.SetupHelp;
import DataFile.PropertiesFile;
import cucumber.api.java.en.*;


//Change email STG or DEV================================= 14 -15

public class Step_01_loginPage extends SetupHelp {
    @When("^Input email and pw correct in login page$")
    public void Input_email_and_pw_correct_in_login_page() throws Throwable {
        clearText("id","LGemailID");
        clearText("id","LGpassID");
        inputText("id","LGemailID",PropertiesFile.getPropValue("LGemaildata"));
        inputText("id","LGpassID","Password123");

    }
    @When("^Click submit button in login page$")
    public void Click_submit_button_in_login_page() throws Throwable {
        clickElement("class","LGbtnsubmitClass");
        Thread.sleep(5000);
//        Thread.sleep(1000);
//        clickElement("class","LGbtnsubmitClass");
    }
    @When ("^Click forgot password button in login page$")
    public void Click_forgot_password_button_in_login_page() throws Throwable{
        clickElement("xpath","LGbtnforgotX");
    }
    @Then ("^Go to forgot password page successfully$")
    public void Go_to_forgot_password_page_successfully() throws Throwable {
        Thread.sleep(1000);
        checkDisp("class", "FGUIClass");
        verifyElementText("css","FGUIbtnbackcss","戻る");
        verifyElementText("css","FGUItitlecss","パスワード再設定");
        verifyElementText("css","FGUItextcss","本人であることを確認するために、パスワード再設定のための認証コードをお送りします。\n" +
                "カロママID（メールアドレス）を入力してください。");
        verifyElementText("css","FGUIbtnsubmitcss","認証コードを送信する");

    }

    @When ("^Click back button in forgot password page$")
    public void Click_back_button_in_forgot_password_page(){
        clickElement("xpath","FGbtnbackX");
    }

    @When("^Input email is test$")
    public void input_email_is_test() throws Throwable {
        clearText("id","LGemailID");
        inputText("id", "LGemailID","test@1");
    }

    @Then("^正しいメールアドレスを入力してください。 email result is shown correctly$")
    public void 正しいメールアドレスを入力してください_email_result_is_shown_correctly() throws Throwable {
        Thread.sleep(1000);
        verifyElementText("xpath","LGemailerror","正しいメールアドレスを入力してください。");


    }

    @When("^Input email is hieptest@yopmail\\.com$")
    public void input_email_is_hieptest_yopmail_com() throws Throwable {
        clearText("id","LGemailID");
        inputText("id", "LGemailID","hieptest@yopmail.com");
    }

    @Then("^ email result is shown correctly$")
    public void email_result_is_shown_correctly() throws Throwable {
        Thread.sleep(1000);
        verifyElementText("xpath","LGemailerror","");
    }

    @When("^Input pw is Test")
    public void input_pw_is_Test() throws Throwable {
        clearText("id","LGpassID");
        inputText("id", "LGpassID","test123");
        clickElement("class","LGtoggleClass");
        Thread.sleep(1000);
        clickElement("class","LGtoggleClass");
    }

    @Then("^ pw result is shown correctly$")
    public void pw_result_is_shown_correctly() throws Throwable {
        verifyElementText("id","LGpasserrorID","");
    }

    @Then("^Go to MFA page successfully$")
    public void Go_to_MFA_page_successfully() throws Throwable {
        //Thread.sleep(2000);
        //verifyElementText("id","MFAUI","認証コードを再送する");
    }
    @When("^Input email and pw incorrect in login page$")
    public void Input_email_and_pw_incorrect_in_login_page()throws Throwable{
        clearText("id","LGemailID");
        clearText("id","LGpassID");
        inputText("id", "LGemailID", "emailincorrect@yopmail.com");
        inputText("id", "LGpassID", "Passincorrect123");
        clickElement("class","LGtoggleClass");
        Thread.sleep(1000);
        clickElement("class","LGtoggleClass");
    }
    @Then("^Show error msg login$")
    public void Show_error_msg_login()throws Throwable{
        clickElement("class","LGbtnsubmitClass");
        Thread.sleep(3000);
        clickElement("class","LGbtnsubmitClass");
        Thread.sleep(3000);
        verifyElementText("css","LGmsgerror","メールアドレスかパスワードが正しくありません。");
    }
    @When("^Submit button is disable when not input email or pw$")
    public void Submit_button_is_disable_when_not_input_email_or_pw () throws  Throwable{
        clearText("id","LGemailID");
        clearText("id","LGpassID");
        checkbtndisable("css","LGbtnsubmitcss");

    }
    @When("^Submit button is enable when input email and pw$")
    public void Submit_button_is_enable_when_input_email_and_pw () throws Throwable{
        clearText("id","LGemailID");
        clearText("id","LGpassID");
        Thread.sleep(1000);
        inputText("id", "LGemailID", "emailtest@yopmail.com");
        inputText("id", "LGpassID", "Passtest123");
        clickElement("class","LGtoggleClass");
        checkbtnenable("class","LGbtnsubmitClass");
    }
    @When("^Click out focus in login page$")
    public void Click_out_focus_in_login_page (){
        clickElement("css","LGUI");
    }
    @When ("^Do not input email and pw$")
    public void Do_not_input_email_and_pw(){
        clearText("id","LGemailID");
        clearText("id","LGpassID");
    }
    @Then ("^Label and placeholder display correct$")
    public void Then_Label_and_placeholder_display_correct()throws Throwable{
        // email text box
        verifyPlaceHolderAttribute("id","LGemailplaceholderID","placeholder","user@calomama.com");
        verifyLabeltextbox("xpath","LGemaillabelX","メールアドレスを入力");
        // password text box
        verifyPlaceHolderAttribute("id","LGpasswordplaceholderID","placeholder","パスワードを入力");
        verifyLabeltextbox("css","LGpasswordlabelcss","パスワードを入力");
    }
    @When("^Input email is cleartext$")
    public void input_email_is_cleartext() throws Throwable {
        clearText("id","LGemailID");
    }

    @Then("^メールアドレスを入力してください。 email result is shown correctly$")
    public void メールアドレスを入力してください_email_result_is_shown_correctly() throws Throwable {
        verifyElementText("xpath","LGemailerror","メールアドレスを入力してください。");
    }

    @When("^Input pw is cleartext$")
    public void input_pw_is_cleartext() throws Throwable {
        clearText("id","LGpassID");
    }

    @Then("^パスワードを入力してください。 pw result is shown correctly$")
    public void パスワードを入力してください_pw_result_is_shown_correctly() throws Throwable {
        verifyElementText("id","LGpasserrorID","パスワードを入力してください。");
    }
}
