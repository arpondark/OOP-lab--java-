import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static Icecream takeInput(){
        System.out.println("Type: ");
        String type = input.next();
        System.out.println("Company: ");
        String company = input.next();
        System.out.println("Price: ");
        double price = input.nextDouble();
        Icecream I = new Icecream(type, company, price);
        return I;
    }
    public static void displayIcecreams(Icecream[] icecreams, int n){
        for(int j=0; j<n; j++){
            System.out.println(icecreams[j].toString());
        }
    }
    public static void displayByCompany(Icecream[] icecreams, String company){

    }
    public static void printMaxIcecream(Icecream[] icecreams){

    }
    public static void main(String[] args) {
        // Main m = new Main();
        Icecream[] icecreams = new Icecream[10];
        int i = 0;
        while(true){
            System.out.println("1. Enter an icecream\n2. Display\n3. Search by company\n4. Expensive icecream\n0. Exit");
            int x = input.nextInt();
            if(x==0) break;
            if(x==1){
                icecreams[i] = takeInput();
                i++;
            }
            else if(x==2){
                displayIcecreams(icecreams, i);
            }
            else if(x==3){
                System.out.println("Enter the icecream you want to search: ");
                String company=input.next();
                displayByCompany(icecreams, company);
            }
            else if(x==4){
                printMaxIcecream(icecreams);
            }
        }
    }
}
