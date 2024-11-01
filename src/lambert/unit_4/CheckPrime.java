package lambert.unit_4;

public class CheckPrime {
    public boolean checkPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
/*Given a positive int, determine whether or not it is prime
In: A positive int >= 2
Out: A boolean describing whether or not that number is prime

Example 1
In: 23
Out: true

Example 2
In: 120
Out: false
*/
