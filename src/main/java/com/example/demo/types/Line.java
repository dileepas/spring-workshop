package com.example.demo.types;

public class Line {
    private int id;
    private String designation;
    private String transportMode;
    private String groupOfLines;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }

    public String getGroupOfLines() {
        return groupOfLines;
    }

    public void setGroupOfLines(String groupOfLines) {
        this.groupOfLines = groupOfLines;
    }
}
