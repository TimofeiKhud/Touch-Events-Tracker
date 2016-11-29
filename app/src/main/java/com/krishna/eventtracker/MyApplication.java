package com.krishna.eventtracker;

import android.app.Application;

import com.krishna.eventtrackersdk.Event;
import com.krishna.eventtrackersdk.EventDetector;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krishna on 26/11/16.
 */

public class MyApplication extends Application {
    private EventDetector eventDetector;
    List<Event> eventList = new ArrayList<>();

    @Override
    public void onCreate() {
        super.onCreate();
        eventDetector = new EventDetector(this);

        // don't track events on below activity
        eventDetector.excludeActivity("EventActivity");
    }

    public List<Event> getEventList() {
        eventList.addAll(eventDetector.getmEventList());
        return eventList;
    }
}
