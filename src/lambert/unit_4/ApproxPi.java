package lambert.unit_4;

public class ApproxPi {
    //The Leibniz approximation for pi is given as follows:
    // pi/4 = 1 - 1/3 + 1/5 - 1/7 + 1/9 - ...
    //Given a number of terms, return the Leibniz approximation for pi to that many terms
    //In: The number of terms to include (>= 1)
    //Out: The approximation of pi using the Leibniz formulation
    public static double approxPi(int terms) {
        int index = 2;
        double pi = 1.0;
        int counter = 3;
        boolean minusSign = true;

        while (index <= terms) {
            if (minusSign) {
                pi -= (1.0/counter);
            } else {
                pi += (1.0/counter);
            }
            minusSign = !minusSign;
            index++;
            counter += 2;
        }
        return pi * 4;
    }

    public static void main(String[] args) {
        System.out.println(approxPi(25));
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
