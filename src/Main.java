import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        for (int i =1; i<=num ; i*=2){
            System.out.println("Math pow 2 is :"+i);
        }
        System.out.println("**************");
        for (int i =1; i<=num ; i*=4){
            System.out.println("Math pow 4 is :"+i);
        }
        System.out.println("**************");

        for (int i =1; i<=num ; i*=5){
            System.out.println("Math pow 5 is :"+i);
        }






    }
}