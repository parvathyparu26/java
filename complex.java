import java.util.Scanner;
class complex
{
public static void main(String arg[])
{
Scanner s=new Scanner(System.in);
int a,b,c,d;
System.out.println("Enter the fist complex number");
a=s.nextInt();
b=s.nextInt();
System.out.println("The number is: "+a+"+"+b+"i");
System.out.println("Enter the second complex number");
c=s.nextInt();
d=s.nextInt();
System.out.println("The number is:"+c+""+""+d+"i");
System.out.println("The Sum is :"+ (a+c) + " + "+ (b+d) +"i");
}
}
