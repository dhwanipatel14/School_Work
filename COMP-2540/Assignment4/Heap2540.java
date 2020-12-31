

	import java.util.Arrays;


	public class Heap2540 {
	    private String[] heap;
	    private int n=0;
	    
	    public Heap2540(String[ ] a) {    	
	     // define the constructor for a heap from an array
	    heap = new String[128];
	   int i;
	  for(i=0; i<a.length;i++){
	  insert(a[i]);
	}
	    }
	  
	    public Heap2540() {   
	    	heap=new String[128];
	    }
	  
	    public String removeMax() {
	    	String max=heap[1];
		    swap(1, n);
	        n--;
	        sink(1);       
		return max;
	    }

	    public void insert(String x) {
	        // add resize 
	    if(heap.length-1 == n)
	 {    String[] temp  = Arrays.copyOf(heap,2*heap.length);
	heap = temp;
	}

	        n++;
	        heap[n] = x;
	        swim(n);
	    }

	    private void swim(int k) {
	     // add swim 
	while (k > 1 && less ( k /2 , k)) {
	swap(k , k /2) ;
	k = k /2;
	}
	    }
	    
	    private void swap(int i, int j) {
	        String temp = heap[i];
	        heap[i] = heap[j];
	        heap[j] = temp;
	    }

	    private void sink(int k) {
	     // add definition here
	while (2* k <= n) { //n is the Heap size
	int j = 2* k;
	if (j<n && less (j , j +1) ) j ++;
	if (!less(k, j)) break ;
	swap(k, j) ;
	k = j ;
	}
	    }

	   
	    private boolean less(int i, int j) {
	        return heap[i].compareTo(heap[j]) < 0;
	    }
	    
	}

	



