package hw_1;

public class Tea extends HotDrink{
    private String name;
    private int price;
    private int temperature;
    private int volume;

    public Tea(String name, int price, int temperature, int volume) {
        this.name = name;
        this.price = price;
        this.temperature = temperature;
        this.volume = volume;
    }

    public Tea(String name) {
        this.name = name;
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

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Tea [name=" + name + ", price=" + price + ", temperature=" + temperature + ", volume=" + volume + "]";
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    

    
}
