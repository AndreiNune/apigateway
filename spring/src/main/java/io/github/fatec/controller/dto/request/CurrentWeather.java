package io.github.fatec.controller.dto.request;

public class CurrentWeather {
    private String time;
    private Integer interval;
    private Double temperature;
    private Double windspeed;
    private Integer winddirection;
    private Integer is_day;
    private Integer weathercode;

    public CurrentWeather() {}

    public CurrentWeather(String time, Integer interval, Double temperature, Double windspeed, Integer winddirection, Integer is_day, Integer weathercode) {
        this.time = time;
        this.interval = interval;
        this.temperature = temperature;
        this.windspeed = windspeed;
        this.winddirection = winddirection;
        this.is_day = is_day;
        this.weathercode = weathercode;
    }

    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }
    public Integer getInterval() { return interval; }
    public void setInterval(Integer interval) { this.interval = interval; }
    public Double getTemperature() { return temperature; }
    public void setTemperature(Double temperature) { this.temperature = temperature; }
    public Double getWindspeed() { return windspeed; }
    public void setWindspeed(Double windspeed) { this.windspeed = windspeed; }
    public Integer getWinddirection() { return winddirection; }
    public void setWinddirection(Integer winddirection) { this.winddirection = winddirection; }
    public Integer getIs_day() { return is_day; }
    public void setIs_day(Integer is_day) { this.is_day = is_day; }
    public Integer getWeathercode() { return weathercode; }
    public void setWeathercode(Integer weathercode) { this.weathercode = weathercode; }
}