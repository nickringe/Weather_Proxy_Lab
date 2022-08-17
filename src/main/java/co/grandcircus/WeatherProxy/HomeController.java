package co.grandcircus.WeatherProxy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Autowired
	ProxyService service;
	
	@GetMapping("/forecast")
	public ProxyResponse getForecast(@RequestParam String lat, @RequestParam String lon) {
		
		return service.getForecast(lat, lon);
	}
	
	@GetMapping("/forecast/plus")
	public ProxyResponse getProxyPeriods(@RequestParam String lat, @RequestParam String lon) {
		Stats stats = new Stats();
		ProxyResponse proxyResponse = new ProxyResponse();
		
		proxyResponse.setPeriods(service.getProxyPeriods(lat, lon));
		
		double tempTotal = 0;
		ProxyPeriod hottest = proxyResponse.getPeriods().get(0);
		ProxyPeriod coolest = proxyResponse.getPeriods().get(0);
		
		for (ProxyPeriod pp : proxyResponse.getPeriods()) {
			tempTotal += pp.getTemperature();
			
			if(pp.getTemperature() < coolest.getTemperature()) {
				coolest = pp;
			}
			
			if(pp.getTemperature() > hottest.getTemperature()) {
				hottest = pp;
			}
		}
		
		int averageTemp = (int) (tempTotal / proxyResponse.getPeriods().size());
		
		stats.setAverageTemperature(averageTemp);
		stats.setColdestPeriod(coolest);
		stats.setHottestPeriod(hottest);
		
		proxyResponse.setStats(stats);
		
		//for testing purposes
//		System.out.println("Average " + stats.getAverageTemperature());
//		System.out.println("Coldest " + stats.getColdestPeriod().getName());
//		System.out.println("Hottest " + stats.getHottestPeriod().getName());
		
		return proxyResponse;
	}
	
	

}
