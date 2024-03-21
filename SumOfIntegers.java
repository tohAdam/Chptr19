import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = scan.nextInt();
        int loopSum = 0;
        for (int i = 1; i <= N; i++) {
            loopSum += i;
        }
        int formulaSum = (N * (N + 1)) / 2;

        System.out.println("Loop Sum = " + loopSum);
        System.out.println("Formula Sum = " + formulaSum);
    }
}
