import java.util.*;

public class Sol9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = in.nextInt();
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                line.add(in.nextInt());
            }
            lines.add(line);
        }

        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;
            if (x < lines.size() && y < lines.get(x).size()) {
                System.out.println(lines.get(x).get(y));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}