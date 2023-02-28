public class DealershipTest {

    private Dealership dealership;
    private Buyable engine;
    private Buyable petrolCar;
    private Buyable electriCar;
    private ArrayList<Buyable> carsAndParts;

    @Before
    public void before(){
        engine = new Engine("DF345", 345.00);
        petrolCar = new PetrolCar("BMW", "Blue", 40000.00);
        electriCar = new ElectricCar("Hyundai", "Orange", 2999.00);
        carsAndParts = new ArrayList<Buyable>(
                Arrays.asList (electriCar, petrolCar, engine));
        dealership = new Dealership(5000.00, carsAndParts);

    }

    @Test
    public void can_add_purchased_thing_to_list(){
        dealership.addItem(petrolCar);
        assertEquals(4, dealership.getAmountOfItemsBought());
    }

    @Test
    public void can_reduce_money_in_wallet(){
        dealership.buySomething(electriCar);
        assertEquals(2001.00, dealership.getTill(), 0.0);
    }
}
