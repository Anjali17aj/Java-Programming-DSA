public class SD {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Anjali";
        s1.roll = 17;
        s1.password = "aj@1707";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); // copying s1 to s2 then changing things below.
        s2.password = "cvb";
        s1.marks[2] = 100; //marks changed here for s2 but since it is a program of deep copy so change done here will not be reflected in the output.
        for (int i=0; i<3; i++) {
            System.out.println(s2.marks[i]); //printing s2 marks
        }

    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    Student() {
        marks = new int[3];
        System.out.println("Copy constructor");
    }

    // shallow copy constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // } 
    //  s2.password = "cvb"; //lines above in main
    //     s1.marks[2] = 100;//marks changed  for s2 but since it is a program of shallow copy so all the change done in s2 will be reflected in the output.

    //deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length ; i++){//for loop for copying marks one by one.
         this.marks[i] = s1.marks[i];
}

    }
}

