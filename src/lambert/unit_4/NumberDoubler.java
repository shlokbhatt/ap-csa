package lambert.unit_4;

public class NumberDoubler {
    //Take an input and count how many times you have to double it before it reaches 100
    //In: A number to be doubled.  Will not be 0.
    //Out: The number of times the number must be doubled before it's >99 or <-99
    public int doubleNum(int input) {
        int count = 0;
        while (input <= 99 && input >= -99) {
            input *= 2;
            count++;
        }
        return count;
    }
}
/*Take an input and count how many times you have to double it before it reaches 100
In: A number to be doubled. Will not be 0.
Out: The number of times the number must be doubled before it's >99 or <-99

Example 1
In: 50
Out: 1

Example 2
In: -14
Out: 3

Example 3
In: 123
Out: 0*/