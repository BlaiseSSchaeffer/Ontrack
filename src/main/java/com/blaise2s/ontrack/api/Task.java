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
        "title",
        "description"
})
public class Task {

    @JsonCreator
    public Task(@JsonProperty("title") String title,
                @JsonProperty("description") String description) {
        this.title = title;
        this.description = description;
    }

    @NotNull
    @NonNull
    @JsonProperty("title")
    private String title;

    @NotNull
    @NonNull
    @JsonProperty("description")
    private String description;
}
