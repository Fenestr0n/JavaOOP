package hw_6;

public class Notebook {
    
    private String brand;
    private String model;
    private Integer cores;
    private String os;
    private Integer ram;
    private Integer hdd;
    private Integer price;

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setCores(int cores) {
        this.cores = cores;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Notebook [brand=" + brand + ", model=" + model + ", cores=" + cores + ", os=" + os + ", ram=" + ram
                + ", hdd=" + hdd + ", price=" + price + "]";
    }
}
