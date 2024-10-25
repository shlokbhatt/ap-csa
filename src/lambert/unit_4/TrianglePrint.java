package lambert.unit_4;

public class TrianglePrint {
    public String triPrint(int n) {
        String countDown = "";
        int initialNum = n;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < initialNum; j++) {
                countDown += (initialNum - j);
                if (j != initialNum) {
                    countDown += " ";
                }
            }
            if (i != n - 1) { // Only add a newline if it's not the last iteration
                countDown += "\n";
            }
            initialNum--;
        }
        return countDown;
    }
}
