package lambert.unit_4;

public class ApproxPi {
    //The Leibniz approximation for pi is given as follows:
    // pi/4 = 1 - 1/3 + 1/5 - 1/7 + 1/9 - ...
    //Given a number of terms, return the Leibniz approximation for pi to that many terms
    //In: The number of terms to include (>= 1)
    //Out: The approximation of pi using the Leibniz formulation
    public static double approxPi(int terms) {
        double pi = 1.0;
        int denomOdd = 3;
        int denomEven = 5;
        while (terms > 0) {
            if (terms > 1 && terms % 2 == 1) {
                pi -= (1.0 / denomOdd);
                denomOdd += 4;
            } else if (terms == 1){
                pi += (1.0 / denomEven);
                denomEven += 4;
            }
            terms--;
        }
        return pi * 4.0;
    }

    public static void main(String[] args) {
        System.out.println(approxPi(1));
    }
}


/*The Leibniz approximation for pi is given as follows:

pi/4 = 1 - 1/3 + 1/5 - 1/7 + 1/9 - ...

Given a number of terms, return the Leibniz approximation for pi to that many terms
In: The number of terms to include (>= 1)
Out: The approximation of pi using the Leibniz formulation

Example 1
In: 1
Out: 4.0

Example 2
In: 25
Out: 3.1815766865350325*/
