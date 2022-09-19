import Cupcakes.Choclate;
import Cupcakes.RedVelvet;
import Cupcakes.Cupcake;
import Formulas.Checks;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("We are in the middle of creating the Cupcake Menu. We currently  \nhave three cupcakes in the menu but we need to decide on pricing");

        ArrayList<Cupcake> cupcakes = new ArrayList<>();

        Cupcake vanilla = new Cupcake("Vanilla");
        RedVelvet redVelvet = new RedVelvet("Red Velvet");
        Choclate choclate = new Choclate("Chocolate");

        Scanner input = new Scanner(System.in);

        Thread.sleep(2000);

        //Vanilla
        System.out.println("We are deciding on the price of the Vanilla Cupcake... here's the description");
        vanilla.type();

        Thread.sleep(1000);

        System.out.println("How much would you like to charge for the cupcake? \n Enter a number with two decimal places.");

        String priceText = input.nextLine();

        double price = Double.parseDouble(priceText);

        vanilla.setPrice(price);

        //Redvelvet
        System.out.println("We are deciding on the price of the Red Velvet Cupcake... here's the description");
        redVelvet.type();

        Thread.sleep(1000);

        System.out.println("How much would you like to charge for the cupcake? \n Enter a number with two decimal places.");

         priceText = input.nextLine();

        price = Double.parseDouble(priceText);

       redVelvet.setPrice(price);

        //Choclate
        System.out.println("We are deciding on the price of the Cupcakes.Choclate Cupcake... here's the description");
        choclate.type();

        Thread.sleep(1000);

        System.out.println("How much would you like to charge for the cupcake? \n Enter a number with two decimal places.");

        priceText = input.nextLine();

        price = Double.parseDouble(priceText);

        choclate.setPrice(price);

        //add to Array
        cupcakes.add(vanilla);
        cupcakes.add(redVelvet);
        cupcakes.add(choclate);

        for(Cupcake c:cupcakes)
            c.print();

//DRINKS
        price = 0.00;
        Drinks water = new Drinks(price,"Water");
        Soda soda = new Soda(price,"Soda");
        Milk milk = new Milk(price, "Milk");

        //set prices Water
        System.out.println("We are deciding on the price of the Water...here's a description");
        water.type();

        Thread.sleep(1000);

        System.out.println("How much would you like to charge for the drink? \n Enter a number with two decimal places.");

        priceText = input.nextLine();

        price = Double.parseDouble(priceText);

        water.setPrice(price);

        //Soda
        System.out.println("We are deciding on the price of the Soda...here's a description");
        soda.type();

        Thread.sleep(1000);

        System.out.println("How much would you like to charge for the drink? \n Enter a number with two decimal places.");

        priceText = input.nextLine();

        price = Double.parseDouble(priceText);

        soda.setPrice(price);

        //Milk
        System.out.println("We are deciding on the price of the Milk...here's a description");
        milk.type();

        Thread.sleep(1000);

        System.out.println("How much would you like to charge for the drink? \n Enter a number with two decimal places.");

        priceText = input.nextLine();

        price = Double.parseDouble(priceText);

        milk.setPrice(price);

        ArrayList<Drinks> drinkMenu= new ArrayList<>();
        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        for (Drinks a:drinkMenu){
            a.print();
        }
        Thread.sleep(3000);

new Order(cupcakes,drinkMenu);

        //START CUSTOMER EXPERIENCE


        System.out.println(".........Hello Customer\n would you like to place an order? Y or N");

        while(!Checks.checkIfOrder(input.nextLine())){

        }
        ArrayList<Object> order = new ArrayList<>();
        order.add(LocalDate.now());
        order.add(LocalTime.now());
        System.out.println("Here is the menu");

        //show menu

        System.out.println("Cupcakes:");
        int itemNumber=0;

        for(int i= 0; i<cupcakes.size(); i++)
        {
            itemNumber++;

            System.out.println(itemNumber+".");

            cupcakes.get(i).type();
            System.out.println("Price: $"+ cupcakes.get(i).getPrice());
            System.out.println();
        }
        for(int i= 0; i<drinkMenu.size(); i++)
        {
            itemNumber++;

            System.out.println(itemNumber+".");

            drinkMenu.get(i).type();
            System.out.println("Price: $"+ drinkMenu.get(i).getPrice());
            System.out.println();
        }

        //ordering
        boolean ordering = true;
        while(ordering){
            System.out.println("What would you like to order, please use the number associated with each cupcake");
            int orderChoice = input.nextInt();
            input.nextLine();

            if(orderChoice<=cupcakes.size()) {
                order.add(cupcakes.get(orderChoice - 1));
                System.out.println("#" + orderChoice + " was ordered");
//            if(orderChoice == 1){
//                order.add(cupcakes.get(0));
//                System.out.println("#1 added to order");
//            }else if(orderChoice==2){
//                order.add(cupcakes.get(1));
//                System.out.println("#2 added to order");
//            }else if(orderChoice==3){
//                order.add(cupcakes.get(2));
//                System.out.println("#3 added to order");
//            }
            }else if(orderChoice>cupcakes.size() || orderChoice<(cupcakes.size()+drinkMenu.size())){
                order.add(drinkMenu.get((orderChoice -1)-cupcakes.size()));
                System.out.println("#" +orderChoice+ " was added");
            }
            else{
                System.out.println("Sorry we don't have that on the menu");
                continue;
            }
            System.out.println("Would you like to keep ordering (Y/N");
            int choice = Checks.checkIfContinue(input.nextLine());

            if(choice ==2){
            while(choice==2) {
                choice = Checks.checkIfContinue(input.nextLine());
            }
            }else if (choice ==1){
                ordering = false;
            }

        }
        System.out.println(order.get(0));
        System.out.println(order.get(1));
        System.out.println(order.get(2));
        System.out.println(order.get(3));
        System.out.println(order.get(4));
        Double subTotal = 0.0;

        for(int i =2; i< order.size();i++){
            for(int j=0; j<cupcakes.size(); j++){
            if(order.get(i).equals(cupcakes.get(j))) {
                cupcakes.get(j).type();
                System.out.println(cupcakes.get(j).getPrice());

                subTotal = subTotal + cupcakes.get(j).getPrice();

            }
            }
            for(int z=0; z<drinkMenu.size(); z++){
                if(order.get(i).equals(drinkMenu.get(z))) {
                    drinkMenu.get(z).type();
                    System.out.println(drinkMenu.get(z).getPrice());

                    subTotal = subTotal + drinkMenu.get(z).getPrice();
                }
            }
            System.out.println("$"+ subTotal+"\n");

           new Order.CreateFile();
           new Order.WriteToFile(order);
        }
    }



}