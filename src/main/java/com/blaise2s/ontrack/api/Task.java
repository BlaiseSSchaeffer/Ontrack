package com.blaise2s.ontrack.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.NotNull;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "title",
        "comments"
})
public class Task {

    @JsonCreator
    public Task(@JsonProperty("id") Integer id,
                @JsonProperty("title") String title,
                @JsonProperty("comments") String comments) {
        this.id = id;
        this.title = title;
        this.comments = comments;
    }

    public Task(String title,
                String description) {
        this.title = title;
        this.comments = description;
    }

    @JsonProperty("id")
    private Integer id;

    @NotNull
    @NonNull
    @JsonProperty("title")
    private String title;

    @JsonProperty("comments")
    private String comments;
}
