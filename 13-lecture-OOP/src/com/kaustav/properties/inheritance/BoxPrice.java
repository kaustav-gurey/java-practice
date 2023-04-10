package com.kaustav.properties.inheritance;

public class BoxPrice extends BoxWeight{
    double cost;
    public BoxPrice(){
        super();
        this.cost = -1;
    }
    public BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }
    public BoxPrice(int side,  double weight, double cost){
        super(side, weight);
        this.cost = cost;
    }
    public BoxPrice(int l, int b, int h, double w, double c){
        super(l, b, h, w);
        this.cost = c;
    }

    public void info(){
        super.info();
        System.out.println("Cost: " + this.cost);
    }
}
