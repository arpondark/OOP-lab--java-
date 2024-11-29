import java.util.*;

public class Sol16 {
    public static void rmD(ArrayList<Integer> list) {
        boolean[] seen = new boolean[101];
        ArrayList<Integer> newList = new ArrayList<>();
        for (int num : list) {
            if (!seen[num]) {

                newList.add(num);
                seen[num] = true;
            }

        }
        list.clear();
        list.addAll(newList);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

    
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements of the array (0 to 100):");
        for (int i = 0; i < size; i++) {
            int element = scanner.nextInt();
            if (element < 0 || element > 100) {
                System.out.println("Invalid input! Elements must be between 0 and 100.");
                return;
            }
            list.add(element);
        }


        rmD(list);

        
        System.out.println("Array after removing duplicates:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
