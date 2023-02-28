import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;

    @Before
    public void before(){
        electricCar = new ElectricCar("Hyundai", "Orange", 2999.99);
    }

    @Test
    public void has_brand(){
        assertEquals("Hyundai", electricCar.getBrand());
    }

    @Test
    public void has_colour(){
        assertEquals("Orange", electricCar.getColour());
    }

    @Test
    public void has_price(){
        assertEquals(2999.99, electricCar.getPrice(), 0.0);
    }
}
