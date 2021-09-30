import java.util.*;
class product{
    int pcode;
    String pname;
    double price;


}

public class pgm6 {
    public static void main(String args[]){
product p1=new product();
product p2=new product();
product p3=new product();
Scanner s=new Scanner(System.in);
System.out.println("enter pcode,name and price of 1st product");
p1.pcode=s.nextInt();
p1.pname=s.toString();
p1.price=s.nextDouble();
System.out.println("enter pcode,name and price of 2st product");
p2.pcode=s.nextInt();
p2.pname=s.toString();
p2.price=s.nextDouble();
System.out.println("enter pcode,name and price of 3st product");
p3.pcode=s.nextInt();
p3.pname=s.toString();
p3.price=s.nextDouble();
System.out.println("product 1");
System.out.println(p1.pcode+"\t"+p1.pname+"\t"+p1.price);
System.out.println("product 2");
System.out.println(p2.pcode+"\t"+p2.pname+"\t"+p2.price);
System.out.println("product 3");
System.out.println(p3.pcode+"\t"+p3.pname+"\t"+p3.price);

if(p1.price<p2.price && p1.price<p3.price)
System.out.println("low="+p1.price);
if(p2.price<p1.price && p2.price<p3.price)
System.out.println("low="+p2.price);
else

System.out.println("low="+p3.price);
    }
    
}
