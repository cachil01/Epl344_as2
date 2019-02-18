package cy.ac.ucy.cs.epl344.openweathermap;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MultivaluedMap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class RestClient {

	private static final String REST_URI = "https://api.openweathermap.org";
	private static final String APPID = "b087174a1461939d0982a8352f27fc9a";
	private Client client;
	private WebTarget webTarget;

	public RestClient(String uri) {
		client = ClientBuilder.newClient();
		webTarget = client.target(uri);
	}

	public void getWeatherForecast(String city) {
		WebTarget target = webTarget.path("data").path("2.5").path("weather").queryParam("q", city).queryParam("units","metric").queryParam("APPID", APPID);
		// Prepare HTTP GET request 
		Builder builder = target.request();
		// define accepted media types
		builder.accept(MediaType.APPLICATION_JSON);
		Response response = builder.get();
		
		String body = response.readEntity(String.class);
		// for testing: print whole json in beautified format
		//Gson gson = new GsonBuilder().setPrettyPrinting().create();
		//CurrentWeather currWeather = gson.fromJson(body, CurrentWeather.class);
		//System.out.println(gson.toJson(currWeather));
		
		// create gson object
		Gson gsonObj = new Gson();
		// parse json string and load it into CurrentWeather class 
		CurrentWeather currWeather = gsonObj.fromJson(body, CurrentWeather.class);
		Gson gsonObj2 = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(gsonObj2.toJson(currWeather.getWeather().get(0)));
		System.out.println(gsonObj2.toJson(currWeather.getMain()));
    	}

	public void getCurrentWeather(String city) {
		WebTarget target = webTarget.path("data").path("2.5").path("weather").queryParam("q", city).queryParam("units","metric").queryParam("APPID", APPID);
		// Prepare HTTP GET request 
		Builder builder = target.request();
		// define accepted media types
		builder.accept(MediaType.APPLICATION_JSON);
		Response response = builder.get();
		
		String body = response.readEntity(String.class);
		// for testing: print whole json in beautified format
		//Gson gson = new GsonBuilder().setPrettyPrinting().create();
		//CurrentWeather currWeather = gson.fromJson(body, CurrentWeather.class);
		//System.out.println(gson.toJson(currWeather));
		
		// create gson object
		Gson gsonObj = new Gson();
		// parse json string and load it into CurrentWeather class 
		CurrentWeather currWeather = gsonObj.fromJson(body, CurrentWeather.class);
		Gson gsonObj2 = new GsonBuilder().setPrettyPrinting().create();
		System.out.println(gsonObj2.toJson(currWeather.getWeather().get(0)));
		System.out.println(gsonObj2.toJson(currWeather.getMain()));
    	}
	
	public static void main(String args[]) {
		RestClient restclient = new RestClient(REST_URI);
		if(args.length == 0)
			System.out.println("No arguments were given");
		else {
			if((args[0].equals("-currentWeather") || args[0].equals("-weatherForecast")) && args.length != 2)
				System.out.println("Missing arguments");
			else if(args[0].equals("-currentWeather"))
				restclient.getCurrentWeather(args[1]);
			else if(args[0].equals("-weatherForecast"))
				restclient.getWeatherForecast(args[1]);
		}

	}
}
