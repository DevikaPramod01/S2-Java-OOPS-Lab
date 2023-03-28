class product 
{
    String pcode,pname;
    double price;
    prod(String pc,String pn,double pr)
    {
        pcode=pc;
        pname=pn;
        price=pr;
    }
}
class test
{
    public static void main(String[] args)
    {
        product p1=new product("AAA","soap",25.40);
        product p2=new product("ABA","oil",101.00);
        product p3=new product("XYZ","shampoo",75.00);

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
