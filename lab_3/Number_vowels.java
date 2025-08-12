package lab_3;
import java.util.Scanner;
public class Number_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string ");
        String input=sc.nextLine();
        String lowerInput=input.toLowerCase();
        int vowelCount=0;
        for (int i=0;i<lowerInput.length();i++) {
            char ch=lowerInput.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowelCount++;
            }
        }
        System.out.println("Number of vowel" + vowelCount);
	}

}
