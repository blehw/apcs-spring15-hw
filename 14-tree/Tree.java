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

    public Node remove(int data) {
	Node tmp = root;
	Node tmp2 = root;
	while (tmp.getData() != data) {
	    if (tmp.getData() < data) {
		tmp = tmp.getLeft();
	    } else if (tmp.getData() > data) {
		tmp = tmp.getRight();
	    }
	    if (tmp.getData() != data) {
		tmp2 = tmp;
	    }
	}
	if (tmp.getRight() == null && tmp.getLeft() == null) {
	    if (tmp.getData() > tmp2.getData()) {
		tmp2.setRight(null);
	    } else {
		tmp2.setLeft(null);
	    }
	}
	return null;
    }

    public String traverse(Node t) {
	String s = "";
	if (t == null) {
	    return "";
	} else {
	    Node tmpL = t.getLeft();
	    Node tmpR = t.getRight();
	    s = ""  + traverse(tmpL) + "->" + t + traverse(tmpR) + "->";
	}
	return s;
    }

    public String toString() {
	return "" + traverse(root);
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
