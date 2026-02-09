import java.util.Scanner;

public class CaesarCipher {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
       
        do {
            System.out.println("\n=== Caesar Cipher Program ===");
            System.out.println("What would you like to do next?");
            System.out.println("1. Encrypt the text");
            System.out.println("2. Decrypt the text");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
           
            switch (choice) {
                case 1:
                    encryptText(scanner);
                    break;
                case 2:
                    decryptText(scanner);
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            }
           
        } while (choice != 3);
       
        scanner.close();
    }
   
    public static void encryptText(Scanner scanner) {
        System.out.print("Enter text to encrypt: ");
        String plaintext = scanner.nextLine();
       
        System.out.print("Enter shift value: ");
        int shift = scanner.nextInt();
        scanner.nextLine(); // Consume newline
       
        String encrypted = caesarCipher(plaintext, shift);
        System.out.println("Encrypted text: " + encrypted);
    }
   
    public static void decryptText(Scanner scanner) {
        System.out.print("Enter encrypted text: ");
        String ciphertext = scanner.nextLine();
       
        System.out.print("Enter shift value: ");
        int shift = scanner.nextInt();
        scanner.nextLine(); // Consume newline
       
        // Decrypt by shifting in the opposite direction
        String decrypted = caesarCipher(ciphertext, -shift);
        System.out.println("Decrypted text: " + decrypted);
    }
   
    public static String caesarCipher(String text, int shift) {
        StringBuilder result = new StringBuilder();
       
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
           
            if (Character.isUpperCase(ch)) {
                // Shift uppercase letters
                char shifted = (char) ((ch - 'A' + shift + 26) % 26 + 'A');
                result.append(shifted);
            } else if (Character.isLowerCase(ch)) {
                // Shift lowercase letters
                char shifted = (char) ((ch - 'a' + shift + 26) % 26 + 'a');
                result.append(shifted);
            } else {
                // Keep non-alphabetic characters unchanged
                result.append(ch);
            }
        }
    
        return result.toString();
    }
}