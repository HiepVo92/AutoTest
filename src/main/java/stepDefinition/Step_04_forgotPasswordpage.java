package stepDefinition;

import Commons.SetupHelp;
import DataFile.PropertiesFile;
import cucumber.api.java.en.*;

//================================CHANGE NEW PASS ROW 251================================


public class Step_04_forgotPasswordpage extends SetupHelp {
    @When("^Check label text box forgot$")
    public void check_label_text_box_forgot() throws Throwable {
        PropertiesFile.setPropertiesFile();
        Thread.sleep(1000);
        verifyLabeltextbox("id","FGlabelID","メールアドレスを入力");
    }

    @When("^Check placeholder text box forgot$")
    public void check_placeholder_text_box_forgot() throws Throwable {
        clickElement("id","FGemailid");
        verifyPlaceHolderAttribute("xpath","FGplaceholderX","placeholder","username@calomama.com");
    }

    @When("^Input null in forgot password text box$")
    public void input_null_in_forgot_password_text_box() throws Throwable {
        inputText("id","FGemailid","");

    }
    @When("^Input null1 in forgot password text box$")
    public void input_null1_in_forgot_password_text_box() throws Throwable {
        clearText("id","FGemailid");
        clickElement("xpath", "FGbtnsubmitX");
    }

    @When("^Click submit button in forgot password page$")
    public void click_submit_button_in_forgot_password_page() throws Throwable {
        clickElement("xpath", "FGbtnsubmitX");
    }

    @Then("^Show メールアドレスを入力してください。 msg forgot page$")
    public void show_メールアドレスを入力してください_msg_forgot_page() throws Throwable {
        Thread.sleep(1000);
        verifyElementText("id","FGemailerrorID","メールアドレスを入力してください。");
    }

    @When("^Input abc in forgot password text box$")
    public void input_abc_in_forgot_password_text_box() throws Throwable {
        clearText("id","FGemailid");
        inputText("id", "FGemailid", "testdata");
    }

    @Then("^Show 正しいメールアドレスを入力してください msg forgot page$")
    public void show_正しいメールアドレスを入力してください_msg_forgot_page() throws Throwable {
        Thread.sleep(1000);
        verifyElementText("id","FGemailerrorID","正しいメールアドレスを入力してください");
    }

    @Then("^Show null msg forgot page$")
    public void show_null_msg_forgot_page() throws Throwable {
        //Thread.sleep(1000);

    }

    @When("^Input email correct in forgot password text box$")
    public void input_email_correct_in_forgot_password_text_box() throws Throwable {
        clearText("id","FGemailid");
        inputText("id", "FGemailid", PropertiesFile.getPropValue("FGemaildata"));
    }

    @Then("^Go to confirm code forgot password page successfully$")
    public void go_to_confirm_code_forgot_password_page_successfully() throws Throwable {
        Thread.sleep(2000);
        verifyElementText("css","CFGUIcss","パスワード再設定");
        verifyElementText("css","CFGUIbtnbackcss","戻る");
        verifyElementText("css","CFGUItitlecss","パスワード再設定");
        verifyElementText("css","CFGUItextcodecss","カロママID（メールアドレス）宛に送られた認証コードを入力してください。");
        verifyElementText("css","CFGUItextnewpasscss","新しいパスワードを入力してください。");
        verifyElementText("css","CFGUItextcss","8文字以上でかつ英大文字、英小文字、数字を含む");
        verifyElementText("css","CFGUIbtnsubmitcss","パスワードを変更する");
    }

    @When("^Input (\\d+) in confirm code forgot password text box$")
    public void input_in_confirm_code_forgot_password_text_box(String arg1) throws Throwable {
        Thread.sleep(5000);
        clearText("id","CFGcodeID");
        inputText("id","CFGcodeID",arg1);
        //Thread.sleep(2000);
    }

    @When("^Click submit button in confirm forgot password page$")
    public void click_submit_button_in_confirm_forgot_password_page() throws Throwable {
        clickElement("xpath","CFGbtnsubmitX");
    }
    @When("^Click out focus in confirm forgot password page$")
    public void click_out_focus_in_confirm_forgot_password_page() throws Throwable {
        clickElement("css","CFGUIcss");
    }

    @Then("^Show null msg confirm forgot pw text box$")
    public void show_null_msg_confirm_forgot_pw_text_box() throws Throwable {
        Thread.sleep(1000);
        verifyElementText("id","CFGerrormsgcodeID","");
    }

    @When("^Input null in confirm code forgot password text box$")
    public void input_null_in_confirm_code_forgot_password_text_box() throws Throwable {
        clearText("id","CFGcodeID");
        clickElement("xpath","CFGbtnsubmitX");
        Thread.sleep(3000);
    }

    @Then("^Show msgerrorA msg confirm forgot pw text box$")
    public void show_msgerrorA_msg_confirm_forgot_pw_text_box() throws Throwable {
        //Thread.sleep(1000);
        verifyElementText("id","CFGerrormsgcodeID","認証コードを入力してください。");
    }

    @Then("^Show msgerrorB msg confirm forgot pw text box$")
    public void show_msgerrorB_msg_confirm_forgot_pw_text_box() throws Throwable {
        //Thread.sleep(2000);
        verifyElementText("id","CFGerrormsgcodeID","認証コード6桁にしてください。");


    }

    @When("^Input Pass@(\\d+)#\\* in new password text box$")
    public void input_Pass_in_new_password_text_box(String arg1) throws Throwable {
        clearText("id","CFGnewpassID");
        inputText("id","CFGnewpassID","Pass@"+arg1+"#*");
        clickElement("xpath","CFGtoggleX");
        Thread.sleep(1000);
        clickElement("xpath","CFGtoggleX");
    }

    @Then("^Show null msg new password text box$")
    public void show_null_msg_new_password_text_box() throws Throwable {
        Thread.sleep(2000);
        verifyElementText("id", "CFGnewpasserrorID", "");
    }

    @When("^Input pass(\\d+) in new password text box$")
    public void input_pass_in_new_password_text_box(String arg1) throws Throwable {
        clearText("id","CFGnewpassID");
        inputText("id","CFGnewpassID","pass"+arg1);
        clickElement("xpath","CFGtoggleX");
        Thread.sleep(1000);
        clickElement("xpath","CFGtoggleX");
    }

    @Then("^Show 大文字を含むパスワードを入力してください。 msg new password text box$")
    public void show_大文字を含むパスワードを入力してください_msg_new_password_text_box() throws Throwable {
        //Thread.sleep(2000);
        verifyElementText("id", "CFGnewpasserrorID", "大文字を含むパスワードを入力してください。");
    }

    @When("^Input PASS(\\d+) in new password text box$")
    public void input_PASS_in_new_password_text_box(String arg1) throws Throwable {
        clearText("id","CFGnewpassID");
        inputText("id","CFGnewpassID","PASS"+arg1);
        clickElement("xpath","CFGtoggleX");
        Thread.sleep(1000);
        clickElement("xpath","CFGtoggleX");
    }

    @Then("^Show 小文字を含むパスワードを入力してください。 msg new password text box$")
    public void show_小文字を含むパスワードを入力してください_msg_new_password_text_box() throws Throwable {
        //Thread.sleep(2000);
        verifyElementText("id", "CFGnewpasserrorID", "小文字を含むパスワードを入力してください。");
    }

    @When("^Input Password in new password text box$")
    public void input_Password_in_new_password_text_box() throws Throwable {
        clearText("id","CFGnewpassID");
        inputText("id","CFGnewpassID","Password");
        clickElement("xpath","CFGtoggleX");
        Thread.sleep(1000);
        clickElement("xpath","CFGtoggleX");
    }

    @Then("^Show 数字を含むパスワードを入力してください。 msg new password text box$")
    public void show_数字を含むパスワードを入力してください_msg_new_password_text_box() throws Throwable {
        //Thread.sleep(2000);
        verifyElementText("id", "CFGnewpasserrorID", "数字を含むパスワードを入力してください。");
    }

    @When("^Input (\\d+) in new password text box$")
    public void input_in_new_password_text_box(String arg1) throws Throwable {
        clearText("id","CFGnewpassID");
        inputText("id","CFGnewpassID",arg1);
        clickElement("xpath","CFGtoggleX");
        Thread.sleep(1000);
        clickElement("xpath","CFGtoggleX");
    }

    @Then("^Show 英大文字、英小文字を含むパスワードを入力してください。 msg new password text box$")
    public void show_英大文字_英小文字を含むパスワードを入力してください_msg_new_password_text_box() throws Throwable {
        //Thread.sleep(2000);
        verifyElementText("id", "CFGnewpasserrorID", "英大文字、英小文字を含むパスワードを入力してください。");
    }

    @When("^Input password in new password text box$")
    public void input_password_in_new_password_text_box() throws Throwable {
        clearText("id","CFGnewpassID");
        inputText("id","CFGnewpassID","password");
        clickElement("xpath","CFGtoggleX");
        Thread.sleep(1000);
        clickElement("xpath","CFGtoggleX");
    }

    @Then("^Show 英大文字、数字を含むパスワードを入力してください。 msg new password text box$")
    public void show_英大文字_数字を含むパスワードを入力してください_msg_new_password_text_box() throws Throwable {
        //Thread.sleep(2000);
        verifyElementText("id", "CFGnewpasserrorID", "英大文字、数字を含むパスワードを入力してください。");
    }

    @When("^Input PASSWORD in new password text box$")
    public void input_PASSWORD_in_new_password_text_box() throws Throwable {
        clearText("id","CFGnewpassID");
        inputText("id","CFGnewpassID","PASSWORD");
        clickElement("xpath","CFGtoggleX");
        Thread.sleep(1000);
        clickElement("xpath","CFGtoggleX");
    }

    @Then("^Show 英小文字、数字を含むパスワードを入力してください。 msg new password text box$")
    public void show_英小文字_数字を含むパスワードを入力してください_msg_new_password_text_box() throws Throwable {
        //Thread.sleep(2000);
        verifyElementText("id", "CFGnewpasserrorID", "英小文字、数字を含むパスワードを入力してください。");
    }

    @Then("^Show ８文字以上のパスワードを入力してください。 msg new password text box$")
    public void show_８文字以上のパスワードを入力してください_msg_new_password_text_box() throws Throwable {
        //Thread.sleep(2000);
        verifyElementText("id", "CFGnewpasserrorID", "８文字以上のパスワードを入力してください。");
    }

    @When("^Input  in new password text box$")
    public void input_in_new_password_text_box() throws Throwable {
        clearText("id","CFGnewpassID");
    }

    @Then("^Show 新しいパスワードを入力してください。 msg new password text box$")
    public void show_新しいパスワードを入力してください_msg_new_password_text_box() throws Throwable {
        //Thread.sleep(2000);
        verifyElementText("id", "CFGnewpasserrorID", "新しいパスワードを入力してください。");
    }

    @When("^Input verify code in text box$")
    public void input_verify_code_in_text_box() throws Throwable {
        clearText("id","CFGcodeID");
        clearText("id","CFGnewpassID");
        getconfirmcode("hiepstg1.1");
        inputText("id","CFGcodeID",PropertiesFile.getPropValue("confirmationCode"));

    }

    @When("^Input new password in text box$")
    public void input_new_password_in_text_box() throws Throwable {
        inputText("id","CFGnewpassID",PropertiesFile.getPropValue("CFGnewpass4"));
        clickElement("xpath","CFGtoggleX");
        Thread.sleep(1000);
        clickElement("xpath","CFGtoggleX");
    }

    @Then("^Show popup reset password successfully$")
    public void show_popup_reset_password_successfully() throws Throwable {
        Thread.sleep(3000);
        verifyElementText("xpath","CFGpopupUIX","新しいパスワードを使ってログインしてください。");
    }

    @Then("^Click submit button in popup forgot pw successfully$")
    public void click_submit_button_in_popup_forgot_pw_successfully() throws Throwable {
        //Thread.sleep(3000);
        clickElement("xpath","CFGpopupbtncss");
        //driver.findElement(By.xpath("//a[@class='submit-mfa-btn theme-color-bg button']")).click();


    }
    @Then("^Click Out focus in forgot password page$")
    public void Click_Out_focus_in_forgot_password_page() throws Throwable {
        clickElement("id","FGlabelID");
    }
}