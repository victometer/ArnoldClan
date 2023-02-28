import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {

    private String name;
    private double cash;
    private ArrayList<VehicleType> vehicles;

    public Customer(String name, double cash){
        this.name = name;
        this.cash = cash;
        this.vehicles = new ArrayList<>();
    }


}
