package com.gradlehero.themepark;


import org.testng.annotations.Test;
import static org.testng.Assert.assertNotNull;

public class RideStatusServiceTestNG {
    @Test
    public void getsRideStatus4() {
        RideStatusService rideStatusService = new RideStatusService();
        String rideStatus = rideStatusService.getRideStatus("rollercoaster");
        assertNotNull(rideStatus);
    }
}
