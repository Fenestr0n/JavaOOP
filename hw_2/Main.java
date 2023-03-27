package hw_2;

import cw_2.task3.Human;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Market market = new Market();
        market.acceptToMarket(human);
        market.takeInQueue(human);
        market.takeOrders();
        market.giveOrders();
        market.releaseFromQueue();
        market.releaseFromMarket(human);
        market.update();
    }
}
