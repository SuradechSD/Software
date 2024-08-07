package Lab1;

import java.util.Scanner;

public class Form1 {
    public static void main(String[] args) {

        double side,lenght,num;
        Scanner sc = new Scanner(System.in);

        System.out.print("enter triengle side : ");
        side = sc.nextDouble();
        System.out.print("enter prism lenght : ");
        lenght = sc.nextDouble();

        //num = (((Math.sqrt(3)/4)*Math.pow(side, 2)));
        num = (((Math.sqrt(3)/4)*Math.pow(side, 2)*2))+(side*lenght)*3;
        
        System.out.print("Surface area of prism is : "+num);

        sc.close();
    }
}
