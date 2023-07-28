
public class Construct {

    public static void main(String args[]){
        Student s1 = new Student("Prachi");
        System.out.println(s1.name);


    }  
    }
    class Student{
        String name;
        int roll;

        Student(String name) { // parameterized constructor.
        this.name = name;
        }

    }
