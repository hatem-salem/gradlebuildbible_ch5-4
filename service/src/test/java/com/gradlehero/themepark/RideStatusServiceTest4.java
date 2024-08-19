package com.gradlehero.themepark;


import org.junit.Test;
import static org.junit.Assert.*;

public class RideStatusServiceTest4 {
    @Test
    public void getsRideStatus4() {
        RideStatusService rideStatusService = new RideStatusService();
        String rideStatus = rideStatusService.getRideStatus("rollercoaster");
        assertNotNull(rideStatus);
    }
}
