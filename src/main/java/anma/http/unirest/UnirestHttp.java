package anma.http.unirest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class UnirestHttp {

    private static String URL = "https://swapi.co/api/planets/1/";
    static String testJson = "{\"name\":\"Vasyl\", \"age\":\"56\"}";
    static String[] cats = {"Murzik", "Liza", "Bagira"};

    public static void main(String[] args) throws UnirestException, IOException, JSONException {
//        Map<String, Object> map = gson.fromJson(json, new TypeToken<Map<String, Object>>() {}.getType());

        HttpResponse<JsonNode> response = Unirest.get(URL).asJson();

        // Get object directly

        JSONObject jsonObject = response.getBody().getObject();
        String diameter = jsonObject.getString("diameter");
        System.out.println(diameter);

        // Get Object with GSON

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String responseBody = response.getBody().toString();
        Planet planet = gson.fromJson(responseBody, Planet.class);
        System.out.println(planet.getClimate());


    }
}
