import java.io.*;
import java.util.*;

public class Partition {

    private int[] array;

    public Partition() {
	int[] c = new int[5];
	c[0] = 2;
	c[1] = 2;
	c[2] = 5;
	c[3] = 7;
	c[4] = 1;
    }

    public String toString() {
	String s = "";
	for (int i=0;i<array.length;i++) {
	    s = s + array[i] + " ";
	}
	return s;
    }

    public int[] partition() {
	int[] newarray = new int[array.length];
	for (int i=0;i<array.length;i++) {
	    newarray[i] = array[i];
	}
	int si = 0;
	int ei = newarray.length - 1;
	int pivot = newarray[si];
	si++;
	for (int i=1;i<newarray.length-1;i++) {
	    if (newarray[i] > pivot) {
		newarray[ei] = newarray[i];
		ei--;
	    } else {
		newarray[si] = newarray[i];
		si++;
	    }
	}
	return newarray;
    }

    public static void main(String[] args) {
	Partition p = new Partition();
	System.out.println(p.partition());
    }
}
