package academy.learnprogramming.oopschallenge;

public class HealthyBurger extends RegularBurger{
    private String name="Healthy Burger";
    private String breadRollType="Brown Rye Bread Roll";
    private boolean isAddOrganicLettuce;
    private boolean isAddOrganicCucumber;

    public HealthyBurger(boolean isAddMeat, boolean isAddCarrot, boolean isAddTomoto, boolean isAddOrganicLettuce, boolean isAddOrganicCucumber) {
        super("Healthy Burger","Brown Rye Bread Roll", isAddMeat, false, isAddCarrot, isAddTomoto, false);
        this.isAddOrganicLettuce = isAddOrganicLettuce;
        this.isAddOrganicCucumber = isAddOrganicCucumber;
    }

    @Override
    public double calculateBurgerCost() {
        double totalCost=super.calculateBurgerCost();
        double organicLettuceCost=15.00;
        double organicCucumberCost=15.00;
        System.out.println("Total Cost after adding regular burger = "+totalCost);
        if(isAddOrganicLettuce){
            totalCost=totalCost+organicLettuceCost;
            System.out.println("Total Cost after adding Organic Lettuce = "+totalCost);
        }
        if(isAddOrganicCucumber){
            totalCost=totalCost+organicCucumberCost;
            System.out.println("Total Cost after adding Organic Cucumber = "+totalCost);

        }
        System.out.println("Total Cost of Healthy Burger = "+totalCost);
        return totalCost;
    }

    @Override
    public void printIgredients() {
        super.printIgredients();
        System.out.println("Organic Lettuce Included : "+isAddOrganicLettuce);
        System.out.println("Organic Cucumber Inclcuded : "+isAddOrganicCucumber);
        return;
    }
}
