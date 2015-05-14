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

    public int countNode(Node t) {
	if (t == null) {
	    return 0;
	} else {
	    return 1 + countNode(t.getLeft()) + countNode(t.getRight());
	}
    }

    /*
      if (t==null) {
        return smallest value
      } else {
        max of:
	maxNode(t.getLeft());
	maxNode(t.getRight());
	maxNode(t.getData());
      }
     */
    public int maxVal(Node t) {
	if (t.getRight() == null || t.getLeft() == null) {
	    return t.getData();
	} else {
	    int left = maxVal(t.getLeft());
	    int right = maxVal(t.getRight());
	    if (t.getData() >= right && t.getData() >= left) {
		return t.getData();
	    }
	    if (left >= t.getData() && left >= right) {
		return left;
	    } else {
		return right;
	    }
	}
	
    }

    /*
      if (t==null) {
        return 0;
      } else {
        return 1+max(height(t.getLeft()),height(t.getRight());
      }
     */
    public int height(Node t) {
	if (t == null) {
	    return 0;
	} else {
	    if (t.getRight() != null) {
		return 1 + height(t.getRight());
	    }
	    if (t.getLeft() != null) {
		return 1 + height(t.getLeft());
	    }
	}
	return 0;
    }

    public void splitDupes(Node t) {
	if (t.getLeft() == t) {
	    Node tmp = t.getLeft();
	    Node insert = new Node(t.getData() - 1);
	    t.setLeft(insert);
	    insert.setLeft(tmp);
	} 
	if (t.getRight() == t) {
	    Node tmp = t.getRight();
	    Node insert = new Node(t.getData() - 1);
	    t.setRight(insert);
	    insert.setRight(tmp);
	} 
    }

    /*
      diam(Node t) {
        if (t==null) {
	  return 0;
	} else {
	  pt1 = height(t.getLeft()) + height(t.getRight()) + 2;
	  pt2 = diam(t.getLeft());
	  pt3 = diam(t.getRight());
	  return max(pt1,pt2,pt3);
	}
      }
     */
    public int longest(Node t) {
	if (t == null) {
	    return 0;
	} else {
	    return 1 + longest(t.getRight());
	}
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
	//t.insert(f);
	//System.out.println(t.search(6));
	System.out.println(t.countNode(a));
	System.out.println(t.maxVal(a));
	System.out.println(t.height(a));
    }
   
    
}

   
