package cw_2.task4;

import cw_2.task3.Buyer;

public interface QueueBehaviour {
    void takeInQueue(Buyer actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}
