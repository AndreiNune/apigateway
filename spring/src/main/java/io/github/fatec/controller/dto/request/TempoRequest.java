package io.github.fatec.controller.dto.request;

public class TempoRequest {
    private String latitude;
    private String longitude;
    private String generationtime_ms;
    private String utc_offset_seconds;
    private String timezone;
    private String timezone_abbreviation;
    private String elevation;
    private CurrentWeatherUnits current_weather_units;
    private CurrentWeather current_weather;

    public TempoRequest() {}

    public TempoRequest(String latitude, String longitude, String generationtime_ms, String utc_offset_seconds, String timezone, String timezone_abbreviation, String elevation, CurrentWeatherUnits current_weather_units, CurrentWeather current_weather) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.generationtime_ms = generationtime_ms;
        this.utc_offset_seconds = utc_offset_seconds;
        this.timezone = timezone;
        this.timezone_abbreviation = timezone_abbreviation;
        this.elevation = elevation;
        this.current_weather_units = current_weather_units;
        this.current_weather = current_weather;
    }

    public String latitude() { return latitude; }
    public String longitude() { return longitude; }
    public String getGenerationtime_ms() { return generationtime_ms; }
    public String getUtc_offset_seconds() { return utc_offset_seconds; }
    public String getTimezone() { return timezone; }
    public String getTimezone_abbreviation() { return timezone_abbreviation; }
    public String getElevation() { return elevation; }
    public CurrentWeatherUnits getCurrent_weather_units() { return current_weather_units; }
    public CurrentWeather getCurrent_weather() { return current_weather; }

    public void setLatitude(String latitude) { this.latitude = latitude; }
    public void setLongitude(String longitude) { this.longitude = longitude; }
    public void setGenerationtime_ms(String generationtime_ms) { this.generationtime_ms = generationtime_ms; }
    public void setUtc_offset_seconds(String utc_offset_seconds) { this.utc_offset_seconds = utc_offset_seconds; }
    public void setTimezone(String timezone) { this.timezone = timezone; }
    public void setTimezone_abbreviation(String timezone_abbreviation) { this.timezone_abbreviation = timezone_abbreviation; }
    public void setElevation(String elevation) { this.elevation = elevation; }
    public void setCurrent_weather_units(CurrentWeatherUnits current_weather_units) { this.current_weather_units = current_weather_units; }
    public void setCurrent_weather(CurrentWeather current_weather) { this.current_weather = current_weather; }
}
