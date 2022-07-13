package com.kenzie.app;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Game {
    @JsonProperty("canon")
    public boolean canon;
    @JsonProperty("aired")
    public String aired;

    @Override
    public String toString() {
        return "Game{" +
                "canon=" + canon +
                ", aired='" + aired + '\'' +
                '}';
    }
}
