package hw_5;

import java.util.Locale;

public class NotebookView {
    public void getInfo(String brand, String model, Integer cores, String os, Integer ram, Integer hdd, Integer price){
        System.out.printf(Locale.ITALY, "%s %s, Cores: %d, OS: %s, RAM: %dGb, HDD: %dGb, Price: %,d₽\n", brand, model, cores, os, ram, hdd, price, 1000);
        
    }
}
