package java_basicspack;
import java.util.Scanner;
public class calc {
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter first Number");
	int a=s.nextInt();
	System.out.println("Enter second Number");
	int b=s.nextInt();
	int c=a+b;
	int d=a-b;
	int e=a/b;
	int f=a*b;
	System.out.println("Sum= "+c);
	System.out.println("Difference= "+d);
	System.out.println("quotient= "+e);
	System.out.println("Product= "+f);
}
}