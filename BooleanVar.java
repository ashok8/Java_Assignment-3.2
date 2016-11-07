import java.util.*;
public class BooleanVar {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please Enter S1: ");
		String s1 = scan1.next();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Please Enter S2: ");
		String s2 = scan2.next();
		System.out.printf("s1=%s, s2=%s\n", s1,s2);
		boolean same = s1.equals(s2);
		System.out.printf("Same= %b",same);
		
	}

}
