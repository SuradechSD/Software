package Lab1;

import java.util.Scanner;

public class Form2 {
    public static void main(String[] args) {

        int x,y;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X : ");
        x = sc.nextInt();
        System.out.print("Enter Y : ");
        y =sc.nextInt();

        if (x == 0 && y == 0)
            System.out.print("Origin");

        else if (x > 0 && y > 0)
            System.out.print("Q1");

        else if (x < 0 && y > 0)
            System.out.print("Q2");

        else if (x < 0 && y < 0)
            System.out.print("Q3");

        else if (x > 0 && y < 0)
            System.out.print("Q4");

        else if (x == 0 && y > 0)
            System.out.print("Y-intercept");
        else if (x < 0 && y == 0)
            System.out.print("X-intercept");
        sc.close();  
    }
  
}
