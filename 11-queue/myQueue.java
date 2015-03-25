public class myQueue {

    private LList<Integer> ll = new LList<Integer>();
    private Iterator<Integer> i;
    private Node first;
    private Node last;

    public myQueue() {
	i = ll.iterator();
    }

    public void enqueue(int data) {
	ll.add(data);
	while (i.next != data) {
	    i.next();
	}
	last = i.next();
    }

    public int dequeue() {

    }

    public String toString() {
	return ll.toString();
    }

    public static void main(String[] args) {
	myQueue q = new myQueue();
	q.enqueue(5);
	System.out.println(q);
    }
    
}
