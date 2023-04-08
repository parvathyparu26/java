import java.util.Arrays;
class sortcharacter {
   public static void main(String args[]) {
      int temp, string_size;
      String input_string = "javaprogram";
      System.out.println("The string is defined as: " +input_string);
      char charArray[] = input_string.toCharArray();
      string_size = charArray.length;
      for(int i = 0; i < string_size; i++ ) {
         for(int j = i+1; j < string_size; j++) {
            if(charArray[i]>charArray[j]) {
               temp = charArray[i];
               charArray[i] = charArray[j];
               charArray[j] = (char) temp;
            }
         }
      }
      System.out.println("\nThe characters of the string after sorting is: "+Arrays.toString(charArray));
   }
}
