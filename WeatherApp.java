import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.net.HttpURLConnection;

public class WeatherApp {
    public static JSONObject getWeatherData(String locationName){
        JSONArray locationData = getLocation(locationName);
    }

    private static JSONArray getLocation(String locationName){
        locationName = locationName.replaceAll(" ", "+");
        String urlString = "https://api.open-meteo.com/v1/forecast?" + "latitude=" + latitude + "&longitude=" + longitude + "&hourly=temperature_2m,relativehumidity_2m,weathercode,windspeed_10m&timezone=America%2FLos_Angeles";

        try {
            HttpURLConnection conn = fetchApiResponse(urlString);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    privte static HttpURLConnection fetchApiResponse(String urlString) {
        try {

        }
    }
}
