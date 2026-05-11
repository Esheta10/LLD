// Many Students can register under one Branch
class Student{

    String roll_no;
    String name;
    Branch branch;

    Student(String roll_no1, String name1, Branch branch1){

        roll_no = roll_no1;
        name = name1;
        branch = branch1;
    }

    void getStudentDetails(){

        System.out.println("Student roll_no: " + roll_no);
        System.out.println("Student name: " + name);
        System.out.println("Student Branch Details");
        
        System.out.println("Branchname: " + branch.branchname);
        System.out.println("Branchcode: " + branch.branchcode);

        System.out.println("---------------------------------------------");
    }

}

class Branch{

    String branchname;
    String branchcode;

    Branch(String branchname1, String branchcode1){

        branchname = branchname1;
        branchcode = branchcode1;
    }
}
public class ManyToOneDemo {
    
    public static void main(String[] args) {
        
        Branch b1 = new Branch("CSE101", "CSE");

        Student s1 = new Student("101", "Deepak" , b1);
        Student s2 = new Student("102", "Deepika", b1);
        Student s3 = new Student("103","Esheta", b1);

        s1.getStudentDetails();
        s2.getStudentDetails();
        s3.getStudentDetails();
    }
}
