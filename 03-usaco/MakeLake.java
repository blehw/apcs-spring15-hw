import java.io.*;
import java.util.*;

public class MakeLake {

    private int R = 4;
    private int C = 6;
    private int E = 22;
    private int N = 2;
    private int[][] lake;

    public MakeLake() {
        try {					
	    Scanner sc = new Scanner(new File("makelake.dat"));
	} catch (Exception e) {}
	int j=0;
	while (sc.hasNext()) {
	    String line = sc.nextLine();
	    for (int i=0;i<maxX;i++) {
		lake[i][j] = line.intAt(i);
	    }
	    j++;
	}
    }

}
