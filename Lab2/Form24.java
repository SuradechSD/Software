package Lab2;

import java.util.Scanner;

public class Form24 {

	public static void main(String[] args) {

        String text,newtext;

		System.out.print("Enter sentence : ");
		Scanner scanner = new Scanner(System.in);
		text = scanner.nextLine();
//------------------------------------------------------------


        newtext = text.replaceAll("happy", "bell happy") .replaceAll("sad","bell sad");


//------------------------------------------------------------
		System.out.print("---"+newtext);
        scanner.close();
	}
}		
//String[] words = text.split(" ");
//String[] text = (scanner.nextLine()).split(" ");
