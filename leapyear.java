import java.util.Scanner;
  class leapyear
 {
 
    public static void main(String[] args)
{
 
        int startYear, endYear, i;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Start Year:");
        startYear = in.nextInt();
        System.out.print("Enter the End Year:");
        endYear = in.nextInt();
        System.out.println("Leap years:");
       for (i = startYear; i <= endYear; i++) {
 
             
    if ( ( i % 4==0) && ( i % 100!=0) || ( i % 400==0) ){
               System.out.println(i);
            }
        }
    }
}
