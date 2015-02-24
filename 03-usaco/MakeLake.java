import java.io.*;
import java.util.*;

public class MakeLake {
    
    private int R = 4;
    private int C = 6;
    private int E = 22;
    private int N = 2;
    private int[][] lake = new int[C][R];
    private int[][] instructions = new int[N][3];

    public MakeLake() {
	int [] a = {28,25,20,32,34,36,27,25,20,20,30,34,24,20,20,20,20,30,20,20,14,14,20,20};
	instructions[0] = {1,4,4};
	instructions[1] = {1,1,10};
	int i = 0;
	for (int r=0;r<R;r++) {
	    for (int c=0;c<C;c++) {
		lake[c][r] = a[i];
		i++;
	    }
	}
    }

    public String toString() {
	String s = "";
	for (int r=0;r<R;r++) {
	    for (int c=0;c<C;c++) {
		s = s + lake[c][r] + " ";
	    }
	    s = s + "\n";
	}
	return s;
    }
    
    public void stomp() {
	int x;
	int y;
	for (int i=0;i<N;i++) {
	    x = instructions[N][0];
	    y = instructions[N][1];
	    
	}
    }
    
    
    public static void main(String[] args) {
	MakeLake m = new MakeLake();
	System.out.println(m);
   

}
