public class myArrayQueue {

    int[] a = new int[200];
    private int first = 0;
    private int last = 0;

    public myArrayQueue() {

    }

    public void enqueue(int data) {
	if (empty()) {
	    a[first] = data;
	    last++;
	} else {
	    a[last] = data;;
	    last++;
	}
    }

    public E dequeue() {
	// remove and return the head/front item from the stack
     
	E tmp = first.getData();
	first = first.getNext();
	return tmp;
    }

    public boolean empty(){
	return (a[first] == 0);
    }

    public String toString(){
	String s = "";
	for (int i=0;i<last;i++){
	    s = s + a[i] + " --> ";
	}
	return s;
    }

    public static void main(String[] args) {
	myArrayQueue aq = new myArrayQueue();
	aq.enqueue(1);
	aq.enqueue(2);
	aq.enqueue(3);
	System.out.println(aq);
    }
    
}
