import java.util.*;

public class Frontier {
    public LinkedList<Node> l = new LinkedList<Node>();

    public void add(Node n){
	int counter = 0;
	for (Node m: l) {
	    if (m.getPriority() > n.getPriority()) {
		l.add(counter,m);
		break;
	    }
	    counter += 1;
	}
    }

    public Node remove() {
	return l.remove(0);
    }

    public boolean isEmpty(){
	return l.isEmpty();
    }
}










