package com.gmail.api;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.GeneralSecurityException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import DataFile.PropertiesFile;
import com.google.api.client.util.Base64;
import org.json.JSONObject;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.StringUtils;
import com.google.api.services.gmail.Gmail;
import com.google.api.services.gmail.model.ListMessagesResponse;
import com.google.api.services.gmail.model.Message;
public class GmailAPI {
    private static Character Number1,Number2,Number3,Number4,Number5,Number6;
    private static final String APPLICATION_NAME = "Gmail API Java Quickstart";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final String user = "me";
    static Gmail service = null;
    private static File filePath = new File(System.getProperty("user.dir") + "/credentials.json");

    public static void main(String[] args) throws IOException, GeneralSecurityException {

        getGmailService();

        getMailBody("Google");

    }

    public static void getMailBody(String searchString) throws IOException {
        PropertiesFile.setPropertiesFile();
        // Access Gmail inbox

        Gmail.Users.Messages.List request = service.users().messages().list(user).setQ(searchString);

        ListMessagesResponse messagesResponse = request.execute();
        request.setPageToken(messagesResponse.getNextPageToken());

        // Get ID of the email you are looking for
        String messageId = messagesResponse.getMessages().get(0).getId();

        Message message = service.users().messages().get(user, messageId).execute();
        // Print email body
//        String emailBody = StringUtils
//                .newStringUtf8(Base64.decodeBase64(message.getPayload().getParts().get(0).getBody().getData()));
        String emailVerifyCode = message.toString();
        Pattern pattern = Pattern.compile("：((?:\\d{6}))");
        Matcher matcher = pattern.matcher(emailVerifyCode);
        matcher.find();
        String confirmationCode1;
        confirmationCode1 = matcher.group(1);
        System.out.println(confirmationCode1);
        PropertiesFile.setPropValue("confirmationCodeSMS",confirmationCode1);
        Number1 = confirmationCode1.charAt(0);
        PropertiesFile.setPropValue("SMSnumber1", String.valueOf(Number1));
        Number2 = confirmationCode1.charAt(1);
        PropertiesFile.setPropValue("SMSnumber2", String.valueOf(Number2));
        Number3 = confirmationCode1.charAt(2);
        PropertiesFile.setPropValue("SMSnumber3", String.valueOf(Number3));
        Number4 = confirmationCode1.charAt(3);
        PropertiesFile.setPropValue("SMSnumber4", String.valueOf(Number4));
        Number5 = confirmationCode1.charAt(4);
        PropertiesFile.setPropValue("SMSnumber5", String.valueOf(Number5));
        Number6 = confirmationCode1.charAt(5);
        PropertiesFile.setPropValue("SMSnumber6", String.valueOf(Number6));


    }

    public static Gmail getGmailService() throws IOException, GeneralSecurityException {
        PropertiesFile.setPropertiesFile();
        InputStream in = new FileInputStream(filePath); // Read credentials.json
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        // Credential builder

        Credential authorize = new GoogleCredential.Builder().setTransport(GoogleNetHttpTransport.newTrustedTransport())
                .setJsonFactory(JSON_FACTORY)
                .setClientSecrets(clientSecrets.getDetails().getClientId().toString(),
                        clientSecrets.getDetails().getClientSecret().toString())
                .build().setAccessToken(getAccessToken()).setRefreshToken(
                        "YOUR_REFRESH_TOKEN");//Replace this

        // Create Gmail service
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        service = new Gmail.Builder(HTTP_TRANSPORT, JSON_FACTORY, authorize)
                .setApplicationName(GmailAPI.APPLICATION_NAME).build();

        return service;
    }

    private static String getAccessToken() {

        try {
            Map<String, Object> params = new LinkedHashMap<>();
            params.put("grant_type", "refresh_token");
            params.put("client_id", "591399026752-rat6q6bp1oddbth56jk57glcn12vik8e.apps.googleusercontent.com"); //Replace this
            params.put("client_secret", "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"); //Replace this
            params.put("refresh_token",
                    "1//0ekMRj3rWxCPpCgYIARAAGA4SNwF-L9IrjYimcfDr3mpwqZb8pvIbtCL9hHt75Fu9A-kKoghzt6eLC112N3Q3SKbh4nwBHU4y6qg"); //Replace this

            StringBuilder postData = new StringBuilder();
            for (Map.Entry<String, Object> param : params.entrySet()) {
                if (postData.length() != 0) {
                    postData.append('&');
                }
                postData.append(URLEncoder.encode(param.getKey(), "UTF-8"));
                postData.append('=');
                postData.append(URLEncoder.encode(String.valueOf(param.getValue()), "UTF-8"));
            }
            byte[] postDataBytes = postData.toString().getBytes("UTF-8");

            URL url = new URL("https://accounts.google.com/o/oauth2/token");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setDoOutput(true);
            con.setUseCaches(false);
            con.setRequestMethod("POST");
            con.getOutputStream().write(postDataBytes);

            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuffer buffer = new StringBuffer();
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                buffer.append(line);
            }

            JSONObject json = new JSONObject(buffer.toString());
            String accessToken = json.getString("access_token");
            return accessToken;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
