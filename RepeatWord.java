import java.util.Scanner;

public class RepeatWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String inputWord = scan.nextLine();

        int times = inputWord.length();

        for (int i = 0; i < times; i++) 
            System.out.println(inputWord);
    }
}
