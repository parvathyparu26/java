public class Complex {
    int real,img;
    Complex(int real, int img)
    {
        this.real = real;
        this.img = img;
    }

    void display()
    {
        System.out.println("The Complex numbers is:");
        System.out.println(this.real+"+"+this.img+"i");
    }

    void addition(Complex other)
    {
        int t1 = this.real+other.real;
        int t2 =this.img+other.img;

        System.out.println("The sum of complex number is");
        System.out.println(t1+"+"+t2+"i");
    }

    public static void main(String args[])
    {
        Complex c1 = new Complex(3,4);
        Complex c2 = new Complex(5, 2);
        c1.display();
        c2.display();
        c1.addition(c2);
        
    }
}
