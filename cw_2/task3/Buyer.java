package cw_2.task3;

public abstract class Buyer implements BuyerBehavor{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    abstract String getName();
}
