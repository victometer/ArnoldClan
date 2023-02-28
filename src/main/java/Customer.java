import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {

    private String name;
    private double cash;
    private ArrayList<Buyable> carsAndParts;

    public Customer(String name, double cash){
        this.name = name;
        this.cash = cash;
        this.carsAndParts = new ArrayList<>();
    }

    public void addItem(Buyable item){
        carsAndParts.add(item);
    }


    public int getAmountOfItemsBought() {
        return carsAndParts.size();
    }

    public double getCash(){
        return this.cash;
    }

    public void buySomething(Buyable item){
        cash -= item.getPrice();
    }
}
