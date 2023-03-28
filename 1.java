class product 
{
    String pcode,pname;
    double price;
    public void readdata(String pc,String pn,double pr)
    {
        pcode=pc;
        pname=pn;
        price=pr;
    }
}
class test
{
    public static void main(String[] arg)
    {
        product p1=new product();
        product p2=new product();
        product p3=new product();
        p1.readdata("AAA","soap",25.40);
        p2.readdata("ABA","oil",101.00);
        p3.readdata("XYZ","shampoo",75.00);
        if((p1.price<p2.price)&&(p1.price<p3.price))
        {
            System.out.println("lowest price"+p1.price);
        }
        else if((p2.price<p1.price)&&(p2.price<p3.price))
        {
            System.out.println("lowest price"+p2.price);
        }
        else
        {
            
            System.out.println("lowest price"+p3.price);
        }
    }
}
