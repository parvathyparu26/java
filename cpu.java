class cpu
{
double price;
String name;
cpu(double p,String name1)
{
price=p;
name=name1;
}
class processor
{
int cores;
String manufact;
processor(int core,String m)
{
core=core;
manufact=m;
}
}
static class ram
{
String memory;
String manufact;
ram(String mem,String man)
{
memory=mem;
manufact=man;
}
}
public static void main(String args[])
{
cpu c=new cpu(1800,"intel");
cpu.processor p=c.new processor(8,"intel");
cpu.ram r=new cpu.ram("18gb","crucial");
System.out.println("processor name="+c.name+"\nprocessor price="+c.price);
System.out.println("processor cores="+p.cores+"\nprocessor manufact name="+p.manufact);
System.out.println("memory capacity="+r.memory+"\nram manufact="+r.manufact);
}
}
