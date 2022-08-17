package co.grandcircus.WeatherProxy;



import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProxyResponse {
	
	@JsonProperty("periods")
	private List<ProxyPeriod> periods;
	
	private Stats stats;
	private int numberOfPeriods;

	public ProxyResponse() {

	}

	public ProxyResponse(List<ProxyPeriod> periods, Stats stats) {
		this.periods = periods;
		this.stats = stats;
	}

	public Stats getStats() {
		return stats;
	}

	public void setStats(Stats stats) {
		this.stats = stats;
	}
	

	public int getNumberOfPeriods() {
		int counter = 0;
		for(ProxyPeriod p : periods) {
			counter++;
		}
		return counter;
	}

	public List<ProxyPeriod> getPeriods() {
		return periods;
	}

	public void setPeriods(List<ProxyPeriod> periods) {
		this.periods = periods;
	}
	
	

}
