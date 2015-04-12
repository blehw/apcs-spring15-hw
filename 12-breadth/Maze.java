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
	Node first = new Node(board[x][y],x,y);
	board[x][y] = me;
	System.out.println(q);
	q.enqueue(first);
	System.out.println("first enqueue" + q);
	while (!q.empty()) {
	    System.out.println(q);
	    Node tmp = q.dequeue();
	    System.out.println(tmp);
	    if (tmp.getData() == exit) {
		System.out.println("done");
		return;
	    }
	    if (tmp.getData() == wall || tmp.getData() == me) {
		return;
	    }
	    if (tmp.getData() != wall & tmp.getData() != me) {
		board[tmp.getX()][tmp.getY()] = 'd';
		Node a = new Node(board[tmp.getX()+1][tmp.getY()],
				  tmp.getX()+1,tmp.getY());
		Node b = new Node(board[tmp.getX()-1][tmp.getY()],
				  tmp.getX()-1,tmp.getY());
		Node c = new Node(board[tmp.getX()][tmp.getY()+1],
				  tmp.getX(),tmp.getY()+1);
		Node d = new Node(board[tmp.getX()][tmp.getY()-1],
				  tmp.getX(),tmp.getY()-1);
		q.enqueue(a);
		q.enqueue(b);
		q.enqueue(c);
		q.enqueue(d);
		System.out.println(board);
	    }
	    
	}
	
    }
	
    public static void main(String[] args){
	Maze m = new Maze();
	System.out.println(m);
	m.solve(1,1);
	System.out.println(m);
    }
}

