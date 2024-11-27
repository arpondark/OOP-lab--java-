import java.util.*;

public class Sol5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        in.close();
        a = a.replaceAll("\\s", "");
        boolean isPlandroem = true;
        int len = a.length();
        for (int i = 0; i < len / 2; i++) {
            if (a.charAt(i) != a.charAt(len - i - 1)) {
                isPlandroem = false;
                break;
            }
        }
        if (isPlandroem) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }
}
