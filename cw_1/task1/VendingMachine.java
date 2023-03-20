package cw_1.task1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<Product> products = new ArrayList<>();

    public void initProducts(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name) {
        for (Product p : products) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return new Product("Product is undefined", 0);
    }
}
