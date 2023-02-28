public abstract class Part implements Buyable {

    private String modelNo;
    private double price;

    public Part(String modelNo, double price){
        this.modelNo = modelNo;
        this.price = price;
    }

    public String getModelNo() {
        return modelNo;
    }

    public double getPrice() {
        return price;
    }
}
