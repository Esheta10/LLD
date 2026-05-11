class AnimalIN {
    
    void eat(){
        System.out.println("I am eating");
    }
}
class Dog extends AnimalIN {
    public static void main(String[] args){

        Dog d = new Dog();
        d.eat();
    }
}
