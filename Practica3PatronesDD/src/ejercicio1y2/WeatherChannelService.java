package ejercicio1y2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Objects;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class WeatherChannelService implements ClimaOnline {
	private String apiKey;

	public WeatherChannelService(String apiKey) {
		Objects.requireNonNull(apiKey);

		if (apiKey.isEmpty() || apiKey.isBlank()) {
			throw new RuntimeException("ApiKey vacia");
		}

		this.apiKey = apiKey;
	}

	@Override
	public double temperatura() {
		HttpClient httpClient = HttpClient.newHttpClient();
		String url = "https://api.openweathermap.org/data/2.5/weather?q=viedma,032&lang=sp&APPID=" + this.apiKey
				+ "&units=metric";
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
		HttpResponse<String> response = null;
		try {
			response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
		} catch (IOException e) {

		} catch (InterruptedException e) {

		}
		String jsonString = response.body();
		Gson gson = new GsonBuilder().create();
		var jsonObject = gson.fromJson(jsonString, JsonObject.class);
		double temp = jsonObject.getAsJsonObject("main").getAsJsonObject().get("temp").getAsInt();
		return temp;
	}
}
