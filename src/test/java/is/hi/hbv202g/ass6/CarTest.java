package is.hi.hbv202g.ass6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car(getString());
    }

    private static String getString() {
        return "Beetle";
    }

    @Test
    public void getNameOfCar() {
        assertEquals(getString(), car.getName());
    }

}
