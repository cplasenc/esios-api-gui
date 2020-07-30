package main;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.MapType;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

/**
 *
 * @author C. Plasencia
 */

public class APITarifa20A {
    
    public static final ObjectMapper MAPPER = new ObjectMapper().setSerializationInclusion(Include.NON_NULL);
    public static final MapType HASHMAP_MAPTYPE = MAPPER.getTypeFactory().constructMapType(LinkedHashMap.class, String.class, Object.class);
    
    private static final String API_TOKEN = "x";
    private static final String MAIN_URL = "https://api.esios.ree.es/indicators/1013?start_date=#START#&end_date=#END#";
    
    public static Map<String,String> getPrecioyHoras() {
        Map<String,Object> data = conectarAPI();
        if (data.containsKey("indicator")) {
            Map<String,Object> indicator = (Map<String,Object>)data.get("indicator");
            if (indicator.containsKey("values")) {
                List<Map<String,Object>> values = (List<Map<String,Object>>)indicator.get("values");
                if (!values.isEmpty()) {
                    String resultado = "";
                    double minPrecio = Double.MAX_VALUE;
                    double maxPrecio = -1;
                    for (Map<String,Object> value : values) {
                        String dateTime = String.valueOf(value.get("datetime")).split("T")[1].split(":")[0];
                        dateTime = getHora(dateTime, 0) + "h - " + getHora(dateTime, 1) + "h";
                        resultado += dateTime + "  -  Precio: " + BigDecimal.valueOf((double) value.get("value")).divide(BigDecimal.valueOf(1000), 5, RoundingMode.HALF_UP) + " €/kWh" + "\n";
                        minPrecio = Math.min(minPrecio, Double.valueOf(String.valueOf(value.get("value"))));
                        maxPrecio = Math.max(maxPrecio, Double.valueOf(String.valueOf(value.get("value"))));
                    }
                    Map<String,String> resultados = new HashMap<>();
                    resultados.put("result", resultado);
                    resultados.put("min", BigDecimal.valueOf(minPrecio).divide(BigDecimal.valueOf(1000), 5, RoundingMode.HALF_UP).toString() + " €/kWh");
                    resultados.put("max", BigDecimal.valueOf(maxPrecio).divide(BigDecimal.valueOf(1000), 5, RoundingMode.HALF_UP).toString() + " €/kWh");
                    return resultados;
                }
            }
        }
        return null;
    }
    
    /**
     * Consulta a la API de Red Eléctrica Española
     * @return 
     */
    private static Map<String,Object> conectarAPI() {
        try {
            String tmpUrl = MAIN_URL.replace("#START#", getFechaInicio()).replace("#END#", getFechaFin());
            URL url = new URL(tmpUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Accept", "application/json; application/vnd.esios-api-v1+json");
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Host", "api.esios.ree.es");
            con.setRequestProperty("Authorization", "Token token=" + API_TOKEN);
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
     * Obtiene el principio del día
     * @return 
     */
    private static String getFechaInicio() {
        LocalDateTime now = LocalDate.now().atStartOfDay();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:00:00");
        return now.format(formatter).replace(" ", "T");
    }
    
    /**
     * Obtiene el fin del día
     * @return 
     */
    private static String getFechaFin() {
        LocalDateTime now = LocalDate.now().atTime(LocalTime.MAX);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:59:00");
        return now.format(formatter).replace(" ", "T");
    }
    
    private static String getHora(String ini, int extra) {
        int siguienteHora = Integer.valueOf(ini) + extra;
        if (siguienteHora < 10) {
            return "0" + siguienteHora;
        }
        return String.valueOf(siguienteHora);
    }    
}
