import java.util.*;

public class QuadraticClient {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("a: ");
		double a=input.nextDouble();
		System.out.print("b: ");
		double b=input.nextDouble();
		System.out.print("c: ");
		double c=input.nextDouble();
		System.out.println("Description of the graph of: ");
		System.out.println("y = "+a+"x^2 + "+b+"x + "+c);
	}

}
