package anma.http.unirest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UnirestHttp {

    private static String URL = "https://swapi.co/api/planets/1/";

    static String testJson = "{\"name\":\"Vasyl\", \"age\":\"56\"}";

    static String[] cats = {"Murzik", "Liza", "Bagira"};

    public static void main(String[] args) throws UnirestException {

//        Map<String, Object> map = gson.fromJson(json, new TypeToken<Map<String, Object>>() {}.getType());

        HttpResponse<JsonNode> response = Unirest.get(URL).asJson();

        Planet planet = (Planet) response.getBody();

//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//        Person vasyl = gson.fromJson(testJson, Person.class);
//        Planet planet = gson.fromJson(URL, Planet.class);

        System.out.println("==========");
        System.out.println();

    }
}
