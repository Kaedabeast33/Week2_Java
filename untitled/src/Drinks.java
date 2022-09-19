public class Drinks {
    //fields
    private double price;
    private String name;

    //constructor
    public Drinks(double price, String name) {
        this.price = price;
        this.name = name;
    }
    //setter

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getter
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    //methods
    public void type(){
        System.out.println("A bottle of water");
    }
    public void print() {
        System.out.println(name + ": " +price);
    }
}

class Soda extends Drinks{
    //constructor
    public Soda(double price, String name) {
        super(price, name);
    }
    //METHODS

    @Override public void type(){
            System.out.println("A bottle of Soda");
        }

}

class Milk extends Drinks{
    //constructor
    public Milk(double price, String name) {
        super(price, name);
    }
    //METHODS
    public void type(){
        System.out.println("A bottle of Milk");
    }

}