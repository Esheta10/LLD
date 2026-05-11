class Employee{

    String emp_id;
    String emp_name;
    Address addr;

    Employee(String emp_id1, String emp_name1, Address addr1){

        emp_id = emp_id1;
        emp_name = emp_name1;
        addr = addr1;
    }

    void showEmpDetails(){

        System.out.println("Employee-ID: " + emp_id);
        System.out.println("Employee name: " + emp_name);

        System.out.println("Employee Adddress Details");
        System.out.println("Location: " + addr.location);
        System.out.println("City: " + addr.city);
        System.out.println("State: " + addr.state);

        System.out.println("-----------------------------------");
    }
}
class Address{

    String location;
    String city;
    String state;

    Address(String location1, String city1, String state1){

        location = location1;
        city = city1;
        state = state1;
    }
}
class OneToOneDemo {
    
    public static void main(String[] args){
        
        Address ad1  = new Address("M.G Road", "Kolkata", "West Bengal");
        Employee emp1 = new Employee("101","Deepak", ad1);
        emp1.showEmpDetails();

        Address ad2 = new Address("Park Street", "Kolkata", "West Bengal");
        Employee emp2 = new Employee("102", "Esheta", ad2);
        emp2.showEmpDetails();
    }
}
