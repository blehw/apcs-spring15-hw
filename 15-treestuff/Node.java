public class Node{
    private Integer data;
    private Node left,right;
    public Node(Integer d){
	data = d;
	left = null;
	right = null;
    }
    public Node getLeft(){
	return left;
    }
    public Node getRight(){
	return right;
    }
    public void setLeft(Node n){
	left = n;
    }
    public void setRight(Node n){
	right = n;
    }
    public Integer getData(){
	return data;
    }
    public String toString() {
	return ""+data;
    }
    
}
