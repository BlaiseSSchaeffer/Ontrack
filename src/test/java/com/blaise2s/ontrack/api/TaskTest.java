package com.blaise2s.ontrack.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TaskTest {

    private static final String TITLE = "Trash";
    private static final String DESC = "Take out the trash";
    private static final Task underTest = new Task(TITLE, DESC);

    @Test
    public void gettersTest() {
        assertEquals(TITLE, underTest.getTitle());
        assertEquals(DESC, underTest.getComments());
    }
}
