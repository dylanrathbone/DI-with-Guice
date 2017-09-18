import com.dylanrathbone.app.services.ApacheAH64;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApacheAH64Test {

    private ApacheAH64 apacheAH64;

    @Before
    public void setup() {
        apacheAH64 = new ApacheAH64();
    }

    @Test
    public void avionicsShouldInitialiseCorrectly() {
        String expected = "Apache AH-64 Gunship avionics initialisation sequence started...";
        assertEquals(expected, apacheAH64.initialiseAvionics());
    }

    @Test
    public void aircraftShouldTakeOffSuccessfully() {
        String expected = "Vertical take off...";
        assertEquals(expected, apacheAH64.takeOff());
    }

    @Test
    public void aircraftShouldBankLeftSuccessfully() {
        String expected = "Banking left...";
        assertEquals(expected, apacheAH64.bankLeft());
    }
}