package com.gradlehero.themepark;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RideStatusServiceFailureTest {
    @Test
    public void unknownRideCausesFailure() {
        RideStatusService rideStatusService = new RideStatusService();
        assertThrows(IllegalArgumentException.class, () -> {
            rideStatusService.getRideStatus("dodgems");
        });
    }
    @Test
    @Disabled
    public void notAGoodTest() {
       throw new RuntimeException();
    }
}
