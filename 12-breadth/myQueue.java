public class myQueue {
    
    private Node first = new Node();
    private Node last = new Node();

    public myQueue() {
	first.setNext(last);
    }

    public void enqueue(Node data) {
	if (empty()) {
	    first.setData(data.getData());
	    first.setX(data.getX());
	    first.setY(data.getY());
	    last = first;
	} else {
	last.setNext(data);
	last = last.getNext();
	}
    }

    public Node dequeue() {
	// remove and return the head/front item from the stack
     
	Node tmp = new Node(first.getData(),first.getX(),first.getY());
	first = first.getNext();
	if (first == null) {
	    last = null;
	}
	return tmp;
    }

    public boolean empty(){
	return (first.getData() == ' ');
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
