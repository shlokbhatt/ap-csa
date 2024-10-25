package lambert.unit_4;

public class CountChar {


    public static void main(String[] args) {
        int count = 0;
        String str = "Pizza pizza";
        String targetString = "P";
        char targetCh = targetString.charAt(0);
        for(char ch: str.toCharArray()){
            if (Character.toLowerCase(ch) == Character.toLowerCase(targetCh)){
                count++;
            }
        }



        System.out.println(count);
    }
}
