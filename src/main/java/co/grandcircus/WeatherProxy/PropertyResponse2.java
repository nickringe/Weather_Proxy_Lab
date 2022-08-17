package co.grandcircus.WeatherProxy;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PropertyResponse2 {
	
	@JsonProperty("properties")
	private ProxyResponse properties;

	public ProxyResponse getProps2() {
		return properties;
	}

	public void setPeriods(ProxyResponse properties) {
		this.properties = properties;
	}
}
