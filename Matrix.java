import java.util.*;
class Matrix
{
public static void main(String args[])
{
int r,c,i,j;
Scanner s=new Scanner(System.in);
System.out.println("Enter the row and column:");
r=s.nextInt();
c=s.nextInt();
int m1[][]=new int[r][c];
int m2[][]=new int[r][c];
int sum[][]=new int[r][c];
System.out.println("Enter the 1st matrix");
for(i=0;i<r;i++)
for(j=0;j<c;j++)
m1[i][j]=s.nextInt();
System.out.println("Enter the 2nd matrix");
for(i=0;i<r;i++)
for(j=0;j<c;j++)
m2[i][j]=s.nextInt();
for(i=0;i<r;i++)
for(j=0;j<c;j++)
sum[i][j]=m1[i][j]+m2[i][j];
System.out.println("sum of matrix");
for(i=0;i<r;i++)
{
System.out.println(" ");
for(j=0;j<c;j++)
{
System.out.print(sum[i][j]+" ");
}
}
}
}

