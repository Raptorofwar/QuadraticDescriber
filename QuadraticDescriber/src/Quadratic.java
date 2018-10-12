
public class Quadratic {
	public static void quadrDescriber(double a, double b, double c) {
		String opens;
		if (a>0) {
			opens="Up";
		}else {
			opens="Down";
		}
		double h= findH(a, b, c);
		double k=a*square(h)+b*h+c;
		double posRoot = posQuadForm(a, b, c);
		double negRoot = negQuadForm(a, b, c);
		System.out.println("Description of the graph of: ");
		System.out.println("y= "+a+" x^2 + "+b+" x + "+c);
		System.out.println();
		System.out.println("Opens: "+opens);
		System.out.println("Axis of symmetry: "+h);
		System.out.println("Vertex: ("+h+", "+k+")");
		System.out.print("x-intercept(s): ");
		if (posRoot==negRoot) {
			System.out.println(posRoot);
		} else {
			System.out.println(posRoot+" and "+negRoot);
		}
		System.out.println("y-intercept: "+c);
	}
	
	public static double posQuadForm(double a, double b, double c) {
		
		//put in 3 ints a, b, and c, in accordance with quadratic formula
		//returns -b + sqrt(b^2-4ac)
		
		double square=discriminant(a,b,c);
		double squareRoot;
		squareRoot=sqrt(square);
		return round2((-b)+squareRoot)/(2*a);
	}
	
	public static double negQuadForm(double a, double b, double c) {
		
		//put in 3 ints a, b, and c, in accordance with quadratic formula
		//returns -b - sqrt(b^2-4ac)
		
		double square=discriminant(a,b,c);
		double squareRoot;
		squareRoot=sqrt(square);
		return round2((-b)-squareRoot)/(2*a);
	}
	
	public static double discriminant (double a, double b, double c) {
		
		//takes standard form abc, returns that little bit inside the square root
		//in quadratic formula
		
		return square(b)-4*a*c;
	}
	
	public static double square(double squareInput) {
		
		//squares
		
		return squareInput*squareInput;
	}
	
	public static double min(double x, double y) {
		
		//finds smallest
		
		if(x<y) {
			return x;
		}else {
			return y;
		}
	}
	
	public static double round2(double round) {
		
		//rounds input to hundredths place
		
		double rounded=round*100;
		boolean isNegative=false;
		if (round<0) {
			rounded*=-1;
			isNegative=true;
		}
		if (rounded%1>=0.5) {
			rounded+=(1-rounded%1);
		}else {
			rounded-=(rounded%1);
		}
		if (!isNegative) {
			return rounded/100;
		}else {
			return rounded/=-100;
		}
	}
	
	public static double max(double x, double y) {
		
		//finds largest of two inputs
		
		if (x>y) {
			return x;
		}else {
			return y;
		}
	}
	
	public static double sqrt(double x) {
		
		//input double, return sqrt of said double
		
		if(x<0) {
			throw new IllegalArgumentException("Negative square root: "+x);
		}
		double guess=x/20;
		while(absValue(x-square(guess)) >= 0.001){
			guess-=((square(guess)-x)/(2*guess));
		}
		return round2(guess);
	}
	
	public static double absValue(double absolute) {
		
		//returns absolute value of two doubles
		
		if (absolute<0) {
			return absolute*-1;
		}else {
			return absolute;
		}
	}
	
	public static double findH(double a, double b, double c) {
		return -b/(2*a);
	}
	
	public static boolean opens(double a) {
		if (a>0) {
			return true;
		} else if (a<0) {
			return false;
		} else {
			throw new IllegalArgumentException("Not a quadratic");
		}
	}

}
