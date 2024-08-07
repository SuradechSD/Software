package Lab3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book book1 = new Book();

        book1.name = "harrypotter";//ใส่ชื่อหนังสือใน book1
        book1.author = "JK Rowling";//ใส่ชื่อผู้แต่งใน book1
        book1.year = 2542;
        book1.price = 100;

        System.out.print("Enter book name : ");
        String namebook = sc.nextLine();//ทำเพื่อใส่ชื่อหนังสือเองถ้าไม่ได้ใช้ book1.name
        System.out.print("Enter book price : ");
        int pricebook = sc.nextInt();//ทำเพื่อใส่ราคาเองถ้าไม่ได้ใช้ book1.price

        System.out.print("Book : "+namebook+"\n"+"Written by "+book1.author
                            +" in "+book1.year+"\n"+"Price is :"+pricebook+" Baht");
        
        sc.close();

    }
}
