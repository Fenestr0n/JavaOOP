package hw_1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {

    List<Tea> teas = new ArrayList<>();
    void initProduct(List<Tea> teas) {
        this.teas = teas;
    }
    
    @Override
    public String getProduct(String name) {
        for (Tea tea : teas) {
            if (tea.getName().contains(name)) {
                return tea.getName() + tea.getPrice();
            }
        }
        return new Tea("Не найдено").toString();
    }
    
    public String getProduct(String name, int temperature, int volume) {
        for (Tea tea : teas) {
            if (tea.getName().contains(name)
            && (tea.getVolume() == volume)
            && (tea.getTemperature() == temperature)) {
                return tea.toString();
            }
        }
        return new Tea("Не найдено").toString();
    }
}
