package com.example.demo.types;

public class Journey {
    private long id;
    private String state;
    private String prediction_state;  // Optional, based on presence

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPrediction_state() {
        return prediction_state;
    }

    public void setPrediction_state(String prediction_state) {
        this.prediction_state = prediction_state;
    }
}

