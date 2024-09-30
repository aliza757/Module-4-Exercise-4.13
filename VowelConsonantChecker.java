import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);
        
        if (!Character.isLetter(letter)) 
        {
            System.out.println(letter + " is an invalid input");
        } 
        else 
        {
            if (letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I' || letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U') 
            {
                System.out.println(letter + " is a vowel");
            } 
            else 
            {
                System.out.println(letter + " is a consonant");
            }
        }
    }
}
