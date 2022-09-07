package stepTest;

import org.testng.Assert;
import org.testng.annotations.*;
import utils.EmailUtils;

public class GetMail {
    private static EmailUtils emailUtils;
    @Test
    public static void connectToEmail() {
        try {
            emailUtils = new EmailUtils("vohaquanghiep.cld@gmail.com", "hiep10992", "smtp.gmail.com", EmailUtils.EmailFolder.INBOX);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
    }

}
