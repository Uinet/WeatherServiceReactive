package ua.kpi.weather.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.Instant;

@Data
@Document("weather_data")
public class WeatherData {
    @Id
    private String id;

    private double temperature;

    private double humidity;

    private double pressure;

    private Instant creationDate = Instant.now();
}
