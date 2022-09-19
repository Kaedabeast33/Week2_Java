import Cupcakes.Cupcake;


import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Order {

    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drinks> drinkMenu)
    {
    }
    static class CreateFile {
        public CreateFile() throws IOException {
            try {
                File salesData = new File("salesData.txt");
                if (salesData.createNewFile()) {
                    System.out.println("File created: " + salesData.getName());

                } else {
                    System.out.println("File already exists");
                }
            }catch(IOException e){
                System.out.println("An error occured");
            }
        }
    }
    static class WriteToFile{
        public WriteToFile(ArrayList<Object>order){
            try{
                FileWriter fw = new FileWriter("salesData.txt",true);
                PrintWriter salesWriter = new PrintWriter(fw);

                for(int i=0; i<order.size(); i++){
                    salesWriter.println(order.get(i));
                }
                salesWriter.close();
                System.out.println("Succesfully wrote to the file");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
