package com.blaise2s.ontrack;

import com.blaise2s.ontrack.resources.TaskResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class Ontrack extends Application<OntrackConfiguration> {

    public static void main(String[] args) throws Exception {
        new Ontrack().run(args);
    }

    @Override
    public void initialize(Bootstrap<OntrackConfiguration> bootstrap) {
        // TODO: Nothing required here at this time
        super.initialize(bootstrap);
    }

    @Override
    public void run(OntrackConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(new TaskResource());
        // TODO: Add health checks
        // environment.healthChecks().register("Name", new HEALTH_CHECK_INSTANCE);
    }
}
