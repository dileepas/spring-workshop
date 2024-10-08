package com.example.demo.types;

import java.time.LocalDateTime;
import java.util.List;

public class Departure {
    private String destination;
    private int direction_code;
    private String direction;
    private String state;
    private String display;
    private String scheduled;
    private String expected;
    private Journey journey;
    private StopArea stop_area;
    private StopPoint stop_point;
    private Line line;
    private List<Object> deviations;  // Assuming deviations is an empty array, we use Object. Adjust type if known.

    // Getters and Setters
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDirection_code() {
        return direction_code;
    }

    public void setDirection_code(int direction_code) {
        this.direction_code = direction_code;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getScheduled() {
        LocalDateTime dateTime = LocalDateTime.parse(scheduled);
        return dateTime.toLocalTime().toString();
    }

    public void setScheduled(String scheduled) {
        this.scheduled = scheduled;
    }

    public String getExpected() {
        LocalDateTime dateTime = LocalDateTime.parse(expected);
        return dateTime.toLocalTime().toString();
    }

    public void setExpected(String expected) {
        this.expected = expected;
    }

    public Journey getJourney() {
        return journey;
    }

    public void setJourney(Journey journey) {
        this.journey = journey;
    }

    public StopArea getStop_area() {
        return stop_area;
    }

    public void setStop_area(StopArea stop_area) {
        this.stop_area = stop_area;
    }

    public StopPoint getStop_point() {
        return stop_point;
    }

    public void setStop_point(StopPoint stop_point) {
        this.stop_point = stop_point;
    }

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }

    public List<Object> getDeviations() {
        return deviations;
    }

    public void setDeviations(List<Object> deviations) {
        this.deviations = deviations;
    }
}
