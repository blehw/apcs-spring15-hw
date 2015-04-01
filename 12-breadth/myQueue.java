public class myQueue<E> {
    
    private Node<E> first = new Node<E>();
    private Node<E> last = new Node<E>();

    public myQueue() {
	first.setNext(last);
    }

    public void enqueue(E data) {
	if (empty()) {
	    first.setData(data);
	    last = first;
	} else {
	Node tmp = new Node(data);
	last.setNext(tmp);
	last = last.getNext();
	}
    }

    public E dequeue() {
	// remove and return the head/front item from the stack
     
	E tmp = first.getData();
	first = first.getNext();
	if (first == null) {
	    last = null;
	}
	return tmp;
    }

    public boolean empty(){
	return (first.getData() == null);
    }

    public E head() {
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
