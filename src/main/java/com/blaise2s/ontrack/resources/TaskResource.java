package com.blaise2s.ontrack.resources;

import com.blaise2s.ontrack.api.Task;
import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/tasks")
public class TaskResource {

    private static final Task TASK = new Task("Trash", "Take out the trash");
    private static final List<Task> TASKS;

    static {
        TASKS = new ArrayList<>();
        TASKS.add(TASK);
    }

    @GET
    @Timed
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTasks() {
        return Response.ok(TASKS).build();
    }

    @POST
    @Timed
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTask(Task task) {
        TASKS.add(task);
        return Response.ok("Successfully created task: " + task.getTitle()).build();
    }

    @Path("/bulk")
    @POST
    @Timed
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTask(List<Task> tasks) {
        int count = 0;
        for (Task task : tasks) {
            TASKS.add(task);
            count += 1;
        }
        return Response.ok("Successfully created " + count + " tasks").build();
    }
}
