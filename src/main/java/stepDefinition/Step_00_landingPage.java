package stepDefinition;

import Commons.SetupHelp;
import DataFile.PropertiesFile;
import cucumber.api.java.en.*;

public class Step_00_landingPage extends SetupHelp {

    @Given("^Navigate to landing page$")
    public void navigate_to_landing_page() throws Throwable {
        PropertiesFile.setPropertiesFile();
        openURL(PropertiesFile.getPropValue("browser"),PropertiesFile.getPropValue("urlprd"));

    }

    @Then("^Check UI landing page$")
    public void check_UI_landing_page() throws Throwable {
        Thread.sleep(1000);
        checkDisp("class","LDUIclass");
        verifyElementText("css","LDUIbtnlogincss","ログイン");
        verifyElementText("css","LDUIbtnregistercss","カロママプラスWebをはじめる");
        verifyElementText("css","LDUIbtnloginlinkcss","すでに利用を開始している方はログイン");
        verifyElementText("css","LDUItextcss","健診結果から自動判定！ 要注意項目がひとめで分かります\n" +
                "検査項目ごとに自動判定されるので、 特に注意するべき項目が何か、ひとめで分かります。 また、どのような病気にかかる可能性があるかも把握することができます。\n" +
                "結果を経年でグラフ化！数値の改善状況を見える化します\n" +
                "検査項目ごとに、結果を経年でグラフ化し、前回と比べて結果がよくなったのか、振り返ることが簡単にできます。\n" +
                "健診結果の読み方を助ける 充実したコンテンツ\n" +
                "馴染みのない疾患名や検査項目に関しては「用語集」で。結果の読み解き方に関しては「健診Q&A」であなたの正しい理解を助けます。");

    }

    @When("^Click login button in landing page$")
    public void click_login_button_in_landing_page() throws Throwable {
        clickElement("class","LDbtnloginClass");
    }

    @Then("^Go to login page successfully$")
    public void go_to_login_page_successfully() throws Throwable {
        Thread.sleep(1000);
        checkDisp("css","LGUI");
        verifyElementText("css","LGUIbtnforgotcss","パスワードをお忘れですか？");
        verifyElementText("css","LGUIbtnsubmitcss","ログインする");
        verifyElementText("css","LGUIbtnbackcss","戻る");
        verifyElementText("css","LGUItitlecss","カロママID（メールアドレス）とパスワードでログインしてください");

    }

    @Then("^Click back button in login page$")
    public void click_back_button_in_login_page() throws Throwable {
        clickElement("xpath","LGbtnbackX");
    }

    @Then("^Go to landing page successfully$")
    public void go_to_landing_page_successfully() throws Throwable {
        Thread.sleep(1000);
        checkDisp("class","LDUIclass");
    }

    @When("^Click login link in landing page$")
    public void click_login_link_in_landing_page() throws Throwable {
        clickElement("class","LDbtnloginlinkClass");
    }

    @When("^Click Register button in landing page$")
    public void click_Register_button_in_landing_page() throws Throwable {
        clickElement("class","LDbtnregisterClass");
    }

    @Then("^Go to check code page successfully$")
    public void go_to_check_code_page_successfully() throws Throwable {
        verifyElementText("css","CCUIcss","はじめる前に");
        verifyElementText("css","CCUIbtnbackcss","戻る");
        verifyElementText("css","CCUIheadercss","招待コードとパスコードの\n" +
                "ご準備をお願いします。");
        verifyElementText("css","CCUIcontentcss","カロママプラスWebをはじめるには、企業や健康保険組合等から事前に案内されている二つの情報が必要です。\n" +
                "・招待コード（数字7桁）\n" +
                "・パスコード（英数字記号の8桁)\n" +
                "利用登録時にこれら情報を入力後、ご本人様かどうかの認証を行います。\n" +
                "お手元にご準備の上お進みください。");
        verifyElementText("css","CCUItitlecss","以下の二つの情報が手元にありますか？");
        verifyElementText("xpath","CCUIcheckbox1X","招待コード（数字7桁）");
        verifyElementText("xpath","CCUIcheckbox2X","パスコード（英数字+記号の8桁）");
        verifyElementText("css","CCbtnsubmitcss","利用登録にすすむ");
    }

    @Then("^Click back button in check code page$")
    public void click_back_button_in_check_code_page() throws Throwable {
        clickElement("xpath","CCbtnbackX");
    }
    @Then("^Quit browser$")
    public void quit_browser() throws Throwable {
        Thread.sleep(1000);
        Quit();
    }
}
