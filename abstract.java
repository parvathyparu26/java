import java.util.Scanner;

abstract class Shape{
    abstract void Findarea();
}

class Rectangle extends Shape{
    double length,breadth;
    Rectangle(double len,double bre){
        this.length=len;
        this.breadth=bre;
    }
    void Findarea(){
            double area=length*breadth;
            System.out.println("Area of rectangle is :"+area);
    }
}

class Square extends Shape{
    double side;
    Square(double s){
        this.side=s;
    }
    void Findarea(){
            double area=side*side;
            System.out.println("Area of square is :"+area);
    }
}

class Circle extends Shape{
    double radius;
    Circle(double r){
        this.radius=r;
    }
    void Findarea(){
        double area=3.14*radius*radius;
        System.out.println("Area of circle is :"+area);
    }
}

class Abstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle :");
        double radius=sc.nextDouble();
        Circle obj=new Circle(radius);
        obj.Findarea();

        System.out.print("Enter the side of the square :");
        double side=sc.nextDouble();
        Square obj1=new Square(side);
        obj1.Findarea();

        System.out.print("Enter the length of the rectangle :");
        double length=sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle :");
        double breadth=sc.nextDouble();
        Rectangle obj2=new Rectangle(length,breadth);
        obj2.Findarea();

        sc.close();
    }
}
