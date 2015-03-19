import java.util.*;
public class  Driver{
    public static void main(String[] args) {
	Random r = new Random();
	
	LList l = new LList();
	for (int i=0; i < 10000; i++){
	    l.add(r.nextInt(10));
	}
	int sum = 0;

	long start, elapsed;
	start = System.currentTimeMillis();
	for (int i=1;i<l.size();i++) {
	    sum = sum + l.get(i);
	}
	elapsed = System.currentTimeMillis() - start;
	System.out.println(sum);
	System.out.println("our linked list: " + elapsed);

	/*
	System.out.println(l);
	System.out.println(l.get(5));
	l.add(0,4);
	l.add(4,5);
	l.remove(2);
	System.out.println(l);
	*/

	LinkedList<Integer> ll = new LinkedList<Integer>();
	for (int i=0;i<10000;i++) {
	    ll.add(r.nextInt(10));
	}
	sum = 0;
	
	start = System.currentTimeMillis();
	for (int i=0;i<ll.size();i++) {
	    sum = sum + ll.get(i);
	}
	elapsed = System.currentTimeMillis() - start;
	System.out.println(sum);
	System.out.println("javva linked list: " + elapsed);

	ArrayList<Integer> ar = new ArrayList<Integer>();
	for (int i=0;i<10000;i++) {
	    ar.add(r.nextInt(10));
	}
	sum = 0;
	
	start = System.currentTimeMillis();
	for (int i=0;i<ar.size();i++) {
	    sum = sum + ar.get(i);
	}
	elapsed = System.currentTimeMillis() - start;
	System.out.println(sum);
	System.out.println("arraylist: " + elapsed);
    }
}
