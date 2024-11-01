package lambert.unit_4;

public class DiagonalPrint {
    /*Given a positive integer (n), return a string containing
     a n by n grid of asterisks except the positive diagonal
     (top left to lower right) is replaced by an O
     */
    public static String diagonalPrint(int n) {
        String returnString = "";
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == col) {
                    returnString += "O";
                } else {
                    returnString += "*";
                }
                returnString += " ";
            }
            if (row < n) {
                returnString += "\n";
            }
        }

        return returnString;
    }
}
