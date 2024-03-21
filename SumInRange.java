import java.util.Scanner;

public class SumInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter low: ");
        int low = scan.nextInt();

        System.out.print("Enter high: ");
        int high = scan.nextInt();
        int sumHigh = (high * (high + 1)) / 2;
        int sumLowMinusOne = ((low - 1) * low) / 2;
        int sumInRange = sumHigh - sumLowMinusOne;

        System.out.println("Sum = " + sumInRange);
    }
}
