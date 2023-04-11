import java.util.Scanner;
class Complex
{
	double real,img;
	Complex(double r,double i)
	{
		real=r;
		img=i;
	}
	public static Complex sum(Complex c1,Complex c2)
	{
	Complex temp=new Complex(0,0);
	temp.real=c1.real+c2.real;
	temp.img=c1.img+c2.img;
	return temp;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double r,i;
		System.out.println("enter the real number ");
		r=sc.nextDouble();
		System.out.println("enter img no ");
		i=sc.nextDouble();
		Complex c1=new Complex(r,i);
		System.out.println("enter the real number ");
		r=sc.nextDouble();
		System.out.println("enter img no ");
		i=sc.nextDouble();
		Complex c2=new Complex(r,i);
		Complex temp=sum(c1,c2);
		System.out.println("sum is " +temp.real+ " + " +temp.img+"i");
	}
}
