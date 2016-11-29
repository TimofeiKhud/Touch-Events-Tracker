package com.krishna.eventtracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import com.krishna.eventtrackersdk.Event;

import java.util.List;

/**
 * Created by krishna on 26/11/16.
 */

public class EventActivity extends AppCompatActivity {
    private static final String TAG = "EventActivity";
    private ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_activity);
        listView = (ListView) findViewById(R.id.list_view);
        List<Event> eventList = ((MyApplication) getApplication()).getEventList();
        Log.d(TAG, "onCreate: " + eventList);
        final CustomListAdapter listAdapter = new CustomListAdapter(this, eventList);
        listView.setAdapter(listAdapter);
    }
}
