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
	q.enqueue(first);
	
	while (!q.empty()) {
	    Node tmp = q.dequeue();
	    if (tmp.getData() == exit) {
		System.out.println("done");
		return;
	    }
	    if (tmp.getData() == wall) {
		return;
	    }
	    Node a = new Node(board[tmp.getX()+1][tmp.getY()+1],
			      tmp.getX()+1,tmp.getY()+1);
	    Node b = new Node(board[tmp.getX()+1][tmp.getY()-1],
			      tmp.getX()+1,tmp.getY()-1);
	    Node c = new Node(board[tmp.getX()-1][tmp.getY()+1],
			      tmp.getX()-1,tmp.getY()+1);
	    Node d = new Node(board[tmp.getX()-1][tmp.getY()-1],
			      tmp.getX()-1,tmp.getY()-1);
	    System.out.println(a.getData());
	    if(a.getData()!=wall){
	    	
	        q.enqueue(a);

	    }
	    System.out.println(b.getData());
	    if(b.getData()!=wall){
	        q.enqueue(b);
	       

	    }
	    System.out.println(c.getData());
	    if(c.getData()!=wall){
	        q.enqueue(c);
	        

	    }
	    System.out.println(d.getData());
	    if(d.getData()!=wall){
	        q.enqueue(d);
	        
	    }
	    System.out.println(q);
	}
	
    }
	
    public static void main(String[] args){
	Maze m = new Maze();
	System.out.println(m);
	m.solve(1,1);
	System.out.println(m);
    }
}

