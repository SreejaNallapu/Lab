package lab_3;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string ");
	        String input = sc.nextLine();
	        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
	        StringBuilder sb = new StringBuilder(cleanedInput);
	        String reversed = sb.reverse().toString();
	        if (cleanedInput.equals(reversed)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }
	}
}