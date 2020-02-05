package com.service.notis1;

import com.util.notis1.Util;
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import static java.lang.System.getProperty;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Properties;
import javax.net.ssl.HttpsURLConnection;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;

public class TradeInquiryService {

    String dataformat = "CSV:CSV";
    String version = "1.0";

    public String getAllTradeData() throws Exception {

        String authorization = Util.getAuthorization();
        String nonce = Util.getNonce();
//        String msgId = Util.getMsgId();
        //CSV tradesInquiry =

        String postData = this.AllTradeRequestData();
        String tradeInquirytHost = "www.connect2nse.com";
//        String tradeInquirytHost = getProperty("token.host");
        String tradeInquiryEndpoint = "/notis-cm/trades-inquiry";
        //   String tokenRequestContentType = "application/x-www-form-urlencoded";
        String urlString = "https://" + tradeInquirytHost + tradeInquiryEndpoint;

        URL url = new URL(urlString);
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
//        connection.setRequestProperty("Content-Type", tokenRequestContentType);
        connection.setRequestProperty("Authorization", authorization);
        connection.setRequestProperty("nonce", nonce);
        connection.setDoOutput(true);

        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = postData.getBytes("utf-8");
            os.write(input, 0, input.length);
            os.flush();
            os.close();
        }

        String responseLine = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"))) {
            StringBuilder respone = new StringBuilder();
            responseLine = null;
            while ((responseLine = br.readLine()) != null) {
//                    System.out.println(responseLine);
                respone.append(responseLine.trim());
            }
            System.out.println(respone.toString());
//                br.close();
        }
        return responseLine;
    }

    /////   
    public String AllTradeRequestData() throws Exception {
//        String version = "1.0";
//        { "version": "1.0", "data": { "msgId": "00240201310140000001", "dataFormat": "CSV:CSV", "tradesInquiry": "0,ALL,," } }
//

//        FileReader reader = new FileReader("newproperties.properties");
//        Properties p = new Properties();
//        p.load(reader);
//        String tradeInquirytHost1 = PropertiesLoader.getPropValue("token");
//        System.out.println(tradeInquirytHost1);
        ObjectMapper mapper = new ObjectMapper();
        System.out.println("*****");
        ObjectNode data1 = mapper.createObjectNode();
        data1.put("msgId", Util.getMsgId());
        data1.put("dataFormat", dataformat);
        data1.put("tradesInquiry", "0,ALL,,");
        ObjectNode jsonData = mapper.createObjectNode();
        jsonData.put("version", version);
        jsonData.put("data", data1.toString());

        System.out.println(jsonData.toString());

        return jsonData.asText();
    }

    public static void main(String[] args) throws Exception {
        TradeInquiryService q = new TradeInquiryService();
        q.AllTradeRequestData();

    }

}
