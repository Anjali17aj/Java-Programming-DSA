public class BinTdec {
    public static void BinToDec(int binNum){
        int mynum=binNum;
        int pow=0;
        int dec=0;

        while(binNum>0) {
           int lastDig= ( binNum % 10);
           dec=dec+(lastDig*(int)Math.pow(2,pow));
           pow++;
           binNum = binNum/10;
        }
        System.out.println("Decimal of " + mynum + " = " +dec);

    }
    public static void main(String args[]){
        BinToDec(101);

    }
}