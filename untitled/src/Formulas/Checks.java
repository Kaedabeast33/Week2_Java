package Formulas;

public class Checks {
    public static boolean checkIfOrder(String answer){
        if(answer.equalsIgnoreCase("Y")){
            return true;
        } else if (answer.equalsIgnoreCase("N")) {
            System.out.println("Sorry, when you are ready type Y");
            return false;
        }else{
            System.out.println("Please say Y or N");
            return false;
        }
    }
    public static int checkIfContinue(String answer){
        if(answer.equalsIgnoreCase("Y")){

            return 0;
        } else if (answer.equalsIgnoreCase("N")) {
            System.out.println("Great, thanks for ordering");
            return 1;
        }else{
            System.out.println("Please say Y or N");
            return 2;
        }
    }
}
