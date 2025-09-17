public class Polynomial {
	
	public double[] poly;
	
	public Polynomial() {
		poly = new double[0];
	}
	
	public Polynomial(double[] input) {
		
		int len = input.length;
		poly = new double[len];
		for (int i=0; i < len; i++) {
			poly[i] = input[i];
		}
	}
	
	public Polynomial add(Polynomial input) {
		
		int maxlen = Math.max(input.poly.length, poly.length);
		int len1 = input.poly.length;
		int len2 = poly.length;
		double[] empty = new double[maxlen];
		for (int i=0; i<maxlen; i++) {
			empty[i]=0;
		}
		Polynomial out = new Polynomial();
		out.poly=empty;
		for (int i=0; i<len1; i++) {
			out.poly[i] = input.poly[i];
		}
		for (int i=0; i<len2; i++) {
			out.poly[i] += poly[i];
		}
		
		return out;
	}
	
	public double evaluate(double x) {
		
		double eval = 0;
		for (int i=0; i<poly.length; i++) {
			eval = eval + poly[i]*(Math.pow(x, i));
		}
		return eval;
	}
	
	public boolean hasRoot(double x) {
		
		double result;
		result = evaluate(x);
		return result == 0;
	}
	
}