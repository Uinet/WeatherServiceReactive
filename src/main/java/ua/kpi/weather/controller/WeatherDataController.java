package ua.kpi.weather.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.kpi.weather.model.WeatherData;
import ua.kpi.weather.service.WeatherDataService;

@RestController
@Slf4j
public class WeatherDataController {

    @Autowired
    WeatherDataService weatherDataService;

    @GetMapping(value = "/weather", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<WeatherData> getAllWeatherData(){
        return weatherDataService.getAllWeatherData();
    }

    @PostMapping("/weather")
    public Mono<WeatherData> saveWeather(@RequestBody WeatherData weatherData){
        System.out.println(weatherData.getHumidity());
        return weatherDataService.save(weatherData);
    }
}
