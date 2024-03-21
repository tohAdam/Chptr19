import java.util.Scanner;

public class CharacterPerLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scan.nextLine();

        for (int i = 0; i < word.length(); i++) 
            System.out.println(word.charAt(i));
    }
}
