package academy.learnprogramming.oopschallenge;

import java.util.Scanner;

public class RegularBurger {

    public static void main(String[] args) {
       RegularBurger burger;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Next Customer Please : ");
        System.out.println("May I take your order : ");
        boolean isOrderYetToReceive=true;
        while(isOrderYetToReceive){
            int readIntEntered=0;
            System.out.println("Enter Your Burger Choice 1.Regular Burger 2.Healthy Burger 3.Delux Burger : ");
            boolean isAnInt = scanner.hasNextInt();
             if(isAnInt){
            readIntEntered = scanner.nextInt();
            isOrderYetToReceive=false;
             }
             else{
                 char c = scanner.next().charAt(0);
                 continue;}

             switch(readIntEntered){
                 case 2:
                     burger = new HealthyBurger(true,true,true,true,true);
                     burger.printIgredients();
                     System.out.println("Total Cost of Your Burger is : "+ burger.calculateBurgerCost());
                     break;
                 case 3:
                     burger = new DeluxBurger("White Bread", true,true,true, true, true, true, true);
                     burger.printIgredients();
                     System.out.println("Total Cost of Your Burger is : "+ burger.calculateBurgerCost());
                     break;
                 default:
                    burger = new RegularBurger("Regular Burger","Grilled Bread",true,true,true,true,true);
                     burger.printIgredients();
                     System.out.println("Total Cost of Your Burger is : "+ burger.calculateBurgerCost());
                    break;
             }

        }
        //System.in.close();
        System.out.println("Thankyou for your order, move to receiving area and wait for the order number");
    }

    private String name;
    private String breadRollType;
    private boolean isAddMeat;
    private boolean isAddLettuce;
    private boolean isAddCarrot;
    private boolean isAddTomoto;
    private boolean isAddCucumber;


    public RegularBurger(String name, String breadRollType, boolean isAddMeat, boolean isAddLettuce, boolean isAddCarrot, boolean isAddTomoto, boolean isAddCucumber) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.isAddMeat = isAddMeat;
        this.isAddLettuce = isAddLettuce;
        this.isAddCarrot = isAddCarrot;
        this.isAddTomoto = isAddTomoto;
        this.isAddCucumber = isAddCucumber;
    }

    public double calculateBurgerCost(){
        double totalCost=0.0;
        double breadRollCost=100.00;
        double meatCost=50.00;
        double lettuceCost=10.00;
        double tomotoCost=10.00;
        double carrotCost=10.00;
        double cucumberCost=10.00;
        totalCost=totalCost+breadRollCost;
        System.out.println("Total Cost after adding Breadroll = "+totalCost);
        if(isAddMeat){
            totalCost=totalCost+meatCost;
            System.out.println("Total Cost after adding meatcost = "+totalCost);
        }
        if(isAddLettuce){
            totalCost=totalCost+lettuceCost;
            System.out.println("Total Cost after adding lettuce = "+totalCost);
        }
        if(isAddCarrot){
            totalCost=totalCost+carrotCost;
            System.out.println("Total Cost after adding carrot = "+totalCost);
        }
        if(isAddTomoto){
            totalCost=totalCost+tomotoCost;
            System.out.println("Total Cost after adding tomoto = "+totalCost);
        }
        if(isAddCucumber){
            totalCost=totalCost+cucumberCost;
            System.out.println("Total Cost after adding cucumber = "+totalCost);
        }
        return totalCost;
    }

    public void printIgredients(){
        System.out.println("Burger Type : "+this.name);
        System.out.println("Bread Roll : "+this.breadRollType);
        System.out.println("Meat Included : "+this.isAddMeat);
        System.out.println("Lettuce Included : "+this.isAddLettuce);
        System.out.println("Carrot Included : "+this.isAddCarrot);
        System.out.println("Tomoto Included : "+this.isAddTomoto);
        System.out.println("Cucumber Included : "+this.isAddCucumber);
        return;
    }
}
