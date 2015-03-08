public class Selection {

    public int select(int[] array,int k, int l, int h) {
	if (l == h) {
	    return array[k-1];
	}
	if (array[l] < array[h]) {
	    l++;
	    select(array,k,l,h);
	}  else {
	    int m = array[l];
	    array[l] = array[h];
	    array[h] = m;
	    h--;
	    select(array,k,l,h);
	}
	return array[k-1];
    }

    public static void main(String[] args) {
	int[] m = new int[5];
	m[0] = 1;
	m[1] = 4;
	m[2] = 0;
	m[3] = 3;
	m[4] = 2;
	Selection s = new Selection();
	System.out.println(s.select(m,5,0,4));
    }

}
