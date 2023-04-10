package com.kaustav.properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }
    public BoxWeight(int l, int b, int h, double w){
        super(l, b, h);
        this.weight = w;
    }

    public BoxWeight(int side, double weight){
        super(side);
        this.weight = weight;
    }
    public BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }
    public void info(){
        super.info();
        System.out.println("Weight: " + this.weight);
    }
}
