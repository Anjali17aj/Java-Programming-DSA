class Test{
    static int marks;
    void set_marks(int marks){
        this.marks = marks; //line 1
    }
}
public class practice {
    public static void main(String args[]){
        Test t = new Test();
        t.set_marks(17);//line 2
        System.out.println(Test.marks);//line 3
    }
}
