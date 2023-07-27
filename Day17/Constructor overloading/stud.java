//constructor overloading
public class stud {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Prachi");
        Student s3 = new Student("Anjali",17);
    }
    
}

class Student{
    String name;
    int roll_no;
     
    Student(){
        System.out.println("Constructor overloadings");
    }
    Student(String name){
        this.name = name;
    }
    Student(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }
}
