package academy.learnprogramming.oopschallenge;

public class DeluxBurger extends RegularBurger{

    private String name="Delux Burger";
    private boolean isAddChips;
    private boolean isAddDrinks;

    public DeluxBurger(String breadRollType, boolean isAddMeat, boolean isAddLettuce, boolean isAddCarrot, boolean isAddTomoto, boolean isAddCucumber,boolean isAddChips, boolean isAddDrinks) {
        super("Delux Burger", breadRollType, isAddMeat, isAddLettuce, isAddCarrot, isAddTomoto, isAddCucumber);
        this.isAddChips = isAddChips;
        this.isAddDrinks = isAddDrinks;
    }

    @Override
    public double calculateBurgerCost() {
        double totalCost = super.calculateBurgerCost();
        double chipsCost=20.00;
        double drinksCost=25.00;
        System.out.println("Total Cost after of Regular Burger = "+totalCost);
        if(isAddChips){
            totalCost=totalCost+chipsCost;
            System.out.println("Total Cost after adding Chips = "+totalCost);
        }
        if(isAddDrinks){
            totalCost=totalCost+drinksCost;
            System.out.println("Total Cost after adding Drinks = "+totalCost);
        }
        System.out.println("Total Cost of Delux Burger = "+totalCost);
        return totalCost;
    }

    @Override
    public void printIgredients() {
        super.printIgredients();
        System.out.println("Chips Included : "+isAddChips);
        System.out.println("Drinks Included : "+isAddDrinks);
        return;
    }
}
