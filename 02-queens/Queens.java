import java.io.*;
import java.util.*;

public class Queens {

    private char[][] board;
    private int maxX;
    private int maxY;

    private char space = '.';
    private char attack = 'x';
    private char queen = 'q';
    private boolean us = false;
    public void delay(int n){
	try {
	    Thread.sleep(n);
	} catch (Exception e) {}
    }

    public Queens() {
	maxX = 8;
	maxY = 8;
	board = new char[maxX][maxY];
	for (int i=0;i<maxX;i++) {
	    for (int k=0;k<maxY;k++) {
		board[i][k] = space;
	    }
	}
    }

    public Queens(int x, int y) {
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

	String s = "";
				
	for (int y=0;y<maxY;y++)
	    {
		for (int x=0;x<maxX;x++)
		    s = s + board[x][y];
		s = s + "\n";
	    }
	return s;
    }

    public boolean unsolvable() {
	for (int i=0;i<maxX;i++) {
	    for (int k=0;k<maxY;k++) {
		if (board[i][k] == '.') {
		    return false;
		}
	    }
	}
	return true;
    }

    public void solve(int n) {
	
	Random rand = new Random();
	int x = rand.nextInt(maxX);
	int y = rand.nextInt(maxY);
	
	if (n != 0) {
	    
	    if (board[x][y] == attack) {
		solve(n,n);
	    } 
	    if (board[x][y] == space) {
		for (int i=0;i<maxY;i++) {
		    board[x][i] = attack;
		}
		for (int k=0;k<maxX;k++) {
		    board[k][y] = attack;
		}
		int a = x;
		int b = y;
		while (a+1<maxX && b+1<maxY) {
		    a = a + 1;
		    b = b + 1;
		    board[a][b] = attack;
		}
		int c = x;
		int d = y;
		while (c-1>=0 && d-1>=0) {
		    c = c - 1;
		    d = d - 1;
		    board[c][d] = attack;
		}
		int e = x;
		int f = y;
		while (e+1<maxX && f-1>=0) {
		    e = e + 1;
		    f = f - 1;
		    board[e][f] = attack;
		}
		int g = x;
		int h = y;
		while (g-1>=0 && h+1<maxY) {
		    g = g - 1;
		    h = h + 1;
		    board[g][h] = attack;
		}
		board[x][y] = queen;
		solve(n-1,n);
	    }
	    if (unsolvable()) {
	        for (int i=0;i<maxX;i++) {
		    for (int k=0;k<maxY;k++) {
			board[i][k] = '.';
			solve(n,n);
		    }
		}
	    }
   
	} else {
	    System.out.println(this);
	}		
    }

    public void solve(int n, int m) {
	
	Random rand = new Random();
	int x = rand.nextInt(maxX);
	int y = rand.nextInt(maxY);
	
	if (n != 0) {
	    
	    if (board[x][y] == attack) {
		solve(n,m);
	    } 
	    if (board[x][y] == space) {
		for (int i=0;i<maxY;i++) {
		    board[x][i] = attack;
		}
		for (int k=0;k<maxX;k++) {
		    board[k][y] = attack;
		}
		int a = x;
		int b = y;
		while (a+1<maxX && b+1<maxY) {
		    a = a + 1;
		    b = b + 1;
		    board[a][b] = attack;
		}
		int c = x;
		int d = y;
		while (c-1>=0 && d-1>=0) {
		    c = c - 1;
		    d = d - 1;
		    board[c][d] = attack;
		}
		int e = x;
		int f = y;
		while (e+1<maxX && f-1>=0) {
		    e = e + 1;
		    f = f - 1;
		    board[e][f] = attack;
		}
		int g = x;
		int h = y;
		while (g-1>=0 && h+1<maxY) {
		    g = g - 1;
		    h = h + 1;
		    board[g][h] = attack;
		}
		board[x][y] = queen;
		solve(n-1,m);
	    }
	    if (unsolvable()) {
	        for (int i=0;i<maxX;i++) {
		    for (int k=0;k<maxY;k++) {
			board[i][k] = '.';
			solve(m,m);
		    }
		}
	    }
   
	} else {
	    System.out.println(this);
	}
		
    }

    public static void main(String[] args) {
	Queens q = new Queens();
	System.out.println(q);
	q.solve(8);
	System.out.println(q);
    }

}
