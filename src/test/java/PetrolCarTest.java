import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {

    PetrolCar petrolCar;

    @Before
    public void before(){
        petrolCar = new PetrolCar("BMW", "Blue", 40000.00);
    }

    @Test
    public void has_brand(){
        assertEquals("BMW", petrolCar.getBrand());
    }

    @Test
    public void has_colour(){
        assertEquals("Blue", petrolCar.getColour());
    }

    @Test
    public void has_price(){
        assertEquals(40000.00, petrolCar.getPrice(), 0.0);
    }
}
