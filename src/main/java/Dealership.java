import java.util.ArrayList;

public class Dealership {


    private double till;
    private ArrayList<Buyable> carsAndPartsDealer;

    public Dealership(double till, ArrayList<Buyable> carsAndPartsDealer){
        this.till = till;
        this.carsAndPartsDealer = carsAndPartsDealer;
    }

    public double getTill(){
        return this.till;
    }


    public int getAmountOfItemsBought() {
        return carsAndPartsDealer.size();
    }

    public void buySomething(Buyable item){
        till -= item.getPrice();
    }

    public void addItem(Buyable item) {
        carsAndPartsDealer.add(item);
    }

}
