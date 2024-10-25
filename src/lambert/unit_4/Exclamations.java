package lambert.unit_4;

public class Exclamations {
    //Given a string, return that string where every character is followed by an exclamation mark
    public String exclamation (String input) {
        char [] inputList = input.toCharArray();
        StringBuilder returnString = new StringBuilder();
        for (char ch : inputList) {
            returnString.append(ch);
            returnString.append("!");
        }
        return returnString.toString();
    }
}
/*Given a string, return that same string with every character followed by an exclamation mark

Example 1
In: pizza
Out: p!i!z!z!a!

Example 2
In: I am sleepy
Out: I! !a!m! !s!l!e!e!p!y!*/
