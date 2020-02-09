package anma.http.okhttp;

import anma.http.unirest.Planet;
import com.google.gson.Gson;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Arrays;

public class OkHttp {

    static final String URL = "https://swapi.co/api/planets/1/";

    static OkHttpClient getClient() {
        return new OkHttpClient.Builder()
                .connectionSpecs(Arrays.asList(ConnectionSpec.MODERN_TLS, ConnectionSpec.COMPATIBLE_TLS))
                .build();
    }

    static String run (String url) throws IOException {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder().url(url).build();

        Response response = client.newCall(request).execute();

        return response.body().string();

    }

    public static void main(String[] args) {

        Gson gson = new Gson();

        try {
            System.out.println(gson.fromJson(run(URL), Planet.class));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
