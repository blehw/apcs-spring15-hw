public class myQueue {
    
    private Node first = new Node();
    private Node last = new Node();
    private int size = 0;

    public myQueue() {
	first = last;
    }

    public void enqueue(Node data) {
	if (empty()) {
	    first.setData(data.getData());
	    first.setX(data.getX());
	    first.setY(data.getY());
	} else {
	    last.setNext(data);
	    last = last.getNext();	    
	}
	size++;
    }

    public Node dequeue() {
	// remove and return the head/front item from the stack
     
	Node tmp = new Node(first.getData(),first.getX(),first.getY());
	if (size == 1) {
	    Node temp = new Node();
	    first = temp;
	    last = temp;
	} else {
	    first = first.getNext();
	}
	size--;
	return tmp;
    }

    public boolean empty(){
	return size == 0;
    }

    public Node head() {
        // return the first item in the queue
	return first;
     }
    public String toString(){
	String s = "";
	Node tmp;;
	for (tmp=first ; tmp!=null ; tmp=tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }

}
