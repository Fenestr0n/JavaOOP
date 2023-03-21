package hw_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 * Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и 
 * реализовать перегруженный метод getProduct(int name, int volume, int temperature) 
 * выдающий продукт соответствующий имени, объему и температуре.
 * В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и 
 * воспроизвести логику заложенную в программе.
 * Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре.
 */
public class Main {
    public static void main(String[] args) {
        HotDrinksVendingMachine hdvm = new HotDrinksVendingMachine();
        List<Tea> teas = new ArrayList<>(Arrays.asList(
            new Tea("Черный", 30, 80, 150),
            new Tea("Черный", 35, 70, 200),
            new Tea("Черный", 40, 70, 250),
            new Tea("Черный", 45, 60, 200),
            new Tea("Улун", 60, 56, 220),
            new Tea("Улун", 50, 56, 180),
            new Tea("Пуэр", 50, 65, 200),
            new Tea("Красный", 40, 75, 300),
            new Tea("Зеленый", 55, 62, 150),
            new Tea("Зеленый", 60, 55, 200)
        ));

        hdvm.initProduct(teas);
        System.out.println(hdvm.getProduct("Черный", 60, 200));
    }
}
