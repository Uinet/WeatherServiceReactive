package ua.kpi.weather.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.kpi.weather.model.WeatherData;

public interface WeatherDataService {
    Mono<WeatherData> save(WeatherData weatherData);
    Flux<WeatherData> getAllWeatherData();
}
