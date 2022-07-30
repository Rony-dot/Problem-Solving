package com.rony;

interface Vehicle{
    double getCarWeight();
}

interface Card{
    double discount(double tax);
}

interface TaxPayer{
    String taxPayerType = "";
}

class Platinum implements Card{
    public double discount(double tax){
        return tax+tax*0.1;
    }
}

class Gold implements Card{
    public double discount(double tax){
        return tax+tax*0.08;
    }
}

class Silver implements Card{
    public double discount(double tax){
        return tax+tax*0.05;
    }
}
class Car implements Vehicle{
    double carWeight;
    public double getCarWeight(){
        return this.carWeight;
    }
    public void setCarWeight(double carWeight){
        this.carWeight = carWeight;
    }

}

class Government implements TaxPayer{

}


public class Toll {
    public static void main(String[] args) {

    }
}
