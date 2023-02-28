import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;
    private ElectricCar electricCar;
    private PetrolCar petrolCar;
    private ArrayList<VehicleType> carStuff;


    @Before
    public void before(){
        customer = new Customer("Victoria", 100000.00);
        electricCar = new ElectricCar("Hyundai", "Orange", 2999.99);
        petrolCar = new PetrolCar("BMW", "Blue", 40000.00);
        carStuff = new ArrayList<>();

    }

    @Test
    public void can_add_purchased_thing_to_list(){
        customer.addItem(petrolCar);
        assertEquals(1, customer.getAmountOfCars());
    }

    @Test
    public void can_remove_money_from_customer_wallet(){
        customer.buySomething(petrolCar);
        assertEquals(60000, customer.getCash(), 0.0);
    }
}
