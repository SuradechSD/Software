package Lab2;

import java.util.Scanner;

public class Form21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please Input the number : ");
        String s = sc.nextLine();
        int sum = 0; // สร้างตัวแปรเพื่อบวกเลข
        /*
         * for(int i=0;i<s.charAt(i);i++){
         * sum = sum + Integer.parseInt(s.charAt(i)+"");
         * System.out.print(s.charAt(i));
         * if(i<s.length()-1){//
         * System.out.print("+");
         * }
         * }
         */
        // ---------------------------------------------------------------
        for (int i = 0; i < s.length(); i++) {
            sum = sum + Integer.parseInt(s.charAt(i) + ""); // แปลงตัวอักษรเป็นเลข
            System.out.print(s.charAt(i));
            {
                if (i < s.length() - 1) // ทำเพื่อใส่ + ให้ครบ
                    System.out.print(" + "); // ใส่ + ในระหว่างตัวอักษร
            }
        }
        // ---------------------------------------------------------------
        System.out.print(" = " + sum);
        sc.close();
    }
}
