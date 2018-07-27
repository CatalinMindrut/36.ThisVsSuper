package com.Catalin;

public class House {
    private String color;

    public House(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    /** The keyword this is commonly used with constructors and setters, and optionally in getters (easier
     * for beginners). In the example above we are using the this keyword in the constructor and setter since
     * there is a parameter with the same name. In the getter we don't have any parameters so the this keyword
     * is optional.
     */
}


class SuperClass{ //parent class aka super class
    public void printMethod(){
        System.out.println("Printed in Superclass.");
    }
}
class SubClass extends SuperClass{ // subclass aka child class
    //overrides method from parent
    @Override
    public void printMethod(){
        super.printMethod(); // calls method in SuperClass (parent)
        System.out.println("Printed in Subclass");
    }
}
class MainClass{
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.printMethod();
    }
}
/** The keyword super is commonly used with method overriding, when we call a method with the same
 * name from the parent class. In the example below we have a method printMethod that calls super.printMethod.
 */
