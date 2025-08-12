package lab1;
import java.util.Scanner;
public class Calculatebill {
	public static void main(String[] args) {
		double bill,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bill:");
		 bill=sc.nextDouble();
		if(bill>1000) {
			result=bill-(bill*0.1);
		}else {
			result=bill-(bill*0.05);
		}
        System.out.println("Total Bill after discount: "+result);
    }
}
