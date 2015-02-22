import java.io.*;
import java.util.*;

public class Knight {

    private char[][] board;
    private int maxX;
    private int maxY;

    private char space = '.';
    private char visited = 'x';
    private char knight = 'k';

    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }

    public Knight() {
	maxX = 4;
	maxY = 4;
	board = new char[maxX][maxY];
	for (int i=0;i<maxX;i++) {
	    for (int k=0;k<maxY;k++) {
		board[i][k] = space;
	    }
	}
    }

    public Knight(int x, int y) {
	maxX = x;
	maxY = y;
	board = new char[maxX][maxY];
	for (int i=0;i<maxX;i++) {
	    for (int k=0;k<maxY;i++) {
		board[i][k] = space;
	    }
	}
    }
    
    public String toString() {

	String s = "[2J\n";
				
	for (int y=0;y<maxY;y++)
	    {
		for (int x=0;x<maxX;x++)
		    s = s + board[x][y];
		s = s + "\n";
	    }
	return s;
    }

    public boolean solved() {
	for (int i=0;i<maxX;i++) {
	    for (int k=0;k<maxY;k++) {
		if (board[i][k] == '.') {
		    return false;
		}
	    }
	}
	return true;
    }

    public void solve(int x, int y){
	if (board[x][y]==visited){
	    return;
	}
	
	if (solved()){
	    System.out.println(this);
	}
	delay(100);
	System.out.println(this);
	board[x][y]=knight;
	solve(x+2,y+1);
	solve(x+2,y-1);
	solve(x-2,y+1);
	solve(x-2,y-1);
	solve(x+1,y+2);
	solve(x-1,y+2);
	solve(x+1,y-2);
	solve(x-1,y-2);
	if (!solved()){
	    board[x][y]=visited;
	}
    }

    public static void main(String[] args) {
	Knight k = new Knight();
	k.solve(0,0);
    }
    
}
    
    
