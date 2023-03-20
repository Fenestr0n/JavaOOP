package cw_1.task2;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine1 extends VendingMachine{
    
    List<BottleOfWater> bottleOfWaters = new ArrayList<>();

    void initProduct(List<BottleOfWater> bottle) {
        this.bottleOfWaters = bottle;
    }
    @Override
    String getProduct(String name) {
        for (BottleOfWater bw : bottleOfWaters) {
            if (bw.getName().contains(name)) return bw.getName() + " " + bw.getPrice();
        }
        return new BottleOfWater("Не найдено!", 0).toString();
    }

    
}
