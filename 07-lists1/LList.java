public class LList {
    private Node l=null;

    public void add(String s){
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
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

    public Node find(int n) {
	Node tmp=l;
	for (int i=0;i<n;i++) {
	    tmp=tmp.getNext();
	}
	return tmp;
    }

    public void insert(int n,String s) {
	Node noder = new Node(s);
	noder.setNext(find(n));
	Node i = find(n-1);
        i.setNext(noder);
    }
		
}
