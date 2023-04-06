package hw_5;

// import java.util.Locale;

public class Notebook {
    private String brand;
    private String model;
    private Integer cores;
    private String os;
    private Integer ram;
    private Integer hdd;
    private Integer price;

    // public Notebook(String brand, String model, Integer cores, String os, Integer ram, Integer hdd, Integer price) {
    //     this.brand = brand;
    //     this.model = model;
    //     this.cores = cores;
    //     this.os = os;
    //     this.ram = ram;
    //     this.hdd = hdd;
    //     this.price = price;
    // }
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getCores() {
        return cores;
    }

    public void setCores(Integer cores) {
        this.cores = cores;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getHdd() {
        return hdd;
    }

    public void setHdd(Integer hdd) {
        this.hdd = hdd;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    
    // private String getInfo(){
    //     return String.format(Locale.ITALY, "%s %s, Cores: %d, OS: %s, RAM: %dGb, HDD: %dGb, Price: %,d₽\n", brand, model, cores, os, ram, hdd, price, 1000);
    //     // return String.format("%s %s Cores: %d \n", brand, model, cores);
    // }

    // @Override
    // public String toString() {
    //     return getInfo();
    // }

    // public boolean isGaming(Integer cores, Integer ram) {
    //     if (cores >= 4 && ram >= 16) return true;
    //     return false;
    // }

}


