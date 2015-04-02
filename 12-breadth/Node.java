public class Node{
    private char data;
    private int x;
    private int y;
    private Node next;

    public Node(){
	data = ' ';
	x = 0;
	y = 0;
	next = null;
    }
    public Node(char a, int b, int c){
	data = a;
	x = b;
	y = c;
	next = null;
    }
    public void setData(char c){
	data = c;
    }
    public char getData(){
	return data;
    }
    public void setNext(Node n){
	next = n;
    }
    public Node getNext(){
	return next;
    }
    public void setX(int n) {
	x = n;
    }
    public int getX() {
	return x;
    }
    public void setY(int n) {
	y = n;
    }
    public int getY() {
	return y;
    }
}
