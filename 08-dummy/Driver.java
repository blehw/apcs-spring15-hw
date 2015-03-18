import java.util.*;
public class  Driver{
    public static void main(String[] args) {
	Random r = new Random();
	LList l = new LList();
	for (int i=0; i < 10; i++){
	    l.add(""+i);
	}
	System.out.println(l);
	System.out.println(l.find(5));
	l.add(0,"a");
	l.add(4,"b");
	l.remove(2);
	System.out.println(l);
    }
}
