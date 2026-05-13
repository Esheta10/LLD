// Multiple students learning multiple languages
class Student {

    String name;
    String roll_no;
    Languages[] lang;

    Student(String name1, String roll_no1, Languages[] lang1){

        name = name1;
        roll_no = roll_no1;
        lang = lang1;
    }
 
    void getStudentDetails(){

        System.out.println("Student roll number: "+ roll_no);
        System.out.println("Student name: " + name);
        for(int i=0; i<lang.length; i++){

            System.out.println("Language code: " + lang[i].langcode + 
                                " Language name: " + lang[i].langname);
        }
        System.out.println("---------------------------------------------------");
    }
}
class Languages{

    String langcode;
    String langname;

    Languages(String langcode1, String langname1){

        langcode = langcode1;
        langname = langname1;
    }
}
public class ManyToManyDemo {
    
    public static void main(String[] args) {
        
        Languages l1 = new Languages("Java101", "Java");
        Languages l2 = new Languages("C++102", "C++");
        Languages l3 = new Languages("Py103", "Python");

        Languages[] lang = {l1,l2,l3};

        Student s1 = new Student("Deepak","101", lang);
        Student s2 = new Student("Deepika", "102", lang);
        Student s3 = new Student("Esheta","103", lang);

        s1.getStudentDetails();
        s2.getStudentDetails();
        s3.getStudentDetails();

    }
}
