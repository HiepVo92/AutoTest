package stepDefinition;

import Commons.SetupHelp;
import DataFile.PropertiesFile;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;


public class Step_05_calomamaIDpage extends SetupHelp {

    @Then("^Input email and pw of user do not have phone number$")
    public void input_email_and_pw_of_user_do_not_have_phone_number() throws Throwable {
        inputText("id","LGemailID", PropertiesFile.getPropValue("LGemailDoNotHaveDaTaHC"));
        inputText("id","LGpassID","Password123");
    }

    @Then("^Input email and pw of user has register phone number$")
    public void input_email_and_pw_of_user_has_register_phone_number() throws Throwable {
        inputText("id","LGemailID", PropertiesFile.getPropValue("LGemailPhoneNumber"));
        inputText("id","LGpassID","Password123");
    }
    @Then("^Go to MFA page successfully$")
    public void Go_to_MFA_page_successfully() throws Throwable {
        Thread.sleep(2000);
        verifyElementText("css", "MFAtitlecss", "SMSで2段階認証");
        verifyElementText("css","MFAtextUIcss","+********6109 宛のSMSに認証コードをお送りしました");
        verifyElementText("css", "MFAreSendCodecss", "認証コードを再送する");
    }
    @When("^Input phone number MFA$")
    public void Input_phone_number_MFA ()throws Throwable{
        Thread.sleep(5000);
        getCodeSMS();
        inputText("xpath","SMSinput1X",PropertiesFile.getPropValue("SMSnumber1"));
        inputText("xpath","SMSinput2X",PropertiesFile.getPropValue("SMSnumber2"));
        inputText("xpath","SMSinput3X",PropertiesFile.getPropValue("SMSnumber3"));
        inputText("xpath","SMSinput4X",PropertiesFile.getPropValue("SMSnumber4"));
        inputText("xpath","SMSinput5X",PropertiesFile.getPropValue("SMSnumber5"));
        inputText("xpath","SMSinput6X",PropertiesFile.getPropValue("SMSnumber6"));

    }
}
