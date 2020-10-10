package academy.learnprogramming.polymorphism;


 public class Car{
     public static void main(String[] args) {

         Car myrentalCar = randomCar();
         myrentalCar.startEngine();
         myrentalCar.accelerate();
         myrentalCar.brake();

     }
     public static Car randomCar(){

         int randomNumber = (int) (Math.random()*5);

         System.out.println("Random Number generated is "+randomNumber);

         switch (randomNumber) {

             case 1:
                 return new Accura();
             case 2:
                 return new Lexus();
             case 3:
                 return new Camry();
             default:
                 return new Car("No Name","True",4,8);

         }
     }
    private String name = "No Name";
    private String engine = "True";
    private int wheels = 4;
    private int cylinders = 8;

    public Car(String name, String engine, int wheels, int cylinders) {
        this.name = name;
        this.engine = engine;
        this.wheels = wheels;
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine(){
        System.out.println("Started Engine of Car = "+ this.name);
    }

    public void accelerate(){
        System.out.println("Accelerating Car "+this.name);
    }

    public void brake(){
        System.out.println("Braking Car "+this.name);
    }

}

class Lexus extends Car{

    public Lexus() {
        super("Lexus", "True", 4, 32);
    }

    @Override
    public void accelerate(){
        super.accelerate();
        System.out.println("Gear Moved to 5 Current Speed of Lexus to 150Mph");
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Currently Lexus is in Gear 1");
    }

}

class Accura extends Car{
    public Accura() {
        super("Accura", "True", 4, 24);
    }
    @Override
    public void accelerate(){
        super.accelerate();
        System.out.println("Gear Moved to 5 Current Speed of Accura to 120Mph");
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Currently Accura is in Gear 1");
    }

    @Override
    public void brake() {
        super.brake();
        System.out.println("Currently Accura is in gear 1 and speed 0");
    }
}

class Camry extends Car{
    public Camry() {
        super("Camry", "True", 4, 12);
    }

    @Override
    public void accelerate(){
        super.accelerate();
        System.out.println("Gear Moved to 5 Current Speed of Camry to 100Mph");
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Currently Camry is in Gear 1");
    }

    @Override
    public void brake() {
        super.brake();
        System.out.println("Currently Camry is in gear 1 and speed 0");
    }
}



