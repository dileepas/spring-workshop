package com.example.demo.types;

import java.util.List;

public class DeparturesResponse {
    private List<Departure> departures;
    private List<Object> stopDeviations;  // Assuming stop_deviations is an empty array, we use Object. Adjust type if known.

    // Getters and Setters
    public List<Departure> getDepartures() {
        return departures;
    }

    public void setDepartures(List<Departure> departures) {
        this.departures = departures;
    }

    public List<Object> getStopDeviations() {
        return stopDeviations;
    }

    public void setStopDeviations(List<Object> stopDeviations) {
        this.stopDeviations = stopDeviations;
    }
}
