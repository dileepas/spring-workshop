package com.example.demo.types;

public class Line {
    private int id;
    private String designation;
    private String transport_mode;
    private String group_of_lines;

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

    public String getTransport_mode() {
        return transport_mode;
    }

    public void setTransport_mode(String transport_mode) {
        this.transport_mode = transport_mode;
    }

    public String getGroup_of_lines() {
        return group_of_lines;
    }

    public void setGroup_of_lines(String group_of_lines) {
        this.group_of_lines = group_of_lines;
    }
}
