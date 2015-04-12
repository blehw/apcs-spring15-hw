public class myStack{
    // You decide how the node(s) are declared
    private Node s;
    // make whatever constructor(s) you need
    public myStack(){
	s = new Node();
    }

    public void enqueue(Node data){
        // add something to the top
	Node temp = data;
	temp.setNext(s.getNext());
	s.setNext(temp);
    }

    public Node dequeue(){
        // remove and return the top item from the stack
	Node value = s.getNext();
	s.setNext(s.getNext().getNext());
	return value;
    }

    public boolean empty(){
	return s.getNext() == null;
    }

    public Node top() {
        // return the top item from the stack
	return s.getNext();
    } 
    public String toString(){
	String string = "";
	Node tmp = s;
	for (tmp=tmp.getNext() ; tmp!=null ; tmp=tmp.getNext()){
	    string = string + tmp + " --> ";
	}
	string = string + "null";
	return string;
    }

    
}
