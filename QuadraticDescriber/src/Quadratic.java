
public class Quadratic {
	public static String quadrDescriber(double a, double b, double c) {
		boolean opensUp;
		if (a>0) {
			opensUp=true;
		}else {
			opensUp=false;
		}
		double h= findH(a, b, c);
		double k=a*square(h)+b*h+c;
		String vertex="("+h+","+k+")";
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
