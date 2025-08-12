package lab1;

public class Apple_intow_bags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jBag=5;
		int tBag=3;
        System.out.println("Before swapping:");
        System.out.println("Tom's bag has " +tBag+ " apples ");
        System.out.println("Jerry's bag has " +jBag+ " apples ");
        int temp=tBag;
        tBag=jBag;
        jBag=temp;
        System.out.println("\nAfter swapping:");
        System.out.println("Tom's bag has " +tBag+ " apples");
        System.out.println("Jerry's bag has " +jBag+ " apples");

    }
}
