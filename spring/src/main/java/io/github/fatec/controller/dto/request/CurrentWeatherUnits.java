package io.github.fatec.controller.dto.request;

public class CurrentWeatherUnits {
    private String time;
    private String interval;
    private String temperature;
    private String windspeed;
    private String winddirection;
    private String is_day;
    private String weathercode;

    public CurrentWeatherUnits() {}

    public CurrentWeatherUnits(String time, String interval, String temperature, String windspeed, String winddirection, String is_day, String weathercode) {
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
    public String getInterval() { return interval; }
    public void setInterval(String interval) { this.interval = interval; }
    public String getTemperature() { return temperature; }
    public void setTemperature(String temperature) { this.temperature = temperature; }
    public String getWindspeed() { return windspeed; }
    public void setWindspeed(String windspeed) { this.windspeed = windspeed; }
    public String getWinddirection() { return winddirection; }
    public void setWinddirection(String winddirection) { this.winddirection = winddirection; }
    public String getIs_day() { return is_day; }
    public void setIs_day(String is_day) { this.is_day = is_day; }
    public String getWeathercode() { return weathercode; }
    public void setWeathercode(String weathercode) { this.weathercode = weathercode; }
}
