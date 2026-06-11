package SOLID_PRINCIPLES.SRP;

/*  Single Responsibility Principle ---> One class, one responsiblity
*/
class Bakery{
    public void makeBread(){
        System.out.println("Making bread...");
    }
}

class Inventory{
    public void manageInventory(){
        System.out.println("Managing inventory...");
    }
}

class Supplies{
    public void orderSupplies(){
        System.out.println("Ordering supplies...");
    }
}

class Service{
    void customerService(){
        System.out.println("Ensuring proper customer service...");
    }
}

class Cleaning{
    void cleanTables(){
        System.out.println("Cleaning tables...");
    }
}

class SRP{
    public static void main(String[] args) {
        
        Bakery baker = new Bakery();
        Inventory inv = new Inventory();
        Supplies sup = new Supplies();
        Service serve = new Service();
        Cleaning clean = new Cleaning();

        baker.makeBread();
        inv.manageInventory();
        sup.orderSupplies();
        serve.customerService();
        clean.cleanTables();
    }
}
