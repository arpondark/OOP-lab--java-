import java.util.*;

public class sol12 {
    public static boolean ck(int[] nums) {
        HashSet<Integer> element = new HashSet<>();
        for (int num : nums) {
            if (!element.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int s = input.nextInt();
        int[] nums = new int[s];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < s; i++) {
            nums[i] = input.nextInt();
        }
        if(ck(nums))
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        input.close();

    }

    
}