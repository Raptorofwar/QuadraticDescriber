
public class Quadratic {
	public static String quadrDescriber(double a, double b, double c) {
		boolean opensUp;
		if (a>0) {
			opensUp=true;
		}else {
			opensUp=false;
		}
		
	}
	
	public static String quadform(int a, int b, int c) {
		
		//put in 3 ints a, b, and c, in accordance with quadratic formula
		//returns a string listing roots (x for y=0)
		
		double square=discriminant(a,b,c);
		double squareRoot;
		if(square<0) {
			return "no real roots";
		}
		squareRoot=sqrt(square);
		double plusRoot=((-b)+squareRoot)/(2*a);
		double minusRoot=((-b)-squareRoot)/(2*a);
		if(plusRoot!=minusRoot) {
			double maxRoot=round2(max(plusRoot, minusRoot));
			double minRoot=round2(min(plusRoot, minusRoot));
			String roots=minRoot+" and "+maxRoot;
			return roots;
		}else {
			return plusRoot+"";
		}
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

}
