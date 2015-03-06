import java.io.*;
import java.util.*;

public class MergeSortTwo {

    public int[] merge(int[] A, int[] B) {
	int[] returnList = new int[A.length + B.length];
	int counterRet = 0;
	int counterA = 0;
	int counterB = 0;
	while (counterA < A.length || counterB < B.length) {
	    if (counterA < A.length && counterB < B.length) {
		if (A[0] <= B[0]) {
		    returnList[counterRet] = A[counterA];
		    counterRet++;
		    counterA++;
		} else {
		    returnList[counterRet] = B[counterB];
		    counterRet++;
		    counterB++;
		}
	    } else {
		if (counterA < A.length) {
		    returnList[counterRet] = A[counterA];
		    counterRet++;
		    counterA++;
		}
		if (counterB < B.length) {
		    returnList[counterRet] = A[counterB];
		    counterRet++;
		    counterB++;
		}
	    }
	}
	return returnList;
    }

    public int[] mergeSort(int[] array) {
	if (array.length < 2) {
	    return array;
	} else {
	    int mid = array.length/2;
	    int i;
	    int[] a = new int[mid-1];
	    int counterA = 0;
	    for (i=0;i<mid;i++) {
		a[counterA] = array[i];
	    }
	    int[] b = new int[array.length - mid];
	    int counterB = 0;
	    for (;i<array.length;i++) {
		b[counterB] = array[i];
	    }
	    System.out.println(a);
	    System.out.println(b);
	    int[] ar1 = mergeSort(a);
	    int[] ar2 = mergeSort(b);
	    return merge(ar1,ar2);
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
