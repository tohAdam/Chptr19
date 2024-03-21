import java.util.Scanner;

public class PrintIntegersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Start: ");
        int start = scan.nextInt();

        System.out.print("Enter End: ");
        int end = scann.nextInt();

        System.out.println("\nIntegers between " + start + " and " + end + ":");

        for (int i = start; i <= end; i++) 
            System.out.println(i);
    }
}
