public class LList {
    private Node l = new Node(-1);
    private int len;

    public LList() {
	Node last = new Node(-1);
	l.setNext(last);
	len = 0;
    }

    public void add(int n){
	Node tmp = new Node(n);
	tmp.setNext(l.getNext());
	l.setNext(tmp);
	len++;
    }

    public String toString(){
	String s = "-1 -->";
	Node tmp;
	for (tmp = l.getNext(); tmp.getData() != -1; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "-1";
	return s;
    }

    public int get(int n) {
	Node tmp=l;
	for (int i=0;i<n+1;i++) {
	    tmp=tmp.getNext();
	}
	return tmp.getData();
    }

    public int size() {
	return len;
    }

    public void add(int n, int m) {
	Node noder = new Node(m);
	Node tmp = l;
	for (int i=0;i<n-1;i++) {
	    tmp = tmp.getNext();
	}
	noder.setNext(tmp.getNext());
	Node i = tmp;
	i.setNext(noder);
	len++;
    }

    /*
    public int remove(int n) {
	if (n > len || n < 0) {
	    return -1;
	} else {
	    Node tmp = l;
	    for (int i=0;i<n+1;i++) {
		tmp = tmp.getNext();
	    }
	    Node after = tmp.getNext().getNext();
	    int m = tmp.getNext().getData();
	    tmp.setNext(after);
	    return m; 
	}
    }
    */

    public boolean remove(int n) {
	if (n > len || n < 0) {
	    return false;
	} else {
	    Node tmp = l.getNext();
	    while (tmp.getNext().getData() != -1) {
		if (tmp.getNext().getData() == n) {
		    tmp.setNext(tmp.getNext().getNext());
		    return true;
		}
	    }
	    return false;
	}
    }
		
}
