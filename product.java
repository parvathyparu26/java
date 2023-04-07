import java.io.*; 
public class Product
{
	String pcode;
	String pname;
	int price;
	Product(String pcode_get, String pname_get, int price_get)
	{
	pcode = pcode_get;
	pname = pname_get;
	price = price_get;
	}
	
	public static void main(String[] args) 
	{
		Product p_1 = new Product("A123", "TV", 2);
		Product p_2 = new Product("B123", "RADIO", 21);
		Product p_3 = new Product("C123", "DVD", 15);
		if (p_1.price <= p_3.price && p_1.price <= p_2.price)
			System.out.println("Lowest product and price : " + p_1.price   +   p_1.pname);
		if (p_3.price <= p_1.price && p_3.price <= p_2.price) 
			System.out.println("Lowest product price  : " + p_3.price  +   p_3.pname);
		if (p_2.price <= p_3.price && p_2.price <= p_1.price)
			System.out.println("Lowest product and price : " + p_2.price   +   p_2.pname);
	}
}
