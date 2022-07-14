package com.kenzie.app;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DTO {

    @JsonProperty("clues")
    public List<Clues> clues;

    @Override
    public String toString() {
        return "DTO{" +
                "clues=" + clues +
                '}';
    }

    public void getData() {

    }
}