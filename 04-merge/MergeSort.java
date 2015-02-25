import java.io.*;
import java.util.*;

public class MergeSort {

    public ArrayList<Integer> merge(ArrayList<Integer> A, ArrayList<Integer> B) {
	ArrayList<Integer> returnList = new ArrayList<Integer>();
	while (A.size() > 0 && B.size() > 0) {
	    int i = 0;
	    if (A.get(0) >= B.get(0)) {
		returnList.set(i,A.remove(0));
	    }
	    if (B.get(0) > A.get(0)) {
		returnList.set(i,B.remove(0));
	    }
	    i++;
	}
	return returnList;
    }
    
}
