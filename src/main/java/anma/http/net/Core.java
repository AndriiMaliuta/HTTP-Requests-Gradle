package anma.http.net;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Core {

    public static void main(String[] args) throws IOException {

        URL url = new URL("http://example.com/");

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");

        System.out.println("===================");
        System.out.println(connection.getResponseCode() + " " + connection.getResponseMessage());



    }
}
