# Touch-Events-Tracker
<img src="https://bintray.com/assets/bintray-logo.png" width="60" height="40"><br><br>
Android SDK which tracks all types of touch events in application.
Touch Events Tracker is an **Android SDK** which tracks touch actions in application.Following are touch actions which it can track:
  - Touch on any view
  - Swipe/Fling
  - Single Tap/Double Tap
  - Scroll

## Gradle Integration
```sh
Add below line in dependency block of app's gradle file:

dependencies {
    compile 'com.krishna.event_tracker:eventtrackersdk:1.0@aar'
}
```
## Initialisation
```sh
Add below line in onCreate method of custom Application class

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        new EventDetector(this); //where this is Application context
    }
}
```
```sh
Or in app's startup activity**

public class MainActivity extends AppCompatActivity{
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new EventDetector(getApplicationContext());
    }
}
```

## Get all tracked events from SDK

```sh
public class MyApplication extends Application {

    private EventDetector eventDetector;
    List<Event> eventList = new ArrayList<>();
    
    @Override
    public void onCreate() {
        super.onCreate();
        eventDetector = new EventDetector(this);
    }

    public List<Event> getEventList() {
        eventList.addAll(eventDetector.getmEventList());
        return eventList;
    }
```

### Exclude activity from getting tracked
```sh
public class MyApplication extends Application {
    private EventDetector eventDetector;
    @Override
    public void onCreate() {
        super.onCreate();
        ........
        /**"do not track events on below activity"**/
        eventDetector.excludeActivity("EventActivity");
    }
```
