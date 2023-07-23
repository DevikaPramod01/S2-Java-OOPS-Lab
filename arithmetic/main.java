package arithmetic;
import arithmetic.operations.sum;
import arithmetic.operations.div;
import arithmetic.operations.mul;
import arithmetic.operations.sub;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();
        sum obj1 =new sum();
        obj1.cal(a,b);
        sub obj2 =new sub();
        obj2.cal(a,b);
        mul obj3 = new mul();
        obj3.cal(a,b);
        div obj4 = new div();
        obj4.cal(a,b);
    }

}