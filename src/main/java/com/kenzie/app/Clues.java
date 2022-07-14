package com.kenzie.app;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Clues {
    @JsonProperty("canon")
    public boolean canon;
    @JsonProperty("game")
    public Game game;
    @JsonProperty("category")
    public Category category;
    @JsonProperty("invalidCount")
    public int invalidCount;
    @JsonProperty("gameId")
    public int gameId;
    @JsonProperty("categoryId")
    public int categoryId;
    @JsonProperty("value")
    public int value;
    @JsonProperty("question")
    public String question;
    @JsonProperty("answer")
    public String answer;
    @JsonProperty("id")
    public int id;

    @Override
    public String toString() {
        return "Clues{" +
                "canon=" + canon +
                ", game=" + game +
                ", category=" + category +
                ", invalidCount=" + invalidCount +
                ", gameId=" + gameId +
                ", categoryId=" + categoryId +
                ", value=" + value +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", id=" + id +
                '}';
    }
}