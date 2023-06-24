public class solve5 {
public static void main(String[] args){
int x, y, z;
x = y = z = 2;
x += y; //4
y -= z; //4
z /= (x + y); //4
System.out.println(x + " " + y + " " + z);
}
}
