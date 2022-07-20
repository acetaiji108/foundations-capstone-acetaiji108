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

    public boolean isCanon() {
        return canon;
    }

    public void setCanon(boolean canon) {
        this.canon = canon;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getInvalidCount() {
        return invalidCount;
    }

    public void setInvalidCount(int invalidCount) {
        this.invalidCount = invalidCount;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

