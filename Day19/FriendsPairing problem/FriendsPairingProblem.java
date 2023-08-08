//friends pairing problem  - Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.
//Goldman Sachs

public class FriendsPairingProblem {
    public static int friendsPair(int n) {
        if(n == 1 || n==2){
            return n;
        }
        // //choice
        // //1.single
        // int fnm1 = friendsPair(n-1);
        // //pair
        // int fnm2 = friendsPair(n-2);
        // int pairWays = (n-1) * fnm2;

        // //totalways
        // int totalways = fnm1 + pairWays;
        // return totalways;

        // solving through recursion.
        return friendsPair(n-1) + (n-1) * friendsPair(n-2); //single choice + how many pairs in total?* choice of pairing.

    }
    public static void main(String args[]){
        System.out.println(friendsPair(3));

    }
}
