/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service.notis1;

import com.util.notis1.Util;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author trainee4
 */
@Path("/notis")
public class TokenService {

    private static final String GRANT_TYPE_URL_DATA = "grant_type=client_credentials";

    @POST
    // @Consumes(MediaType.APPLICATION_JSON)
    @Path("/login")
    public String login() throws IOException, Exception {
//        String consumerKey = "consumer_key";
//        String consumerSecret = "consuer_secret";
//        String authorization = consumerKey + consumerSecret;

        String authorization = Util.getAuthorization();
        String nonce = Util.getNonce();

        String tokenRequestHost = "www.connect2nse.com";
        String tokenRequestEndpoint = "/token";
        String tokenRequestContentType = "application/x-www-form-urlencoded";
        String urlString = "https://" + tokenRequestHost + tokenRequestEndpoint;
        System.out.println(urlString);
        URL url = new URL(urlString);
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();

        Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
        TrustManager[] trustAllCerts = new TrustManager[]{
            new X509TrustManager() {

                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return null;
                }

                public void checkClientTrusted(
                        java.security.cert.X509Certificate[] certs, String authType) {
                }

                public void checkServerTrusted(
                        java.security.cert.X509Certificate[] certs, String authType) {
                }
            }
        };
        // Install the all-trusting trust manager
        try {
            SSLContext sc = SSLContext.getInstance("TLSv1.2");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //System.setProperty("https.protocols", "TLSv1.2,TLSv1.1,SSLv3");

        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", tokenRequestContentType);
        connection.setRequestProperty("Authorization", authorization);
        connection.setRequestProperty("nonce", nonce);

        System.out.println("///////////");
        // https://stackoverflow.com/questions/40574892/how-to-send-post-request-with-x-www-form-urlencoded-body
        byte[] postData = GRANT_TYPE_URL_DATA.getBytes(StandardCharsets.UTF_8);

        int postDataLength = postData.length;
        System.out.println("12334");
        connection.setRequestProperty("charset", "utf-8");
        connection.setRequestProperty("Content-Length", Integer.toString(postDataLength));

//        try (DataOutputStream wr = new DataOutputStream(connection.getOutputStream())) {
//            wr.write(postData);
//        }
        //       System.setProperty("https.protocols", "TLSv1.2");
        connection.setDoOutput(true);

        System.out.println("*****---***");

        try (OutputStream os = connection.getOutputStream()) {
            os.write(postData);
            os.flush();
            os.close();
            // For POST only - END
        }

        int responseCode = connection.getResponseCode();
        System.out.println("POST Response Code :: " + responseCode);

        return this.postTokenRequest(connection);
        //     return null;

//        String response = new String (sendGetRequest("", "", 10000));
//        System.out.println("Reponse : "+response);
//        return  response;
    }

    private String postTokenRequest(HttpsURLConnection connection) {
        // https://stackoverflow.com/questions/34899480/how-to-read-json-data-from-httpurlconnection

        System.out.println("/*/*/*/*//**");
        String input;
        String accessToken = "";
        if (connection != null) {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((input = br.readLine()) != null) {
                    System.out.println(input);
                }
                br.close();

                // https://www.danvega.dev/blog/2017/07/05/read-json-data-spring-boot-write-database/
                // https://attacomsian.com/blog/jackson-convert-json-string-to-json-node
                // sample response data => { "access_token":
                // "ee1073de-45d0-4040-b9c2-eddfa80280c0", "token_type": "bearer", "expires_in":
                // "3600", "scope": "api_scope" }
                ObjectMapper mapper = new ObjectMapper();
                JsonNode node = mapper.readTree(input);
                accessToken = node.get("access_token").asText();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return accessToken;
    }

    public byte[] sendGetRequest(String request_url, String req, int timeout) {
        HttpsURLConnection conn = null;
        BufferedReader rd = null;
        OutputStreamWriter wr = null;
        BufferedInputStream rds = null;
        byte outData[] = null;
        try {
            if (true) {
                //System.setProperty("https.protocols", proxyProtocol);
                System.setProperty("https.proxyHost", "192.168.29.199");
                System.setProperty("https.proxyPort", "3128");
            }
            String nonce = Util.getNonce();
            String tokenRequestHost = "www.connect2nse.com";
            String tokenRequestEndpoint = "/token";
            String tokenRequestContentType = "application/x-www-form-urlencoded";
            String authorization = "Basic YTQyNDE1NTE5MGI5NDU2NjgxZjIwYzQxYWI3NGJhMTU6NWYwNTNmYmFmYWJjNDRlMDkwNDVlYmI5YzgxZmRhODI=";
            byte[] postData = GRANT_TYPE_URL_DATA.getBytes(StandardCharsets.UTF_8);

            int postDataLength = postData.length;

            URL url = new URL("https://www.connect2nse.com/token");
            SSLContext sc = SSLContext.getInstance("TLSv1.2"); //$NON-NLS-1$
            sc.init(null, null, new java.security.SecureRandom());
            String request = req;
            conn = (HttpsURLConnection) url.openConnection();
            conn.setSSLSocketFactory(sc.getSocketFactory());
            conn.setDoOutput(true);
            conn.setConnectTimeout(timeout);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", tokenRequestContentType);
            conn.setRequestProperty("Authorization", authorization);
            conn.setRequestProperty("nonce", nonce);
            conn.setRequestProperty("charset", "utf-8");
            conn.setRequestProperty("Content-Length", Integer.toString(postDataLength));
            wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(postData.toString());
            wr.flush();
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            byte[] buff = new byte[1024];
            int len;
            rds = new BufferedInputStream(conn.getInputStream());
            ByteArrayOutputStream fout = new ByteArrayOutputStream();
            while ((len = rds.read(buff)) != -1) {
                fout.write(buff, 0, len);
            }
            outData = fout.toByteArray();
            fout.close();
        } catch (MalformedURLException e) {
            System.err.println("MalformedURLException" + e);
        } catch (IOException e) {
            System.err.println("IOException" + e);
        } catch (Exception e) {
            System.err.println("Exception" + e);
        } finally {
            try {
                if (rd != null) {
                    rd.close();
                }
                if (wr != null) {
                    wr.close();
                }
                conn = null;
            } catch (Exception e) {
                System.err.println("Error in closing connection " + e);
            }
        }
        return outData;
    }

//    public static  void main(String args[]){
//    
//        TokenService service = new TokenService();
//        String response = new String (service.sendGetRequest("", "", 10000));
//        System.out.println("Reponse : "+response);
//    }
}
