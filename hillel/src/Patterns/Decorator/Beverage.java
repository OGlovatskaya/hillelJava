package Patterns.Decorator;

/**
 * Created by OGlovatskaya on 12.11.2015.
 */
public abstract class Beverage {

    protected int cost;
    protected String description;

    /*private boolean hasMilk;
    private boolean hasCream;

    private int milkCost = 5;
    private int creamCost = 8;*/

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int cost(){
        return cost;

    /*public int cost() {
        int total = cost;
        if (hasMilk){
            total += milkCost;
        }
        if (hasCream){
            total += creamCost;
        }
        return total;*/

        /*if (hasMilk){
            cost += milkCost;
        }
        if (hasCream){
            cost += creamCost;
        }
        return cost;*/
    }

    public String description() {
        return description;
    }

    /*public void setCream(boolean hasCream){
        this.hasCream = hasCream;
    }

    public void setMilk(boolean hasMilk){
        this.hasMilk = hasMilk;
    }*/
}
