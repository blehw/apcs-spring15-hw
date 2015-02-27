import java.io.*;
import java.util.*;

public class MergeSort {

    public ArrayList<Integer> merge(ArrayList<Integer> A, ArrayList<Integer> B) {
	ArrayList<Integer> returnList = new ArrayList<Integer>();
	while (A.size() > 0 || B.size() > 0) {
	    if (A.size() > 0 && B.size() > 0) {
		if (A.get(0) <= B.get(0)) {
		    returnList.add(A.remove(0));
		}
		if (B.get(0) < A.get(0)) {
		    returnList.add(B.remove(0));
		}
	    } else {
		if (A.size() > 0) {
		    returnList.add(A.remove(0));
		}
		if (B.size() > 0) {
		    returnList.add(B.remove(0));
		}
	    }
	}
	return returnList;
    }

    public ArrayList<Integer> mergeSort(ArrayList<Integer> array) {
	if (array.size() < 2) {
	    return array;
	} else {
	    int mid = array.size()/2;
	    ArrayList<Integer> a = new ArrayList<Integer>();
	    for (int i=0;i<mid;i++) {
		a.add(array.get(i));
	    }
	    ArrayList<Integer> b = new ArrayList<Integer>();
	    for (int k=mid;k<array.size();k++) {
		b.add(array.get(k));
	    }
	    ArrayList<Integer> ar1 = mergeSort(a);
	    ArrayList<Integer> ar2 = mergeSort(b);
	    return merge(a,b);
	}
    }

    public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<Integer>();
	a.add(1);
	a.add(3);
	a.add(4);
	a.add(9);
	ArrayList<Integer> b = new ArrayList<Integer>();
	b.add(2);
	b.add(3);
	b.add(5);
	MergeSort ms = new MergeSort();
	System.out.println(ms.merge(a,b));
	ArrayList<Integer> c = new ArrayList<Integer>();
	c.add(3);
	c.add(1);
	c.add(7);
	c.add(9);
	c.add(5);
	c.add(5);
	System.out.println(ms.mergeSort(c));
    }
    
}
