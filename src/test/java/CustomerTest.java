import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private Customer customer;
    private Buyable engine;
    private Buyable petrolCar;
    private ArrayList<Buyable> carsAndParts;


    @Before
    public void before(){
        customer = new Customer("Victoria", 100000.00);
        engine = new Engine("EK123", 299.99);
        petrolCar = new PetrolCar("BMW", "Blue", 40000.00);
        carsAndParts = new ArrayList<>();

    }

    @Test
    public void can_add_purchased_thing_to_list(){
        customer.addItem(petrolCar);
        assertEquals(1, customer.getAmountOfItemsBought());
    }

    @Test
    public void can_reduce_money_in_wallet(){
        customer.buySomething(petrolCar);
        assertEquals(60000, customer.getCash(), 0.0);
    }
}
