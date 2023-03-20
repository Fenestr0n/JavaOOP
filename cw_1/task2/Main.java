package cw_1.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Сделать класс Товар абстрактным, создать нескольких наследников (к примеру: БутылкаВоды),
 * сделать интерфейсом ТорговыйАвтомат и реализовать класс какого-то одного типа ТорговогоАвтомата
 * (пример: ПродающийБутылкиВодыАвтомат).
 */
public class Main {
    public static void main(String[] args) {
        VendingMachine1 vm = new VendingMachine1();
        List<BottleOfWater> bw = new ArrayList<>(Arrays.asList(
        new BottleOfWater("Coca-cola", 65),
        new BottleOfWater("Sprite", 76),
        new BottleOfWater("Pepsi", 68),
        new BottleOfWater("Fanta", 90)));

        vm.initProduct(bw);
        System.out.println(vm.getProduct("Fanta").toString());
    }
}
