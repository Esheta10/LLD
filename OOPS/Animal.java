class Animal{

    String color;
    int age;

    Animal() {}
    Animal(String c, int a){
        color = c;
        age = a;
    }

    public static void main(String args[]){

        Animal buzo = new Animal();
        buzo.color = "black";
        buzo.age = 10;

        System.out.println(buzo.color + " "  + buzo.age);
    }
}

