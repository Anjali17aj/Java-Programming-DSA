
public class Copy {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Prachi";
        s1.roll = 17;
        s1.password = "abfg";

        Student s2 = new Student(s1);//in case s1 forgets its password so we created s2.
        //now I want properties of s1 to be copied to s2.
        s2.password = "io@lk"; //s2 gets a new password
    }
}

class Student{
    String name;
    int roll;
    String password;

    //copy constructor
    Student(Student s1){ //for properties of s1 to be copied to s2 we creator a constructor. Student s2 constructor is taken as a parameter for student.
      this.name = s1.name;
      this.roll = s1.roll;
    }
    Student(){
        System.out.println("Copy constructor");
    }
    Student(String name){
        this.name = name;
    }
    
}
