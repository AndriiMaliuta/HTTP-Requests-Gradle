package anma.http.net;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Core {

    public static void main(String[] args) throws IOException {

        URL url = new URL("http://example.com/");

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");

        Map<String, String> parameters = new HashMap<>();

        parameters.put("param1", "value");

        connection.setDoOutput(true);

        DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());

//        outputStream.writeBytes(ParameterStringBuilder.getParamsString(parameters));


    }
}
