import java.util.*;

public class Sol7 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = generate(100, 1, 1000);
        fSec(numbers);
        fSmall(numbers);
    }

    public static ArrayList<Integer> generate(int size, int min, int max) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(max - min + 1) + min);

        }
        return list;
    }

    public static void fSec(ArrayList<Integer> numbers) {
        int large =Integer.MIN_VALUE, secLarge = Integer.MIN_VALUE;
        int index1 = -1,index2=-1;
        for(int i=0;i< numbers.size();i++)
        {
            int c = numbers.get(i);
            if(c>large)
            {
                secLarge = large;
                index2 = index1;
                large=c;
                index1=i;
            }
            else if(c>secLarge && c !=large)
            {
                secLarge = c;
                index2=i;
            }
        }
        System.out.println("Second Largest: " + secLarge + " at index " + index2);
    }

    public static void fSmall(ArrayList<Integer> numbers)
    {
        int small = Integer.MAX_VALUE, secSmall = Integer.MAX_VALUE;
        int inA = -1, inB=-1;
        for(int i=0;i<numbers.size();i++){
            int c = numbers.get(i);
            if(c<small)
            {
                secSmall = small;
                inB = inA;
                small= c;
                inA= i;

            }
            else if(c<secSmall &&  c!= small)
            {
                secSmall = c;
                inB= i;
            }
        }
        System.out.println("Second Small: " + secSmall + " at index " + inB);
    }

}