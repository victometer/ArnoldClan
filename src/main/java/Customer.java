import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {

    private String name;
    private double cash;
    private ArrayList<Buyable> stuffBought;

    public Customer(String name, double cash){
        this.name = name;
        this.cash = cash;
        this.stuffBought = new ArrayList<>();
    }

    public void addItem(Buyable item){
        stuffBought.add(item);
    }


    public int getAmountOfCars() {
        return stuffBought.size();
    }

    public double getCash(){
        return this.cash;
    }

    public void buySomething(Buyable item){
        cash -= item.getPrice();
    }
}
