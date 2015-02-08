public class Recursion {

    public int factorial(int n) {
        if (n>0) {
	    return n * factorial(n-1);
	} else {
	    return 1;
	}
    }

    public int fib(int n) {
	if (n>2) {
	    return fib(n-1) + fib(n-2);
	} else {
	    return 1;
	}
    }

    public int len(String s) {
	if (s.length() > 0) {
	    return 1 + len(s.substring(0,s.length()-1));
	} else {
	    return 0;
	}
    }

    public int count(String s,char c) {
	if (s.length() > 0) {
	    if (s.charAt(0) == c) {
		return 1 + count(s.substring(1,s.length()),c);
	    } else {
		return count(s.substring(1,s.length()),c);
	    }
	} else {
	    return 0;
	}
    }

    public static void main(String[] args) {
	Recursion r = new Recursion();
	System.out.println(r.factorial(5));
	System.out.println(r.factorial(0));
	System.out.println(r.fib(5));
	System.out.println(r.fib(6));
	System.out.println(r.len("Hello"));
	System.out.println(r.count("Hello",'l'));
    }

}

