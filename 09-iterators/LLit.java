import java.io.*;
import java.util.*;

public class LLit<E> implements Iterator<E>{
    private Node<E> t;
    private Node<E> pointer;
    public LLit(Node<E> n){
	t=n;
	pointer=n;
    }

    public boolean hasNext(){
	return t!=null;
    }

    public E next(){
	pointer = t;
	t=t.getNext();
	if (hasNext()) {
	    E retval = t.getData();
	    return retval;
	} else {
	    return null;
	}
    }

    public void remove() {
	if (hasNext()) {
	    pointer.setNext(t.getNext());
	}
    }
}
