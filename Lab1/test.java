package Lab1;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
/* 
        int x,y,num;
        Scanner sc = new Scanner(System.in);
//-----------------------------------------------------
        System.out.print("number x = ");                
        x = sc.nextInt();
        System.out.print("number Y = ");
        y = sc.nextInt();
//-----------------------------------------------------
        num = x+y;
//-----------------------------------------------------
        System.out.println(num);


//=====================================================
        int b,n;
        Scanner sc = new Scanner(System.in);

        System.out.print("b : ");
        b = sc.nextInt();

        System.out.print("n : " );
        n = sc.nextInt();

        System.out.println("answer : "+ (b+n));
        sc.close();
*/        
    
        double side , length , number;

        Scanner triangle = new Scanner(System.in);

        System.out.println("Enter triangle side :");
        side = triangle.nextDouble();
        System.out.println("Enter prism length :");
        length = triangle.nextDouble();

        number = (((Math.sqrt(3)/4)*Math.pow(side, 2)*2)+(side*length)*3);

        System.out.println(number);

        triangle.close();

}














}
