
package stepDefinition;

import Commons.SetupHelp;
import cucumber.api.java.en.*;

public class Step_02_register extends SetupHelp {

    @Then("^Check select box of invitation code and pass code$")
    public void check_select_box_of_invitation_code_and_pass_code() throws Throwable {
        //check select box not check
        selectboxnotcheck("xpath","CCcheckbox1X");
        selectboxnotcheck("xpath","CCcheckbox2X");
        Thread.sleep(1000);
        //click check box
        clickElement("xpath","CCcheckbox1X");
        clickElement("xpath","CCcheckbox2X");
        Thread.sleep(1000);
        //check select box check
        selectboxcheck("xpath", "CCcheckbox1X");
        selectboxcheck("xpath", "CCcheckbox2X");
    }
    @Then("^Check submit button enable/disable in check code page$")
    public void Check_submit_button_enable_disable_in_check_code_page()throws Throwable{
        //Thread.sleep(1000);
        checkbtnenable("css","CCbtnsubmitcss");
        Thread.sleep(1000);
        clickElement("xpath","CCcheckbox1X");
        clickElement("xpath","CCcheckbox2X");
        Thread.sleep(1000);
        checkbtndisable("css","CCbtnsubmitcss");


    }


    @Then("^Click submit button in check code page$")
    public void click_submit_button_in_check_code_page() throws Throwable {
        clickElement("xpath","CCcheckbox1X");
        clickElement("xpath","CCcheckbox2X");
        movetoEndPage();
        Thread.sleep(2000);
        clickElement("css","CCbtnsubmitcss");

    }

    @Then("^Go to Handling of personal information page successfully$")
    public void go_to_Handling_of_personal_information_page_successfully() throws Throwable {
        verifyElementText("css","CPUIbtnbackcss","戻る");
        verifyElementText("css","CPUItitlecss","個人情報保護方針のご確認");
        verifyElementText("css","CPUItextcss","『「カロママプラス」における個人情報に関する当社の取扱い』をご一読の上、同意をお願いします。");
        verifyElementText("css","CPbtnsubmitcss","同意して次へ");
    }

    @When("^Click back button in Handling of personal information page$")
    public void click_back_button_in_Handling_of_personal_information_page() throws Throwable {
        clickElement("xpath","CPbtnbackX");
    }

    @Then("^Click submit button in Handling of personal information page$")
    public void click_submit_button_in_Handling_of_personal_information_page() throws Throwable {
        movetoEndPage();
        Thread.sleep(1000);
        clickElement("css","CPbtnsubmitcss");
    }

    @Then("^Go to Terms of user page successfully$")
    public void go_to_Terms_of_user_page_successfully() throws Throwable {
        verifyElementText("css","TOUUIbtnbackcss","戻る");
        verifyElementText("css","TOUUItitlecss","利用規約への同意");
        verifyElementText("css","TOUItextcss","アプリの利用開始前に、「カロママプラス 利用規約」をご確認の上、同意をお願いします。");
        verifyElementText("css","TOUbtnsubmitcss","同意して次へ");
    }

    @When("^Click back button in Terms of user page$")
    public void click_back_button_in_Terms_of_user_page() throws Throwable {
        clickElement("css","TOUUIbtnbackcss");
    }
    @When("^Click submit button in terms of user page$")
    public void click_submit_button_in_terms_of_user_page() throws Throwable {
        movetoEndPage();
        Thread.sleep(1000);
        clickElement("css","TOUbtnsubmitcss");
    }

    @Then("^Go to signup page successfully$")
    public void go_to_signup_page_successfully() throws Throwable {
        verifyElementText("css", "SUUIheadercss", "カロママIDの登録");
    }

    @Then("^Check UI and placeholder signup page$")
    public void check_UI_and_placeholder_signup_page() throws Throwable {
        verifyElementText("css", "SUUIbtnbackcss", "戻る");
        //verifyElementText("css", "SUUIheadercss", "カロママIDの登録");
        verifyElementText("css", "SUUItitlecss", "ログインする時に使うカロママID（メールアドレス）とパスワードを設定してください");
        verifyElementText("css", "SUUItextcss", "8文字以上でかつ英大文字、英小文字、数字を含む");
        verifyElementText("css", "SUbtnsubmitcss", "登録する");
        verifyPlaceHolderAttribute("xpath", "SUplaceholderemailX", "placeholder", "username@calomama.com");
        verifyPlaceHolderAttribute("xpath", "SUplaceholderpassX", "placeholder", "パスワードを入力");
        verifyLabeltextbox("xpath", "SUlabelemailX", "メールアドレスを入力");
        verifyLabeltextbox("css", "SUlabelpasscss", "パスワードを入力");
    }

    @Then("^Check submit button enable/disable in signup page$")
    public void check_submit_button_enable_disable_in_signup_page() throws Throwable {
        checkbtndisable("css","SUbtnsubmitcss");
        inputText("xpath","SUemailX","text123");
        checkbtndisable("css","SUbtnsubmitcss");
        inputText("xpath","SUpassX","Passs");
        clickElement("xpath","SUtoggleX");
        checkbtnenable("css","SUbtnsubmitcss");
        clearText("xpath","SUemailX");
        clearText("xpath","SUpassX");
        driver.navigate().refresh();
    }

    @When("^Input focus in email text box on signup page$")
    public void input_focus_in_email_text_box_on_signup_page() throws Throwable {
        //inputText("xpath","SUemailX","");
        clickElement("xpath","SUemailX");
    }

    @When("^Click out focus in signup page$")
    public void click_out_focus_in_signup_page() throws Throwable {
        clickElement("css","SUUIheadercss");
    }

    @When("^Show null error msg email on signup page$")
    public void show_null_error_msg_email_on_signup_page() throws Throwable {
        Thread.sleep(1000);
        verifyElementText("xpath","SUemailmsgerrorX","");
    }

    @When("^Input abc in email text box on signup page$")
    public void input_abc_in_email_text_box_on_signup_page() throws Throwable {
        Thread.sleep(1000);
        inputText("xpath","SUemailX","abc");
    }

    @When("^Show 正しいメールアドレスを入力してください error msg email on signup page$")
    public void show_正しいメールアドレスを入力してください_error_msg_email_on_signup_page() throws Throwable {
        verifyElementText("css","SUemailmsgerrorcss","正しいメールアドレスを入力してください");
    }

    @When("^Input null in email text box on signup page$")
    public void input_null_in_email_text_box_on_signup_page() throws Throwable {
        clearText("xpath","SUemailX");
    }

    @When("^Show メールアドレスを入力してください。 error msg email on signup page$")
    public void show_メールアドレスを入力してください_error_msg_email_on_signup_page() throws Throwable {
        verifyElementText("css","SUemailmsgerrorcss","メールアドレスを入力してください。");

    }

    @When("^Input focus in password text box on signup page$")
    public void input_focus_in_password_text_box_on_signup_page() throws Throwable {
        driver.navigate().refresh();
        clickElement("xpath","SUpassX");
    }

    @When("^Show null error msg password on signup page$")
    public void show_null_error_msg_password_on_signup_page() throws Throwable {
        verifyElementText("xpath","SUpassmsgerrorX","");
    }

    @When("^Input passwo in password text box on signup page$")
    public void input_passwo_in_password_text_box_on_signup_page() throws Throwable {
        clearText("xpath","SUpassX");
        inputText("xpath","SUpassX","passwo");
    }

    @When("^Show ８文字以上のパスワードを入力してください。 error msg password on signup page$")
    public void show_８文字以上のパスワードを入力してください_error_msg_password_on_signup_page() throws Throwable {
        verifyElementText("css","SUpassmsgerorrcss","８文字以上のパスワードを入力してください。");
    }

    @When("^Input PASSWORD in password text box on signup page$")
    public void input_PASSWORD_in_password_text_box_on_signup_page() throws Throwable {
        clearText("xpath","SUpassX");
        inputText("xpath","SUpassX","PASSWORD");
    }

    @When("^Show 英小文字、数字を含むパスワードを入力してください。 error msg password on signup page$")
    public void show_英小文字_数字を含むパスワードを入力してください_error_msg_password_on_signup_page() throws Throwable {
        verifyElementText("css","SUpassmsgerorrcss","英小文字、数字を含むパスワードを入力してください。");

    }

    @When("^Input password in password text box on signup page$")
    public void input_password_in_password_text_box_on_signup_page() throws Throwable {
        clearText("xpath","SUpassX");
        inputText("xpath","SUpassX","password");
    }

    @When("^Show 英大文字、数字を含むパスワードを入力してください。 error msg password on signup page$")
    public void show_英大文字_数字を含むパスワードを入力してください_error_msg_password_on_signup_page() throws Throwable {
        verifyElementText("css","SUpassmsgerorrcss","英大文字、数字を含むパスワードを入力してください。");

    }

    @When("^Input (\\d+) in password text box on signup page$")
    public void input_in_password_text_box_on_signup_page(String arg1) throws Throwable {
        clearText("xpath","SUpassX");
        inputText("xpath","SUpassX",arg1);
    }

    @When("^Show 英大文字、英小文字を含むパスワードを入力してください。 error msg password on signup page$")
    public void show_英大文字_英小文字を含むパスワードを入力してください_error_msg_password_on_signup_page() throws Throwable {
        verifyElementText("css","SUpassmsgerorrcss","英大文字、英小文字を含むパスワードを入力してください。");

    }

    @When("^Input Password in password text box on signup page$")
    public void input_Password_in_password_text_box_on_signup_page() throws Throwable {
        clearText("xpath","SUpassX");
        inputText("xpath","SUpassX","Password");
    }

    @When("^Show 数字を含むパスワードを入力してください。 error msg password on signup page$")
    public void show_数字を含むパスワードを入力してください_error_msg_password_on_signup_page() throws Throwable {
        verifyElementText("css","SUpassmsgerorrcss","数字を含むパスワードを入力してください。");

    }

    @When("^Input PASS(\\d+) in password text box on signup page$")
    public void input_PASS_in_password_text_box_on_signup_page(String arg1) throws Throwable {
        clearText("xpath","SUpassX");
        inputText("xpath","SUpassX","PASS"+arg1);
    }

    @When("^Show 小文字を含むパスワードを入力してください。 error msg password on signup page$")
    public void show_小文字を含むパスワードを入力してください_error_msg_password_on_signup_page() throws Throwable {
        verifyElementText("css","SUpassmsgerorrcss","小文字を含むパスワードを入力してください。");

    }

    @When("^Input pass(\\d+) in password text box on signup page$")
    public void input_pass_in_password_text_box_on_signup_page(String arg1) throws Throwable {
        clearText("xpath","SUpassX");
        inputText("xpath","SUpassX","pass"+arg1);
    }

    @When("^Show 大文字を含むパスワードを入力してください。 error msg password on signup page$")
    public void show_大文字を含むパスワードを入力してください_error_msg_password_on_signup_page() throws Throwable {
        verifyElementText("css","SUpassmsgerorrcss","大文字を含むパスワードを入力してください。");

    }

    @When("^Input character with space in beginining in password text box on signup page$")
    public void input_character_with_space_in_beginining_in_password_text_box_on_signup_page() throws Throwable {
        clearText("xpath","SUpassX");
        inputText("xpath","SUpassX"," Pass123");
    }

    @When("^Show パスワードに無効な文字が入っております。他のパスワードをお試しください。 error msg password on signup page$")
    public void show_パスワードに無効な文字が入っております_他のパスワードをお試しください_error_msg_password_on_signup_page() throws Throwable {
        verifyElementText("css","SUpassmsgerorrcss","パスワードに無効な文字が入っております。他のパスワードをお試しください。");

    }

    @When("^Input character with space at the end in password text box on signup page$")
    public void input_character_with_space_at_the_end_in_password_text_box_on_signup_page() throws Throwable {
        clearText("xpath","SUpassX");
        inputText("xpath","SUpassX","Pass123 ");
    }

    @When("^Input character with space in between in password text box on signup page$")
    public void input_character_with_space_in_between_in_password_text_box_on_signup_page() throws Throwable {
        clearText("xpath","SUpassX");
        inputText("xpath","SUpassX","Pass 123");
    }

}
