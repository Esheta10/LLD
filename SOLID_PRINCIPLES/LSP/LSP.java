package SOLID_PRINCIPLES.LSP;
// Liskov - Substitution Principle states that objects of sub-class should be substitutable by objects of Parent class without breaking the
// correctness of the program. In other words, a subtype must honour every behavioral contract of its parent and not just inherit its form.

// A common violation is overriding a method that throws an exception or does nothing, which means a subclass can't truly replace its 
//  parent. The fix is to separate capabilities using interface, so that a class only promise what it can actually deliver.

interface Flyable{
    void fly();
}

class BirdHandler{
    // base class with no fly method
    public void makeFly(Flyable bird){
        bird.fly();
    }
}

class Sparrow extends BirdHandler implements Flyable{

    public void fly(){
        System.out.println("I am a Sparrow and I can fly.");
    }
}

class Penguin extends BirdHandler{
    public void swim(){
        System.out.println("I am a Penguin and I can only swim.");
    }
}

public class LSP {
    public static void main(String[] args) {
        
        BirdHandler handler = new BirdHandler();
        handler.makeFly(new Sparrow()); // works
        //handler.makeFly(new Penguin()); // Compiler Error -  Penguin cannot be converted to Flyable
    }
}
