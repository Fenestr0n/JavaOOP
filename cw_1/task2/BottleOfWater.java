package cw_1.task2;

public class BottleOfWater extends Product{
    private String name;
    private int price;
    
    public BottleOfWater(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "BottleOfWater [name=" + name + ", price=" + price + "]\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
