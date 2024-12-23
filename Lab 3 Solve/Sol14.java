import java.util.*;

public class Sol14 {

    public static void move(int[] nums)

    {
        int i = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[i++] = num;
            }
        }
        while (i < nums.length) {
            nums[i++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        int[] nums = new int[s];
        for (int i = 0; i < s; i++) {
            nums[i] = input.nextInt();
        }
        move(nums);
        System.out.println("Array after moving zeros to the end:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
