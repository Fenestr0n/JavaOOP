package cw_1.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
 * содержащий в себе методы initProducts(List<Product>) сохраняющий в себе 
 * список исходных продуктов и getProduct(String name)
 */
public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        List<Product> products = new ArrayList<>(Arrays.asList(
        new Product("Coca-cola", 65),
        new Product("Snikers", 76),
        new Product("Mars", 68),
        new Product("Baunty", 90)));
        vendingMachine.initProducts(products);
        System.out.println(vendingMachine.getProduct("Coca-cola").toString());
    }
}
