public class Node{
    private char data;
    private int x;
    private int y;
    private Node previous;

    public Node(){
	data = ' ';
	x = 0;
	y = 0;
	previous = null;
    }
    public Node(char a, int b, int c){
	data = a;
	x = b;
	y = c;
	previous = null;
    }
    public void setData(char c){
	data = c;
    }
    public char getData(){
	return data;
    }
    public void setPrevious(Node n){
	previous = n;
    }
    public Node getPrevious(){
	return previous;
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
