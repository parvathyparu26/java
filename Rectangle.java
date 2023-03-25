public class Rectangle
{
double len;
double bre;
void setdata(double l,double b)
{
len=l;
System.out.println("length is:"+len);
bre=b;
System.out.println("breadth is:"+bre);
}
void getarea()
{
double area;
area=len*bre;
System.out.println("area is:"+area);
}
public static void main(String args[])
{
Rectangle obj=new Rectangle();
obj.setdata(12.48,13.0);
obj.getarea();
}
}
