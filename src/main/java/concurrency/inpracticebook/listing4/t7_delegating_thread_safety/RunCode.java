package concurrency.inpracticebook.listing4.t7_delegating_thread_safety;

import java.util.HashMap;
import java.util.Map;

public class RunCode {

    public static void main(String[] args) {
        Map<String, ImmutablePoint> locations = new HashMap<>();
        locations.put("car1", new ImmutablePoint(1, 1));
        locations.put("car2", new ImmutablePoint(2, 2));
        var vehicleTracker = new DelegatingVehicleTracker(locations);
        var liveLocations = vehicleTracker.getLocations();
        var snapshotLocations = vehicleTracker.getLocations1();
        System.out.println("debug");
    }
}
