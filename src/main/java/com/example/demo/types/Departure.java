package com.example.demo.types;

import java.util.List;

public class Departure {
    private String destination;
    private int directionCode;
    private String direction;
    private String state;
    private String display;
    private String scheduled;
    private String expected;
    private Journey journey;
    private StopArea stopArea;
    private StopPoint stopPoint;
    private Line line;
    private List<Object> deviations;  // Assuming deviations is an empty array, we use Object. Adjust type if known.

    // Getters and Setters
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDirectionCode() {
        return directionCode;
    }

    public void setDirectionCode(int directionCode) {
        this.directionCode = directionCode;
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
        return scheduled;
    }

    public void setScheduled(String scheduled) {
        this.scheduled = scheduled;
    }

    public String getExpected() {
        return expected;
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

    public StopArea getStopArea() {
        return stopArea;
    }

    public void setStopArea(StopArea stopArea) {
        this.stopArea = stopArea;
    }

    public StopPoint getStopPoint() {
        return stopPoint;
    }

    public void setStopPoint(StopPoint stopPoint) {
        this.stopPoint = stopPoint;
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
