import org.example.TaxiService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaxiServiceTest {

    @Test
    public void calculateFareTest(){
        double distanceTrip = 10.0;
        double timeInMinutes = 15.0;

        double value = TaxiService.calculateFare(distanceTrip, timeInMinutes);
        double expectedValue = 160;
        Assertions.assertEquals(expectedValue, value);
    }
}
