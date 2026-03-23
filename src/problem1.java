import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {

        System.out.print("Enter the first number");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.print("Enter the second number");
        // Scanner sc=new Scanner(System.in);
        int n2 = sc.nextInt();
        System.out.print("Enter the third number");
        // Scanner sc=new Scanner(System.in);
        int n3 = sc.nextInt();
        if (n1 > n2 && n1 > n3) {
            System.out.print("The first number is largest");
        } else if (n2 > n3 && n2 > n1) {
            System.out.println("The second number is largest");
        } else {
            System.out.println("The third number is largest");
        }

        sc.close();

    }

}
