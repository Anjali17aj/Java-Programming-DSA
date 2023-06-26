import java.util.*;
public class ReportCard {
    public static void main (String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks=sc.nextInt();
        String reportcard= (marks>=33) ? "PASS" : "FAIL";
        System.out.println(reportcard);
    }}