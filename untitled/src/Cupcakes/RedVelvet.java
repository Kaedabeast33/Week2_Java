package Cupcakes;

public class RedVelvet extends Cupcake {
    public RedVelvet(String name) {
        super(name);
    }

    //methods
    public void type(){
        System.out.println("A red velvet based cupcake, with cheese frosting.");
    }
    @Override public void print(){
        System.out.println("Name:" + name + ", Price:" + price);
    }


}
