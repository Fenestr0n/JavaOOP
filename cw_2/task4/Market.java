package cw_2.task4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import cw_2.task3.Buyer;
import cw_2.task3.Human;

public class Market implements MarketBehaviour, QueueBehaviour{

    List<Buyer> actors = new ArrayList<>();
    Queue<Buyer> actorsQueue = new ArrayDeque<>();

    @Override
    public void takeInQueue(Buyer actor) {
        actorsQueue.add(actor);
    }

    @Override
    public void takeOrders() {
        actorsQueue.peek().isTakeOrder();
    }

    @Override
    public void giveOrders() {
        actorsQueue.peek().isMakeOrder();
    }

    @Override
    public void releaseFromQueue() {
        actorsQueue.poll();
    }

    @Override
    public void acceptToMarket(Buyer actor) {
        actors.add(actor);
    }

    @Override
    public void releaseFromMarket(Buyer actor) {
        actors.remove(0);
    }

    @Override
    public void update() {
        
    }
    
}
