package co.grandcircus.WeatherProxy;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Props {
	
	@JsonProperty("forecast")
	public String forecast;

	public String getForecast() {
		return forecast;
	}

	public void setForecast(String forecast) {
		this.forecast = forecast;
	}

	public Props() {
	
	}

	
	public Props(String forecast) {
		this.forecast = forecast;
	}

	
}
