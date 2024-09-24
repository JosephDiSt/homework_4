import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String originalStr = scanner.nextLine(); 
        String reversedStr = "";
        for (int i = 0; i < originalStr.length(); i++) {
            
            reversedStr = originalStr.charAt(i) + reversedStr;
        }
        System.out.println("Reversed string: " + reversedStr);
        scanner.close();
    }
}

