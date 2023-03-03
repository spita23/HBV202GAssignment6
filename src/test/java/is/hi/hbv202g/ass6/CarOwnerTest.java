package is.hi.hbv202g.ass6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarOwnerTest {

    public static final String JOHN_DOE = "John Doe";
    private Car car;
    private CarOwner carOwner;

    @Before
    public void setUp() throws Exception {
        car = new Car("Beetle");
        carOwner = new CarOwner(JOHN_DOE, car);
    }

    @Test
    public void getName() {
        assertEquals(JOHN_DOE, carOwner.getName());
    }

}
