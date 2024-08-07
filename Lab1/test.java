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
*/

//=====================================================
        int b,n;
        Scanner sc = new Scanner(System.in);

        System.out.print("b : ");
        b = sc.nextInt();

        System.out.print("n : " );
        n = sc.nextInt();

        System.out.println("answer : "+ (b+n));
        sc.close();
        
    }
}
