public class Tree {
    private Node root;
    public Tree(Node r){
	root = r;
    }

    public Node search(Integer n) {
	Node tmp = root;
	while (tmp.getData() != n) {
	    if (tmp.getData() > n || tmp.getRight() == null) {
		tmp = tmp.getLeft();
	    } else if (tmp.getData() < n || tmp.getLeft() == null) {
		tmp = tmp.getRight();
	    }
	}
	return tmp;
    }
    
    public void insert(Node n){
        Node tmp = root;
	Node tmp2 = root;
	Integer val = n.getData();
	while (tmp.getRight() == null && tmp.getLeft() == null) {
	    if (tmp.getData() > val || tmp.getRight() == null) {
		tmp = tmp.getLeft();
	    } else if (tmp.getData() < val || tmp.getLeft() == null) {
		tmp = tmp.getRight();
	    }
	    if (tmp.getData() != null) {
		tmp2 = tmp;
	    }
	}
	if (tmp2.getData() > n.getData()) {
	    tmp2.setLeft(n);
	} else {
	    tmp2.setRight(n);
	}
    }

    public String traverse(Node t) {
	String s = "";
	if (t == null) {
	    return "";
	} else {
	    s = "" + s + t.getData() + "->";
	    Node tmpL = t.getLeft();
	    Node tmpR = t.getRight();
	    s = "" + s + traverse(tmpL) + "->" + traverse(tmpR) + "->";
	}
	return s;
    }

    public String toString() {
	return "" + root + "->" + traverse(root.getLeft()) + "->" + traverse(root.getRight()) + "->";
    }

    public static void main(String[] args) {
	Node a = new Node(7);
	Node b = new Node(3);
	Node c = new Node(4);
	Node d = new Node(2);
	Node e = new Node(5);
	
	Tree t = new Tree(a);
	
	a.setLeft(b);
	b.setRight(c);
	b.setLeft(d);
	c.setRight(e);
	
	System.out.println(t.search(5));

	Node f = new Node(6);
	t.insert(f);
	System.out.println(t.search(6));
	System.out.println(t);
    }
   
    
}
