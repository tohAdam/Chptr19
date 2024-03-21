import java.util.Scanner;

public class WordIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String firstWord = scan.nextLine();

        System.out.print("Enter second word: ");
        String secondWord = scan.nextLine();
        int dotCount = 30 - (firstWord.length() + secondWord.length());

        System.out.print(firstWord);
        for (int i = 0; i < dotCount; i++) 
            System.out.print(".");
            System.out.println(secondWord);
    }
}
