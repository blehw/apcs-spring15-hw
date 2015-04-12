public class myStack<E>{
    // You decide how the node(s) are declared
    private Node<E> s;
    // make whatever constructor(s) you need
    public myStack(){
	s = new Node<E>();
    }

    public void push(E data){
        // add something to the top
	Node temp = new Node<E>(data);
	temp.setNext(s.getNext());
	s.setNext(temp);
    }

    public E pop(){
        // remove and return the top item from the stack
	E value = s.getNext().getData();
	s.setNext(s.getNext().getNext());
	return value;
    }

    public boolean empty(){
	return s.getNext() == null;
    }

    public E top() {
        // return the top item from the stack
	return s.getNext().getData();
    } 
    public String toString(){
	String string = "";
	Node<E> tmp = s;
	for (tmp=tmp.getNext() ; tmp!=null ; tmp=tmp.getNext()){
	    string = string + tmp + " --> ";
	}
	string = string + "null";
	return string;
    }

    
}
