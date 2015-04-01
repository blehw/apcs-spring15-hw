public class myQueue {
    
    private Node first = new Node();
    private Node last = new Node();

    public myQueue() {
	first.setNext(last);
    }

    public void enqueue(Node data) {
	if (empty()) {
	    first.setData(data);
	    last = first;
	} else {
	Node tmp = new Node(data);
	last.setNext(tmp);
	last = last.getNext();
	}
    }

    public Node dequeue() {
	// remove and return the head/front item from the stack
     
	Node tmp = first.getData();
	first = first.getNext();
	if (first == null) {
	    last = null;
	}
	return tmp;
    }

    public boolean empty(){
	return (first.getData() == null);
    }

    public Node head() {
        // return the first item in the queue
	return first.getData();
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
