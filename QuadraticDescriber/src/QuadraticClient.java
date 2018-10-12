import java.util.*;

public class QuadraticClient {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		boolean running=true;
		while(running) {
			System.out.println("Provide values for coefficients a, b, and c");
			System.out.print("a: ");
			double a=input.nextDouble();
			if (a!=0) {
				System.out.print("b: ");
				double b=input.nextDouble();
				System.out.print("c: ");
				double c=input.nextDouble();
				Quadratic.quadrDescriber(a, b, c);
			} else {
				System.out.println("Not a quadratic (a=0).");
			}
			System.out.println("Do you want to keep going? (Type quit to end)");
			String answer=input.nextLine();
			if(!Objects.equals(answer, "quit")) {
				running=false;
			}
		}
	}
}
