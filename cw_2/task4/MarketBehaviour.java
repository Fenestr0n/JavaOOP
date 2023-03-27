package cw_2.task4;

import cw_2.task3.Buyer;

public interface MarketBehaviour {
    void acceptToMarket(Buyer actor);
    void releaseFromMarket(Buyer actors);
    void update();
}
