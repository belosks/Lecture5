public class ActivationFunction {

    // Returns the Heaviside function of x.
    public static double heaviside(double x){
		
		if (x<0) return 0;
			else if (x==0) return 0.5;
			else return 1;
	}
	

    // Returns the sigmoid function of x.
    public static double sigmoid(double x){
		return 1/(1+Math.exp(-x));
	}

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x){
		return (Math.exp(x)-Math.exp(-x))/(Math.exp(x)-Math.exp(-x));
		
	}

    // Returns the softsign function of x.
    public static double softsign(double x){
		return x/(1+Math.abs(x));
	}

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x){
		
		if (x<=-2) return -1;
		else if (x<0&&x>-2) return x+Math.pow(x,2)/4;
		else if (x<2&&x>=0) return x-Math.pow(x,2)/4;
		else return 1
	}

    // Takes a double command-line argument x and prints each activation
    // function, evaluated, in the format (and order) given below.
    public static void main(String[] args)(
		double var=Double.parseDouble(args[0]);
		System.out.println ("heaviside("+var+") ="+ heaviside(var));
		System.out.println ("sigmoid("+var+") ="+ sigmoid(var));
		System.out.println ("tanh("+var+") ="+ tanh(var));
		System.out.println ("softsign("+var+") ="+ softsign(var));
		System.out.println ("sqnl("+var+") ="+ sqnl(var));
	)
}