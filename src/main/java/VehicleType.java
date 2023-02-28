import java.util.ArrayList;

public abstract class VehicleType {

    private String brand;
    private String colour;
    private double price;
    private ArrayList<Part> spareParts;
    public VehicleType(String brand, String colour, double price){
        this.brand = brand;
        this.colour = colour;
        this.price = price;
        this.spareParts = new ArrayList<>();
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }
}
