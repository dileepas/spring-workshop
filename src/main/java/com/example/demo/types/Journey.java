package com.example.demo.types;

public class Journey {
    private long id;
    private String state;
    private String predictionState;  // Optional, based on presence

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

    public String getPredictionState() {
        return predictionState;
    }

    public void setPredictionState(String predictionState) {
        this.predictionState = predictionState;
    }
}

