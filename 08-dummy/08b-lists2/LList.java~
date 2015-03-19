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
	String s = "";
	Node tmp;
	for (tmp = l; tmp.getData() != -1; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

    public Node get(int n) {
	Node tmp=l;
	for (int i=0;i<n+1;i++) {
	    tmp=tmp.getNext();
	}
	return tmp;
    }

    public void add(int n, int m) {
	Node noder = new Node(m);
	noder.setNext(get(n));
	Node i = get(n-1);
	i.setNext(noder);
	len++;
    }

    public void remove(int n) {
	Node nodeb4 = get(n-1);
	Node nodeb5 = get(n+1);
	nodeb4.setNext(nodeb5);
    }
		
}
