public class myQueue {
    
    private Node first = new Node();
    private Node last = new Node();
    private int size;

    public myQueue() {
        size = 0;
    }

    public void enqueue(Node data) {
	Node tmp;
	tmp = first;
	if(empty()){
	    first.setNext(data);
	}
	else{
	    
	    while(tmp.getNext()!=last){
		tmp = tmp.getNext();
	    }		
	}
	tmp.setNext(data);
	size++;
    }

    public Node dequeue() {
	// remove and return the head/front item from the stack

	Node a = first.getNext();
	first.setNext(a.getNext());	
	size--;
	return a;
 
    }

    public boolean empty(){
	return size == 0;
    }

    public Node head() {
        // return the first item in the queue
        Node a = first.getNext();
	return a;
     }

    public int size() {
	return size;
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
