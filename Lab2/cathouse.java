package Lab2;

import java.util.Scanner;

public class cathouse {

    public static void main(String[] args) {

        String cat,condo;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence : ");
        cat = sc.nextLine();

        condo = cat.replaceAll("house", "cardboard box");

        System.out.println(condo);

        sc.close();

    }
}
