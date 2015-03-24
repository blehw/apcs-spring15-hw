public class myArrayStack {

    private int[] a = new int[200];
    private int size = 0;

    public void push(int data) {
	if (size == a.length) {
	    grow();
	}
	a[size] = data;
	size++;
    }

    public int pop() {
	int value = a[size];
	size--;
	return value;
    }

    public boolean empty() {
	return size==0;
    }

    public int top() {
	return a[size-1];
    }

    public void grow() {
	int[] b = new int[a.length + 200];
	for (int i=0;i<a.length;i++) {
	    b[i] = a[i];
	}
	a = b;
    }

    public String toString() {
        String s = "";
	for (int i=0;i<size;i++) {
	    s = s + a[i] + "-->";
	}
	return s;
    }

}
