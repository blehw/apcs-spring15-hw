public class LList {
    private Node l = new Node(null);
    private int len;

    public LList() {
	l.setNext(null);
	len = 0;
    }

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l.getNext());
	l.setNext(tmp);
	len++;
    }

    public String toString(){
	String s = "";
	Node tmp;
	for (tmp = l; tmp != null; tmp=tmp.getNext()){
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

    public void add(int n,String s) {
	Node noder = new Node(s);
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
