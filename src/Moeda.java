import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Moeda {
    private String apiKey = "2867bfd2b6b45f5e6dd3bd77";

    public String converteMoeda(String CurrencyOne, String CurrencyTwo, double Amount){
        URI url = URI.create("https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + CurrencyOne + "/" + CurrencyTwo + "/" + Amount);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(url).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            MoedaAPI resultadoConversao = gson.fromJson(response.body(), MoedaAPI.class);
            return "Valor " + Amount + " ["+ CurrencyOne +"] corresponde ao valor final de =>>> " + resultadoConversao.conversion_result() + "[" +CurrencyTwo+ "]";
        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter o resultado");
        }
    }


}
