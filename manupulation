import java.util.Scanner;

public class Stringmanipulate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        
        System.out.print("Enter a string to concatenate: ");
        String strToConcat = scanner.nextLine();
        String concatenatedStr = str.concat(strToConcat);
        System.out.println("Concatenated string: " + concatenatedStr);
        
        
        System.out.print("Enter a character to replace: ");
        char oldChar = scanner.nextLine().charAt(0);
        System.out.print("Enter a character to replace with: ");
        char newChar = scanner.nextLine().charAt(0);
        String replacedStr = str.replace(oldChar, newChar);
        System.out.println("Replaced string: " + replacedStr);
        
        
        char[] charArray = str.toCharArray();
        System.out.print("Character array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        
        
        int length = str.length();
        System.out.println("Length of string: " + length);
        
       
        System.out.print("Enter a substring to search for: ");
        String subStr = scanner.nextLine();
        int index = str.indexOf(subStr);
        if (index == -1) {
            System.out.println("Substring not found.");
        } else {
            System.out.println("Index position of substring: " + index);
        }
        
        
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseStr);
        
        
        StringBuffer stringBuffer = new StringBuffer(str);
        
       
        System.out.print("Enter a string to concatenate: ");
        String strToConcat2 = scanner.nextLine();
        stringBuffer.append(strToConcat2);
        System.out.println("Concatenated string: " + stringBuffer.toString());
        
        
        int stringBufferLength = stringBuffer.length();
        System.out.println("Length of StringBuffer: " + stringBufferLength);
        
       
        System.out.print("Enter a position to insert substring: ");
        int position = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter a substring to insert: ");
        String subStrToInsert = scanner.nextLine();
        stringBuffer.insert(position, subStrToInsert);
        System.out.println("StringBuffer after insertion: " + stringBuffer.toString());
    }
}
