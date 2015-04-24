import java.io.*;
import java.util.*;

public class Maze 
{
    private char[][] board;
    private int maxX;
    private int maxY;

    private char path='#';
    private char wall=' ';
    private char me='d';
    private char exit='$';
    private char visited = '.';
    private boolean solved = false;
		
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }
		
    public Maze() 
    {
	maxX=40;
	maxY=20;
	board = new char[maxX][maxY];
				
	try {
						
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext())
		{
		    String line = sc.nextLine();
		    for (int i=0;i<maxX;i++)
			{
			    board[i][j] = line.charAt(i);
			}
		    j++;
		}
	}
	catch (Exception e)
	    {
	    }
				
    }
		
    public String toString()
    {
	String s = "[2J\n";
				
	for (int y=0;y<maxY;y++)
	    {
		for (int x=0;x<maxX;x++)
		    s = s +board[x][y];
		s=s+"\n";
	    }
	return s;
    }

    /*
      solved - instance variable to indicate we're done
			
    */
    public void solve(int x, int y){
	myQueue q = new myQueue();
	//myStack q = new myStack();
	Node first = new Node(board[x][y],x,y);
	board[x][y] = me;
	//System.out.println("before we start: " + q);
	q.enqueue(first);
	//System.out.println("first enqueue: " + q);
	while (!q.empty()) {
	    //System.out.println("what is our queue?: " + q);
	    Node tmp = q.dequeue();
	    //System.out.println("what did we dequeue?: " + tmp);
	    //System.out.println("after the dequeue: " + q);
	    if (tmp.getData() == exit) {
		System.out.println("done");
		return;
	    }
	    if (tmp.getData() == wall || tmp.getData() == me) {

	    } else if (tmp.getData() != wall && tmp.getData() != me) {
		board[tmp.getX()][tmp.getY()] = 'd';
		if (tmp.getX() + 1 < maxX) {
		    Node a = new Node(board[tmp.getX()+1][tmp.getY()],
				      tmp.getX()+1,tmp.getY());
		    q.enqueue(a);
		}
		if (tmp.getX() - 1 > -1) {
		    Node b = new Node(board[tmp.getX()-1][tmp.getY()],
				      tmp.getX()-1,tmp.getY());
		    q.enqueue(b);
		}
		if (tmp.getY() + 1 < maxY) {
		    Node c = new Node(board[tmp.getX()][tmp.getY()+1],
				      tmp.getX(),tmp.getY()+1);
		    q.enqueue(c);

		}
		if (tmp.getX() - 1 > -1) {
		    Node d = new Node(board[tmp.getX()][tmp.getY()-1],
				      tmp.getX(),tmp.getY()-1);
		    q.enqueue(d);
		}
	    }
	    delay(50);
	    System.out.println(this);
	    
	}
	
    }
	
    public static void main(String[] args){
	Maze m = new Maze();
	System.out.println(m);
	m.solve(1,1);
	System.out.println(m);
    }
}

