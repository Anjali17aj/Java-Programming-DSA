package Bank;
public class Bank {
    public static void main(String args[]){
   BankAccount myAcc = new BankAccount(); //object of bank account
   myAcc.username = "Anjalikumari07";
   myAcc.setPassword("abcfghj"); //myAcc.password cannot be accessed because it is private in other class. but we can change password here because setPassword is public in other class.
   System.out.println(myAcc.username);
    }
}
class BankAccount {
    public String username; // public : username can be visible to anyone.
    private String password; //  private : password is not accescible outside this class.
    public void setPassword(String pswd){
        password = pswd; //this is accessible because password is private.
    }

}