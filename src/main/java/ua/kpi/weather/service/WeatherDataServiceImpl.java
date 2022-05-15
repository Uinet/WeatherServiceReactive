package ua.kpi.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.kpi.weather.model.WeatherData;
import ua.kpi.weather.repository.WeatherDataRepository;

@Service
public class WeatherDataServiceImpl implements WeatherDataService{

    @Autowired
    WeatherDataRepository weatherDataRepository;

    @Override
    public Mono<WeatherData> save(WeatherData weatherData){
        return weatherDataRepository.save(weatherData);
    }

    @Override
    public Flux<WeatherData> getAllWeatherData(){
        return weatherDataRepository.findAll();
    }
}
