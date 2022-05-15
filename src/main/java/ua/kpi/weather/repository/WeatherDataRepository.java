package ua.kpi.weather.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import ua.kpi.weather.model.WeatherData;

public interface WeatherDataRepository extends ReactiveMongoRepository<WeatherData, String> {
}