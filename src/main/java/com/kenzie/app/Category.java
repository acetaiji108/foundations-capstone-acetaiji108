package com.kenzie.app;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Category {
    @JsonProperty("canon")
    public boolean canon;
    @JsonProperty("title")
    public String title;
    @JsonProperty("id")
    public int id;

    @Override
    public String toString() {
        return "Category{" +
                "canon=" + canon +
                ", title='" + title + '\'' +
                ", id=" + id +
                '}';
    }
}