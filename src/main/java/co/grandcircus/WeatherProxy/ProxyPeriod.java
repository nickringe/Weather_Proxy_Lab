package co.grandcircus.WeatherProxy;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProxyPeriod {

	@JsonProperty("number")
	private int number;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("isDaytime")
	private Boolean isDaytime;
	
	@JsonProperty("temperature")
	private int temperature;
	
	@JsonProperty("temperatureUnit")
	private String temperatureUnit;
	
	@JsonProperty("detailedForecast")
	private String detailedForecast;
	
	private double temperatureCelsius;
	
	public ProxyPeriod() {
		
	}

	public ProxyPeriod(int number, String name, Boolean isDaytime, int temperature, String temperatureUnit,
			String detailedForecast, double temperatureCelsius) {
		this.number = number;
		this.name = name;
		this.isDaytime = isDaytime;
		this.temperature = temperature;
		this.temperatureUnit = temperatureUnit;
		this.detailedForecast = detailedForecast;
		this.temperatureCelsius = temperatureCelsius;
	}

	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsDaytime() {
		return isDaytime;
	}

	public void setIsDaytime(Boolean isDaytime) {
		this.isDaytime = isDaytime;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public String getTemperatureUnit() {
		return temperatureUnit;
	}

	public void setTemperatureUnit(String temperatureUnit) {
		this.temperatureUnit = temperatureUnit;
	}

	public String getDetailedForecast() {
		return detailedForecast;
	}

	public void setDetailedForecast(String detailedForecast) {
		this.detailedForecast = detailedForecast;
	}
	
	public int getTemperatureCelsius() {
		return (int) ((temperature-32)*(0.559));
	}
	
	public void setTemperatureCelsius(double temperatureCelsius) {
		this.temperatureCelsius = temperatureCelsius;
	}
	
	
}
