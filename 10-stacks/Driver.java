public class Driver {

    public static void main(String[] args) {
	/*
	myStack s = new myStack();
	System.out.println("" + s.empty());
	s.push("hello");
	s.push("world");
	System.out.println(s);
	s.pop();
	System.out.println(s);
	System.out.println(s.top());
	*/

	myArrayStack as = new myArrayStack();
        System.out.println("" + as.empty());
	for (int i=0;i<300;i++) {
	    as.push(i);
	}
	System.out.println(as);
	as.pop();
	System.out.println(as);
	System.out.println(as.top());
	
    }

}
