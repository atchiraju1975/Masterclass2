package academy.learnprogramming;

public class VipCustomer {

    public static void main(String[] args) {
        VipCustomer customer1 = new VipCustomer();
        System.out.println("Customer Name="+customer1.getName());
        VipCustomer customer2 = new VipCustomer("Srinivas",10000);
        System.out.println("Customer Name="+customer2.getName());
        VipCustomer customer3 = new VipCustomer("Srinivasan",5000,"Srinivas@email.com");
        System.out.println("Customer Name="+customer3.getName());
    }

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer() {
        this("Srinivas",1000,"Srinivas@email.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name,creditLimit,"unknow@email.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
