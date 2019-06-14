public class Divisors {

    // Returns the greatest common divisor of a and b.
    public static int gcd(int a, int b){
		if (a==0&& b==0) return 0;
			break;
		int d=Math.abs(a);
		int c=Math.abs(b);
		int temp=0;
		while(c!=0){
			temp=a%b;
			d=c;
			c=temp;
		}
	   return d;
		
	}

    // Returns the least common multiple of a and b.
    public static int lcm(int a, int b){
		if (a==0&& b==0) return 0;
			break;
		
		return (Math.abs(a)*Math.abs(b))/gcd(a,b);
	}

    // Returns true if a and b are relatively prime; false otherwise.
    public static boolean areRelativelyPrime(int a, int b){
		if (gcd(a,b)==1) return true;
			else return false;
		
		
	}

    // Returns the number of positive integers between 1 and n
    // that are relatively prime with n.
    public static int totient(int n) {
		 int result = 1; 
		 for (int i = 2; i < n; i++){ 
				if (gcd(n, i) == 1) 
					result++; 
			return result;
		 }
	}

    // Takes two integer command-line arguments a ansd b and prints each
    // function, evaluated, in the format (and order) given below.
    public static void main(String[] args){
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.println ("gcd("+a+","+b+")"+"="+gcd( a, b));
		System.out.println ("lcm("+a+","+b+")"+"="+lcm( a, b));
		System.out.println ("areRelativelyPrime("+a+","+b+")"+"="+areRelativelyPrime( a, b));
		System.out.println ("totient("+a+"="+totient(a));
		System.out.println ("totient("+b+"="+totient(b));
		
	}
}