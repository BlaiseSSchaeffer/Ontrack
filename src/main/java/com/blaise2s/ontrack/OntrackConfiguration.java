package com.blaise2s.ontrack;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

import javax.validation.constraints.NotNull;

public class OntrackConfiguration extends Configuration {

    @NotNull
    @JsonProperty("application_title")
    private String applicationTitle;

    @JsonProperty("application_title")
    public String getApplicationTitle() {
        return applicationTitle;
    }

    @JsonProperty("application_title")
    public void setApplicationTitle(String applicationTitle) {
        this.applicationTitle = applicationTitle;
    }
}
