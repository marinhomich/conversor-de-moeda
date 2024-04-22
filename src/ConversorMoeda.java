import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class ConversorMoeda {

    public String converteMoeda(){
        URI url = URI.create("https://v6.exchangerate-api.com/v6/2867bfd2b6b45f5e6dd3bd77/latest/USD");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(url).build();

        return "1";
    }
}
