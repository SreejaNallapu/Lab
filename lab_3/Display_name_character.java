package lab_3;
import java.util.Scanner;
public class Display_name_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name ");
        String name=sc.nextLine();
        System.out.println("Your name character ");
        for (int i=0;i<name.length(); i++) {
            System.out.println(name.charAt(i));
        }

	}

}
