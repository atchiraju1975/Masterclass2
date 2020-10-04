package academy.learnprogramming;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
        return;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
        return;
    }

    public void setAge(int age){
        if(age<0||age>100){age=0;}
        this.age=age;
        return;
    }

    public boolean isTeen(){
        if(age>12&&age<20){
            return true;
        }
        return false;
    }

    public String getFullName(){
        if ((firstName.isEmpty())&&(lastName.isEmpty())){return "";}
        if (firstName.isEmpty()&&!lastName.isEmpty()){return lastName;}
        if (lastName.isEmpty()&&!firstName.isEmpty()){return firstName;}
        return (firstName+" "+lastName);
    }

}
