package main;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.MapType;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author C. Plasencia
 */

public class APITarifa20AActual {
    
    public static final ObjectMapper MAPPER = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL);
    public static final MapType HASHMAP_MAPTYPE = MAPPER.getTypeFactory().constructMapType(LinkedHashMap.class, String.class, Object.class);
    
    //private static final String API_TOKEN = "x";
    private static final String MAIN_URL = "https://api.esios.ree.es/indicators/1013?start_date=#START#&end_date=#END#";
    
    public static String getPrecioActual() {
        Map<String,Object> data = conectarAPI();
        if (data.containsKey("indicator")) {
            Map<String,Object> indicator = (Map<String,Object>)data.get("indicator");
            if (indicator.containsKey("values")) {
                List<Map<String,Object>> values = (List<Map<String,Object>>)indicator.get("values");
                if (!values.isEmpty()) {
                    String resultado = "";
                    for (Map<String,Object> value : values) {
                        resultado += BigDecimal.valueOf((double) value.get("value")).divide(BigDecimal.valueOf(1000), 5, RoundingMode.HALF_UP) + " €/kWh";
                    }
                    return resultado;
                }
            }
        }
        return "";
    }
    
    private static Map<String,Object> conectarAPI() {
        try {
            String tmpUrl = MAIN_URL.replace("#START#", getInicioDiayHoraActual()).replace("#END#", getFinDiayHoraActual());
            URL url = new URL(tmpUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Accept", "application/json; application/vnd.esios-api-v1+json");
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Host", "api.esios.ree.es");
            System.out.println("hola");
            con.setRequestProperty("Authorization", "Token token=" + APITarifa20A.API_TOKEN);
            int responseCode = con.getResponseCode();
            if (responseCode != 200) { 
                System.err.println("Error REST Call: " + inputStreamtoString(con.getErrorStream()));
            } else {
                return MAPPER.readValue(con.getInputStream(), HASHMAP_MAPTYPE);
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
        return null;
    }
    
    private static String inputStreamtoString(InputStream fi) throws Exception {
        ByteArrayOutputStream bout=new ByteArrayOutputStream();
        byte buffer[] = new byte[1000];
        int len;
        while ((len = fi.read(buffer)) != -1 ) {
                bout.write(buffer, 0, len);
        }
        bout.close();
        fi.close();
        return bout.toString();
    }
    
    /**
     * Obtiene el inicio del día actual
     * @return 
     */
    private static String getInicioDiayHoraActual() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:00:00");
        return now.format(formatter).replace(" ", "T");
    }
    
    /**
     * Obtiene el fin del día actual
     * @return 
     */
    private static String getFinDiayHoraActual() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:59:00");
        return now.format(formatter).replace(" ", "T");
    }   
}