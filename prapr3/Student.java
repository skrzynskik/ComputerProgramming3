public class Student
{
    int age;
    String name;
    double avg_grade;
    int semester;
    
    String idcard;
    boolean isIdValid; 
    
       
    void sayHelllo(){
        System.out.println("Siemano kolano");
    };
    //void displayName(){
    //System.out.println(name);
    //}
    void displayAge(){
    System.out.println(age);
    };
    void displayInfo(){
    System.out.println("Imię: " + name + " semestr: "+ semester + " średnia ocen: " + avg_grade);
    };
    void cardStatus(){
    isIdValid = !isIdValid;
    };
    void displayID(){
    System.out.println(idcard);
    System.out.println("idcard valid?" + isIdValid);
    };
}
