package com.example.investment.api.Inquiry_api;

import org.springframework.beans.factory.annotation.Value;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class API {

    @Value("${data-portal-key}")
    private String dataPortalKey;

    String dataPortalUrl = "https://apis.data.go.kr/1160100/service/GetStockSecuritiesInfoService?ServiceKey=6vkAL8btLG4h51Af2JRQ5LUXImyRng8XzbfVmG1K7n2Vw0sY0D6BZmVUkVghiGzoR5pAHvnKdL5Xmrtw2fXDZw==&MobileOS=ETC&MobileApp=AppTest" ;

    public String getJsonFromUrl(String urlstr) {
        BufferedReader br = null;
        try {
            URL url = new URL(urlstr);
            HttpURLConnection urlconnection = (HttpURLConnection) url.openConnection();
            urlconnection.setRequestMethod("GET");
            br = new BufferedReader(new InputStreamReader(urlconnection.getInputStream(), StandardCharsets.UTF_8));
            String result;
            String line;
            for (result = ""; (line = br.readLine()) != null; result = result + line) {
            }
            return result;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return "";
    }

    public String test(){
        return getJsonFromUrl(dataPortalUrl + dataPortalKey + "&numOfRows=10000&resultType=json&basDt=20231130");
    }

}
