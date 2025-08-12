package lab_2;

public class StringObject_assign_equals {

	public static void main(String[] args) {
		 char ch1[] = {'s','r','e','e','j','a'};
		    String s1 = new String(ch1);
		    String s2 = new String(s1);
		    System.out.println(s1+" equals "+s2+" > "+s1.equals(s2));
		    System.out.println(s1+" == "+s2+" > "+(s1==s2));
		  }

		}
		

		