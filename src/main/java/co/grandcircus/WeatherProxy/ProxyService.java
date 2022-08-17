package co.grandcircus.WeatherProxy;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProxyService {
	
	private RestTemplate request = new RestTemplate();
//	String testUrl = "https://api.weather.gov/points/39.7456,-97.0892";
	
	
	
	public ProxyResponse getForecast(String lat, String lon) {
		String url = "https://api.weather.gov/points/" + lat + "," + lon;
		String newURL = request.getForObject(url, PropertyResponse.class).getProperties().getForecast();
		ProxyResponse response = request.getForObject(newURL, PropertyResponse2.class).getProps2();
		return response;
	}
	
	public List<ProxyPeriod> getProxyPeriods(String lat, String lon) {
		String url = "https://api.weather.gov/points/" + lat + "," + lon;
		String newURL = request.getForObject(url, PropertyResponse.class).getProperties().getForecast();
		List<ProxyPeriod> response = request.getForObject(newURL, PropertyResponse2.class).getProps2().getPeriods();
	
		return response;
	}


}
