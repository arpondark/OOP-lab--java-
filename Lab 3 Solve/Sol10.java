import java.util.*;
public class Sol10 {
    public static ArrayList<Integer> generateFibonacci(int n) {
        ArrayList<Integer> fib = new ArrayList<Integer>();
        if (n > 0) fib.add(0);
        if (n > 1) fib.add(1);

        for (int i = 2; i < n; i++) {
            fib.add(fib.get(i - 1) + fib.get(i - 2));
        }
        return fib;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int n = scanner.nextInt();

        System.out.println(generateFibonacci(n));
    }
}
