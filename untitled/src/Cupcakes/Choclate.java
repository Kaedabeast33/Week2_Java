package Cupcakes;

public class Choclate extends Cupcake {
    public Choclate(String name) {
        super(name);
    }

    public void type (){
        System.out.println("A choclate  based cupcake, with chocolate frosting.");
    }
    @Override public void print(){
        System.out.println("Name:" + name + ", Price:" + price);
    }
}
