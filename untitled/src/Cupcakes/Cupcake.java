package Cupcakes;

public class Cupcake {
    //fields
    public double price;
    public String name;

    public Cupcake(String name) {
        this.name = name;
    }

    public double getPrice(){

        return price;

    }
    public void setPrice(double price){
        this.price = price;

    }

    public void type(){
        System.out.println("A basic, generic cupcake, with vanilla frosting.");
    }
    public void print(){
        System.out.println("Name:" + name + ", Price:" + price);
    }

}
