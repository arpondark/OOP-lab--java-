import java.util.*;

public class Sol11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sen = in.nextLine();
        String[] words = sen.split(" ");
        String large="";
        for (String word : words) {
            if (word.length() > large.length()) {
                large = word;
            }
        }
        System.out.println(large);
    }
}
