package academy.learnprogramming;

public class SimpleCalculator {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = "+calculator.additionResult());
        System.out.println("substract = "+calculator.substractionResult());
        calculator.setSecondNumber(0);
        calculator.setFirstNumber(5.25);
        System.out.println("multiply = "+calculator.multiplicationResult());
        System.out.println("divide = "+calculator.divisionResult());
    }
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double additionResult(){
        return (this.firstNumber+this.secondNumber);
    }
    public double substractionResult(){
        return (this.firstNumber-this.secondNumber);
    }
    public double multiplicationResult(){
        return (this.firstNumber*this.secondNumber);
    }
    public double divisionResult(){
        if(this.secondNumber!=0){
        return (this.firstNumber/this.secondNumber);}
        else{
            return 0;
        }
    }

}
