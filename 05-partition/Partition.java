import java.io.*;
import java.util.*;

public class Partition {

    public String toString(int[] array) {
	String s = "";
	for (int i=0;i<array.length;i++) {
	    s = s + array[i] + " ";
	}
	return s;
    }

    public int[] partition(int[] array) {
	int[] newarray = new int[array.length];
	for (int i=0;i<array.length;i++) {
	    newarray[i] = array[i];
	}
	int si = 0;
	int ei = array.length - 1;
	int pivot = array[si];
	si++;
	for (int i=1;i<array.length-1;i++) {
	    if (array[i] > pivot) {
		array[ei] = array[i];
		ei--;
	    } else {
		array[si] = array[i];
		si++;
	    }
	}
	return newarray;
    }

    public static void main(String[] args) {
	Partition p = new Partition();
	int[] c = new int[5];
	c[0] = 2;
	c[1] = 2;
	c[2] = 5;
	c[3] = 7;
	c[4] = 1;
	int[] n = p.partition(c);
	System.out.println(p.toString(n));
    }
}
