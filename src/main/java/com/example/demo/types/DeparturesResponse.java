package com.example.demo.types;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


public class DeparturesResponse {
    private List<Departure> departures;

    @JsonIgnore
    private List<Object> stop_deviations;  // Assuming stop_deviations is an empty array, we use Object. Adjust type if known.

    // Getters and Setters
    public List<Departure> getDepartures() {
        return departures;
    }

    public void setDepartures(List<Departure> departures) {
        this.departures = departures;
    }

    public List<Object> getStop_deviations() {
        return stop_deviations;
    }

    public void setStop_deviations(List<Object> stop_deviations) {
        this.stop_deviations = stop_deviations;
    }
}
